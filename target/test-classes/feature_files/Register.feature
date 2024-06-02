

@TutorialsNinjaRegister
Feature: Register functionality of TutorialsNinja

Background: Trying to remove the repititive step present in all scenarios
Given User navigates to RegisterPage
And User clicks on Continue button

  @MandatoryFields
  Scenario: Register with mandatory fields
  Given User navigates to RegisterPage
    When User enters below mandatory fields
    |firstname 			| yass			|
    |lastname				| ben 				|
    |telephone			| 6666666666 		|
    |password				|Mali$ka15	|
    |confirmpassword| Mali$ka15 	|
    And User selects PrivacyPolicy checkbox
    When User clicks on Continue button
    Then User account gets created successfully


 @AllFields
  Scenario: Register with all fields
  Given User navigates to RegisterPage
    When User enters below all fields
    |firstname 			| yass 			|
    |lastname				|ben 				|
  And User clicks on Continue button
    |confirmpassword| Mali$ka15 	|
    And User selects Yes for newsletter
    And User selects PrivacyPolicy checkbox
    When User clicks on Continue button
    Then User account gets created successfully



  @DuplicateEmail
  Scenario: Register with existing email
  Given User navigates to RegisterPage
    When User enters below all fields with existing email
    |firstname 			| yass 							|
    |lastname				| ben 								|
   And User clicks on Continue button
    |confirmpassword| Mali$ka15					|
    And User selects Yes for newsletter
    And User selects PrivacyPolicy checkbox
    When User clicks on Continue button
    Then User gets warning message of duplicate email  


  @NoFields
  Scenario: Register with no fields
  Given User navigates to RegisterPage
    When User clicks on Continue button
    Then User gets warning message for mandatory fields
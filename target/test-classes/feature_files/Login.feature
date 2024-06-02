#Author: Yasmine Bengana
@TutorialsNinjaLogin
Feature: Login functionality of TutorialsNinja Application

Background: Giving common steps to run before all scenarios
Given user navigates to LoginPage

@ValidCredentials
Scenario: Login with valid credentials
When user enters valid email <email> into email textbox field
And user enters valid password <password> into password textbox field
And user clicks on Login button
Then user is navigated to AccountPage




@InvalidCredentials
Scenario: Login with invalid credentials

When user enters invalid email "benben123@gmail.com" into email textbox field
And user enters invalid password "Mali$ka1566" into password textbox field
And user clicks on Login button
Then user gets warning message about credentials mismatch



@ValidEmailInvalidPassword
Scenario: Login with valid email invalid password 
When user enters valid email "benben@gmail.com" into email textbox field
And user enters invalid password "Mali$ka1566" into password textbox field
And user clicks on Login button
Then user gets warning message about credentials mismatch

@InvalidEmailValidPasswordrd
Scenario: Login with invalid email valid password 

When user enters invalid email "benbenhello55@gmail.com" into email textbox field
And user enters valid password "MAli$ka15" into password textbox field
And user clicks on Login button
Then user gets warning message about credentials mismatch

@NoCredentials
Scenario: Login with no credentials 

And user clicks on Login button
Then user gets warning message about credentials mismatch



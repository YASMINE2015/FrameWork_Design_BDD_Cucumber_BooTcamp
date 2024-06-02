
@TutorialsNinjaCheckout
Feature: Checkout functionality of TutorialsNinja

Background: Trying to remove the repititive step present in all scenarios
Given User navigates to CheckoutPage
And User clicks on Continue button

  @CheckoutWithCheckoutInfo
  Scenario: Checkout with all Checkout info
  Given User navigates to CheckoutPage
    When User enters all Checkout info
    |firstname 			| yass			  |
    |lastname				| ben 				|
    | address1		| 4 linden cir     | 
    |  city        |Rio Grande	  |
    |state        |  New Jersey   |
    
  
    When User clicks on Continue button
    And User selects existing address for Delivery Details 
    And User selects existing address for Delivery Method
    And User selects existing address for Payment Method
    And User selects Privacy Policy checkbox
    When User clicks on confirm Order
    Then User confirms the order and completes the checkout
    
   
  @CheckoutWithNoCheckoutInfo
  Scenario: Checkout with all Checkout info 
    Given User navigates to CheckoutPage
    When User clicks on Continue button
    Then User gets warning message for All Checkout information fields
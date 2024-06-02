@TutorialsNinjaAddToCart
Feature: Add to Cart
  As a user
  I want to add items to my shopping cart
  So that I can purchase them later

  Background:
    Given the user is on the homepage

  Scenario: Add a single item to the cart
    When the user searches for "hp"
    And the user selects the first search result
    And the user adds the item to the cart
    Then the cart should contain 1 item

  Scenario: Add multiple items to the cart
    When the user searches for "hp"
    And the user selects the first search result
    And the user adds the item to the cart
    And the user searches for ""
    And the user selects the first search result
    And the user adds the item to the cart
    Then the cart should contain 2 items

  Scenario: Add an item to the cart and remove it
    When the user searches for "laptop"
    And the user selects the first search result
    And the user adds the item to the cart
    And the user removes the item from the cart
    Then the cart should be empty
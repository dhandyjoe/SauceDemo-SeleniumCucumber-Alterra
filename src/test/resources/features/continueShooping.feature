@Web
Feature: Continue Shopping functionality
  Background:
    Given User input "standard_user" and "secret_sauce"
    And User click button login
    Then Success move to Inventory page
    When User click add to cart in a "add-to-cart-sauce-labs-backpack"
    And User click Cart icon
    And The page will be move to Cart page
    Then User can see the "Sauce Labs Backpack" added in the cart

  Scenario: Continue shopping
    When User click continue shopping button
    And The page will be move to Home page
    And User click add to cart in a "add-to-cart-sauce-labs-bike-light"
    And User click Cart icon
    And The page will be move to Cart page
    Then User can see the "Sauce Labs Bike Light" added in the cart



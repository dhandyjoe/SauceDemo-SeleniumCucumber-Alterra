@Web
Feature: Add to cart
  Background:
    Given User input "standard_user" and "secret_sauce"
    And User click button login
    Then Success move to Inventory page
    When User click add to cart in a "add-to-cart-sauce-labs-backpack"
    And User click Cart icon
    And The page will be move to Cart page
    Then User can see the "Sauce Labs Backpack" added in the cart

  Scenario: Continue shooping
    When User click continue shopping button
    And The page will be move to Home page
    And User choose filter "za"
    And User click add to cart in a "add-to-cart-test.allthethings()-t-shirt-(red)"
    And User click Cart icon
    And The page will be move to Cart page
    And User can see the "Test.allTheThings() T-Shirt (Red)" added in the cart
    And User click Remove Button from "remove-test.allthethings()-t-shirt-(red)"
    And Product is removed
    And User click continue shopping button
    Then Success move to Inventory page

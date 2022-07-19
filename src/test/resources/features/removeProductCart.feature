@Web
Feature: Add to cart
  Background: Added product to cart
    Given User input "standard_user" and "secret_sauce"
    And User click button login
    Then Success move to Inventory page
    When User click add to cart in a "add-to-cart-sauce-labs-backpack"
    And User click Cart icon
    And The page will be move to Cart page
    Then User can see the "Sauce Labs Backpack" added in the cart

  Scenario Outline: Remove from cart
    When User click Remove Button from "<product>"
    Then Product is removed
    Examples:
      |product                    |
      |remove-sauce-labs-backpack |
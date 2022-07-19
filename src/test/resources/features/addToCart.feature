@Web
Feature: Add to cart
  Background:
    Given User input "standard_user" and "secret_sauce"
    And User click button login
    Then Success move to Inventory page

  @Login
  Scenario Outline: Add to Cart
    When User click add to cart in a "<products>"
    And User click Cart icon
    And The page will be move to Cart page
    Then User can see the "<value>" added in the cart
    Examples:
    | products                          | value                   |
    | add-to-cart-sauce-labs-backpack   | Sauce Labs Backpack     |
    | add-to-cart-sauce-labs-bike-light | Sauce Labs Bike Light   |
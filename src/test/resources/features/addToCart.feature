@Web
Feature: Add to cart
  Background:
    Given User input "standard_user" and "secret_sauce"
    And User click button login
    Then User success login

  @Login
  Scenario Outline: Add to Cart
    When User click add to cart in a product
    And User click Cart icon
    And The page will be move to Cart page
    Then User can see the "<value>" added in the cart
    Examples:
    |value  |
    | 4     |
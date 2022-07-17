@Web
Feature: Add to cart
  Background:
    Given User input "standard_user" and "secret_sauce"
    And User click button login
    Then User success login

  @Login
  Scenario: Add to Cart
    When User click add to cart in a product
    And User click Cart icon
    And And the page will be move to Cart page
    Then User can see the product added in the cart

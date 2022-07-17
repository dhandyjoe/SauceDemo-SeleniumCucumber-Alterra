@Web
Feature: Add to cart
  Background: Added product to cart
    Given User input "standard_user" and "secret_sauce"
    And User click button login
    Then User success login
    When User click add to cart in a product
    And User click Cart icon
    And The page will be move to Cart page


  Scenario Outline: Add to Cart
    Then User can see the "<product1>" added in the cart
    When User click Remove Button
    Then Product is removed
    Examples:
      |product1   |
      |  4        |
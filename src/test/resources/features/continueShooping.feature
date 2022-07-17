@Web
Feature: Add to cart
  Background:
    Given User input "standard_user" and "secret_sauce"
    And User click button login
    Then User success login
    When User click add to cart in a product
    And User click Cart icon
    And The page will be move to Cart page

  Scenario Outline: Continue shooping
    Then User can see the "<product1>" added in the cart
    When User click continue shopping button
    And The page will be move to Home page
    And User click add to cart in other product
    And User click Cart icon
    And The page will be move to Cart page
    Then User can see the "<product2>" added in the cart
    Examples:
      |product1   | product2 |
      |  4        | 0        |


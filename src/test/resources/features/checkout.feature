@Web
  Feature: Checkout Item

    Scenario: Checkout Item
      When User input "standard_user" and "secret_sauce"
      And User click button login
      Then User success login
      And User click add to cart
      Then User can see the shopping cart added
      And User click shopping cart
      And User click checkout button
      And User input "first_name" and "last_name" and "43252"
      And User click continue button
      Then User can see checkout overview
      And User click finish button
      Then User can see success checkout

@Web
  Feature: Search Functionality
    Background:
      When User input "standard_user" and "secret_sauce"
      And User click button login
      Then User success login

    Scenario Outline: Search with filter
#      When User click Filter Button
      And User choose filter "<option>"
      Then "<product>" in the first list products
      Examples:
      | option    | product                            |
      | az        | Sauce Labs Backpack                |
      | za        | Test.allTheThings() T-Shirt (Red)  |
      | lohi      | Sauce Labs Onesie                  |
      | hilo      | Sauce Labs Fleece Jacket           |
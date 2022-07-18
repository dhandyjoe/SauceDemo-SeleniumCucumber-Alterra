@Web
  Feature: Search Functionality
    Background:
      When User input "standard_user" and "secret_sauce"
      And User click button login
      Then User success login

    Scenario Outline: Search with filter
#      When User click Filter Button
      And User choose filter "<option>"
      Then "<id>" in the first list products
      Examples:
      | option    | id |
      | az        | 4  |
      | za        | 3  |
      | lohi      | 2  |
      | hilo      | 5  |
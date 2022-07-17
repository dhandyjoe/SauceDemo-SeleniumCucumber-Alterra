@Web
  Feature: Search Functionality
    Background:
      When User input "standard_user" and "secret_sauce"
      And User click button login
      Then User success login

    Scenario Outline: Search with filter
      When User click Filter Button
      And User choose filter "<option>"
      Then "<value>" in the first list products
      Examples:
      | option  | value |
      | 1       | 4     |
      | 2       | 3     |
      | 3       | 2     |
      | 4       | 5     |
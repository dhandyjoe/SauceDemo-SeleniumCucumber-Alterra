@Web
  Feature: Login Functionality
    Scenario Outline: Login Success
      When User input "<username>" and "<password>"
      And User click button login
      Then Success move to Inventory page

      Examples:
        | username        | password        |
        | standard_user   | secret_sauce    |
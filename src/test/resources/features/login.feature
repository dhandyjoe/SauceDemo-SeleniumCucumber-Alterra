@Web
  Feature: Login Functionality
    Scenario Outline: Login Success
      When User input "<username>" and "<password>"
      And User click button login
      Then User success login

      Examples:
        | username        | password        |
        | standard_user   | secret_sauce    |
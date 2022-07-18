@Web
  Feature: Scenario with Background

    Background: Login
      Given User input "standard_user" and "secret_sauce"
      And User click button login
      Then User success login

    @NavigateToFacebook
    Scenario: NavigateToFacebook
      When User scroll to bottom page
      And User click facebook
      And User move to tab
      Then User can validate url title
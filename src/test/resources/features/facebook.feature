@Web
  Feature: Facebook

    Background: Login
      Given User input "standard_user" and "secret_sauce"
      And User click button login
      Then Success move to Inventory page

    @NavigateToFacebook
    Scenario: NavigateToFacebook
      When User scroll to bottom page
      And User click facebook
      And User move to tab
      Then User can validate url title
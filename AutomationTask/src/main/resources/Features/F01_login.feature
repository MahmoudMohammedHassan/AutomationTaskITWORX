Feature: User should be able to login with valid credentials

  Scenario: User can login with valid email and valid password
    When User enters valid email and valid password
    And User clicks the Login button
    Then User could login successfully

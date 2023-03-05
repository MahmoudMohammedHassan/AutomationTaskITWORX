Feature: User can add a new course to his account
  Background: User can login with valid email and valid password
    When User enters valid email and valid password
    And User clicks the Login button
    Then User could login successfully

  Scenario: user can add a new course
    When User navigates to the courses page
    And User Clicks Add Course button
    And user enters course basic info
    And user clicks create button
    Then user should find the created course
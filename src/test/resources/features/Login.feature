@login
Feature: As a user I should able to login with different user credentials

  Scenario: Login as a store manager
    Given user is on the login page
    When user puts the correct credentials
    Then user should able to see the landing page
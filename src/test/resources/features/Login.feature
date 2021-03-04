Feature: As a user I should able to login with different user credentials

  Scenario: Login as a store manager
    Given I am on the login page
    When I put the correct credentials
    Then I should able to see the landing page
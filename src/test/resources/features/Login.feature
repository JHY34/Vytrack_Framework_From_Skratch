@login
Feature: As a user I should able to login with different user credentials

  Scenario: Login as a store manager
    Given user is on the login page
    When user puts the correct credentials
    Then user should able to see the landing page


  @parametrized_test
  Scenario: Parametrized login
    Given user is on the login page
    When user logs in as a "driver"
    Then user should able to see the landing page
  # "driver" -> is a parameter.
  # "" allows us to do test parametrization which helps us to use different data with the same test
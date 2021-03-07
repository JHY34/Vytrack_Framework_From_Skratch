@CreateACar
Feature: Create a car

  Background:
    Given user is on the login page
    When user puts the correct credentials
    Then user should able to see the landing page

  Scenario:
    Given user in on the Dashboard page
    And user clicks on Fleet and Vehicles
    And user clicks on Create Car button to navigate to Create Car page
    When user fill the necessary boxes
    And user clicks on Save and Close button
    Then should able to create a car

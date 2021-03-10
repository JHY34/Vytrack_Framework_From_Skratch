@create_event
Feature: As user, I want to be able to create calender events.

  Scenario: Create calender event with default time
    Given user is on the login page
    And user logs in as "store manager"
    And user should able to see the landing page
    When user navigates to the "Calender Events" page
    And user clicks on create calender event button
    And user adds new calender event information
        |Title      |Graduation Party!    |
        |Description|Everybody is invited.|
    And user clicks on Save and Close button

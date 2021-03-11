package com.vytrack.step_definitions;

import com.vytrack.pages.CreateCalenderEventPage;
import com.vytrack.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Map;

public class CreateCalendarEvent_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    CreateCalenderEventPage createCalenderEventPage = new CreateCalenderEventPage();

    @Given("user logs in as {string}")
    public void user_logs_in_as(String string) {
        loginPage.login(string);
    }


    @When("user navigates to {string} and {string} page")
    public void user_navigates_to_and_page(String string, String string2) {
        loginPage.navigateTo(string, string2);
    }

    @When("user clicks on create calender event button")
    public void user_clicks_on_create_calender_event_button() {
        createCalenderEventPage.clickOnCreateCalenderEventBtn();
    }


    @When("user adds new calender event information")
    public void user_adds_new_calender_event_information(Map<String, String> dataTable) {
        createCalenderEventPage.enterTitle(dataTable.get("Title"));
        createCalenderEventPage.enterDescription(dataTable.get("Description"));
        createCalenderEventPage.clickOnCreateCalenderEventBtn();

    }



}

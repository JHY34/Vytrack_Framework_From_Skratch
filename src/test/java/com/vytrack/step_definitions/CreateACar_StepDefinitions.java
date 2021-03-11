package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.CreateACar;
import com.vytrack.pages.CreateCalenderEventPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateACar_StepDefinitions {

    CreateACar createACar = new CreateACar();
    CreateCalenderEventPage createCalenderEventPage = new CreateCalenderEventPage();


    @Given("user in on the Dashboard page")
    public void user_in_on_the_dashboard_page() {
        String expectedTitle = "Dashboard";

        String actualTitle = createACar.getDashboardTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }



    @Given("user clicks on Fleet and Vehicles")
    public void user_clicks_on_fleet_and_vehicles() {
        createACar.clickFleetModule();

    }
    @Given("user clicks on Create Car button to navigate to Create Car page")
    public void user_clicks_on_create_car_button_to_navigate_to_create_car_page() {

    }
    @When("user fill the necessary boxes")
    public void user_fill_the_necessary_boxes() {

    }

    @When("user clicks on Save and Close button")
    public void user_clicks_on_save_and_close_button() {
        createCalenderEventPage.clickOnCreateCalenderEventBtn();

    }

    @Then("should able to create a car")
    public void should_able_to_create_a_car() {

    }



}

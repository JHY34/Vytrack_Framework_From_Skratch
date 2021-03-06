package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utils.ConfigurationReader;
import com.vytrack.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("http://qa1.vytrack.com");

        Driver.getDriver().get("http://qa1.vytrack.com");

    }



    @When("user puts the correct credentials")
    public void user_puts_the_correct_credentials() {

//        driver.findElement(By.id("prependedInput")).sendKeys("salesmanager110");
//        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" , Keys.ENTER);


        //loginPage.login(ConfigurationReader.getProperty("storemanager.username"), ConfigurationReader.getProperty("password"));
        // Lets use the overloaded login() method as seen below
        loginPage.login();

    }


    @Then("user should able to see the landing page")
    public void user_should_able_to_see_the_landing_page() throws InterruptedException {

        String expected = "Dashboard";
        Thread.sleep(3000);
       // String actual = Driver.getDriver().findElement(By.className("oro-subtitle")).getText();

        String actual = loginPage.getPageSubTitle();

        Assert.assertEquals("Title is not verified!",expected, actual );


    }


    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String string) {
        loginPage.login(string);
    }



    @When("user logs in with {string} username and {string} password")
    public void user_logs_in_with_username_and_password(String string, String string2) {
        //loginPage.login("storemanager85", "InvalidPassword");
        loginPage.login(string, string2);

    }


    @Then("user verifies that {string} message is displayed.")
    public void user_verifies_that_message_is_displayed(String string) {
        //loginPage.verifyLoginAlert();
       Assert.assertEquals( string, loginPage.getErrorMessage() );


    }



}

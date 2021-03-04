package com.vytrack.step_definitions;

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

    WebDriver driver;

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://qa1.vytrack.com");

    }



    @When("user puts the correct credentials")
    public void user_puts_the_correct_credentials() {

        driver.findElement(By.id("prependedInput")).sendKeys("salesmanager110");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" , Keys.ENTER);

    }


    @Then("user should able to see the landing page")
    public void user_should_able_to_see_the_landing_page() throws InterruptedException {

        String expected = "Dashboard";
        Thread.sleep(2000);
        String actual = driver.findElement(By.className("oro-subtitle")).getText();
        Assert.assertEquals("Title is not verified!",expected, actual );
        driver.quit();

    }

}

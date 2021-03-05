package com.vytrack.pages;

import com.vytrack.utils.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    // This class is going to have ALL common methods and locators for the LoginPage

    // Below locators are private not to use them in the step_definitions to avoid conflicts that comes from locators.
    // Since locators are private, then we can create public methods and use only these public methods in the step_definitions classes

    @FindBy (id = "prependedInput")
    private WebElement usernameInput;

    @FindBy (id = "prependedInput2")
    private WebElement passwordInput;

    @FindBy (id = "")
    private WebElement loginBox;


    public void login (String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password , Keys.ENTER);
    }

    // Lets overload the login() method without having any credentials
    public void login() {
        String username = ConfigurationReader.getProperty("storemanager.username");
        String password = ConfigurationReader.getProperty("password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password, Keys.ENTER);
    }

    public void login (String role) {
        if (role.equalsIgnoreCase("driver")) {
            String username = ConfigurationReader.getProperty("driver.username");
            String password = ConfigurationReader.getProperty("password");
            usernameInput.sendKeys(username);
            passwordInput.sendKeys(password, Keys.ENTER);
        }
    }



}

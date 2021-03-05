package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    // This class is going to have ALL common methods and locators

    public BasePage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (className = "oro-subtitle")
    protected WebElement pageSubTitle;

    public String getPageSubTitle () {
        return pageSubTitle.getText();
    }

}

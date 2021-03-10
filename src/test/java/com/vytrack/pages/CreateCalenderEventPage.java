package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalenderEventPage {

    public CreateCalenderEventPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy ()
    private WebElement createCalendarEventButton;

    @FindBy ()
    private WebElement titleInputBox;

    @FindBy ()
    private WebElement descriptionInputBox;


    public void clickOnCreateCalenderEventBtn () {
        createCalendarEventButton.click();
    }

    public void enterTitle (String title) {
        titleInputBox.clear();
        titleInputBox.sendKeys(title);
    }

    public void enterDescription (String description) {
        descriptionInputBox.clear();
        descriptionInputBox.sendKeys(description);
    }

}

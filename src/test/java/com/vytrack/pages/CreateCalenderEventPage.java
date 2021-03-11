package com.vytrack.pages;

import com.vytrack.utils.BrowserUtilities;
import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCalenderEventPage {

    public CreateCalenderEventPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "[title='Create Calendar event']")
    private WebElement createCalendarEventButton;

    @FindBy (name = "oro_calendar_event_form[title]")
    private WebElement titleInputBox;

    @FindBy (id = "tinymce")
    private WebElement descriptionInputBox;


    public void clickOnCreateCalenderEventBtn () {
        createCalendarEventButton.click();
    }

    public void enterTitle (String title) {
        BrowserUtilities.enterText(titleInputBox,title);
    }

    public void enterDescription (String description) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

        // to exit from all iFrames
        Driver.getDriver().switchTo().defaultContent();

        // wait for frame and switch to it
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));

        // enter text
        BrowserUtilities.enterText(descriptionInputBox, description);

        // exit from the Frame
        Driver.getDriver().switchTo().defaultContent();
    }

}

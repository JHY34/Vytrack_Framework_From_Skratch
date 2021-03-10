package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CreateACar extends BasePage {

    @FindBy (xpath = "//*[@id='container']/div[2]/div[1]/div/div/div[1]/div/h1")
    protected WebElement dashboardTitle;

    public String getDashboardTitle () {
        return dashboardTitle.getText();
    }

    @FindBy (className = "dropdown-level-1")
    private WebElement vehiclesPage;

   public void clickFleetModule () {
       vehiclesPage.click();
   }




}

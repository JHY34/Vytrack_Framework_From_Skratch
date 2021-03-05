package com.vytrack.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    // Singleton Design Pattern is used in this Driver class

    private Driver () { }


    private static WebDriver driver;


    public static WebDriver getDriver () {

        if (driver == null) {
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new RuntimeException ("No such a browser yet!");
            }
        }
        return driver;
    }


    public static void closeDriver () {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }



}

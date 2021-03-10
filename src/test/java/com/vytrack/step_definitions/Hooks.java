package com.vytrack.step_definitions;

// this is the class to complete @BeforeAll, @AfterAll, @BeforeE

import com.vytrack.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
        // this is hook after
        // it runs automatically after every test regardless test status
       // Driver.closeDriver();
    }



}

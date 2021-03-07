package com.vytrack.step_definitions;

// this is the class to complete @BeforeAll, @AfterAll, @BeforeE

import com.vytrack.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
        // this is hook after
        // it runs automatically after every test regardless test status
        Driver.closeDriver();
    }



}

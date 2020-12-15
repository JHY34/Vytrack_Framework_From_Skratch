package com.vytrack.runners;

// This is the class project will be triggered

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {}, // reports & re-run
        features = {},
        glue = {},
        dryRun = true,
        tags = "",
        publish = true




)

public class Project_Runner {


}

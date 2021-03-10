package com.vytrack.runners;

// This is the class project will be triggered
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {}, // reports & re-run
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@CreateACar" ,
        publish = true

)

public class Project_Runner {

}

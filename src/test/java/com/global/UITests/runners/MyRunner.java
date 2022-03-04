package com.global.UITests.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/global/UITests/step_definitions",
        dryRun = false,
        tags = "@s1"
)

public class MyRunner {
}

package com.TestCompany.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "src/test/resources/features",
                glue = "com/Bitrix24/StepDefinitions",
                plugin = {"html:target/cucumber-report.html",
                        "json:target/cucumber-report.json"},
                dryRun = false
                // tags = "@Alpha and @Beta" //or

        )

public class PracticeRunner {
}

package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/HtmlReports","json:target/JSONReports/report.json"},
		features="src/test/resources/features/",
		glue= {"com.stepDefinitions","com.Admin.stepDefinition"}, monochrome = true, dryRun = true

		)

public class TestRunner {

}

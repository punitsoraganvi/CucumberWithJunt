package com.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		//usage and pretty
		plugin = { "usage", "html:target/cucumber-reports/rpusage.html","json:target/cucumber-reports/rpusage2.json",
				"junit:target/cucumber-reports/rpusage3.xml", },
		monochrome = true, 
		features = {"src/test/resources/features/facebookLogin.feature" },
		glue = "com.stepdeffinations")

public class FBRunnerTest {

}
 
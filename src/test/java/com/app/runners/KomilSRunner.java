package com.app.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { 
		"pretty", 
		"html:target/cucumber-report",
		"json:target/cucumber.json"
		}, 
	tags = "@temp",
	features = {
			"src/test/resources/com/app/features/tech_lead.feature" 
			}, 
	glue = "com/app/step_definitions/"
	, dryRun = false
	)
public class KomilSRunner {
	
}

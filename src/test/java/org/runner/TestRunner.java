package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\resources\\With&WithoutHeader.feature",

				glue = "org.stepdefinition",
				dryRun = !true,
				
				monochrome = true,
				snippets = SnippetType.CAMELCASE,
				strict = true,
				//tags = {"@smoke,@sanity"}
				plugin = {"pretty",
						   "html:All_Reports\\HTML",
						   "junit:All_Reports\\Junit\\junit.xml",
						   "json:All_Reports\\Json\\json.json",
						   "rerun:ReRunFeatureFile\\rerun.txt"
						 }
		)

public class TestRunner {
	
	@AfterClass
	
	public static void report() {
		JvmReport.report("C:\\Users\\Jyothi Sai\\OneDrive\\Desktop\\Selenium\\Project_For_LiveScection\\All_Reports\\Json\\json.json");
	}
	
}

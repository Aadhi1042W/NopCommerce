package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = { "src\\test\\java\\com\\Features\\Nop_Commerce.feature" }, glue = { "com.StepDef",
				"com.Hooks" }, dryRun = false, publish = false, tags = ("@Smoke or @Regression or @Sanity"), plugin = {
						"pretty", "html:HTMLReports/NopCommerce.html", "json:JsonReports/NopCommerceJS.json",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }

)

public class Nop_Commerce_TestRunner {

}

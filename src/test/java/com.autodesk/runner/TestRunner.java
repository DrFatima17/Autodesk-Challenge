package com.autodesk.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"com.autodesk.stepdefinitions", "com.autodesk.hooks"},
        plugin = {"pretty", "html:target/Autodesk-report-final.html",
                "rerun:target/failed_scenarios.txt",
                "json:target/Autodesk-report.json",
                "me.jvt.cucumber.report.PrettyReports:target/Autodesk-report",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false
        //tags= "@smoke"

)
public class TestRunner {
}

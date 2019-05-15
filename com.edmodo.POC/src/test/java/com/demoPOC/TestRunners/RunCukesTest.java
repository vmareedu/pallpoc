package com.demoPOC.TestRunners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/TestScenarios/edmodo.feature",glue={""},tags={"@EndtoEnd"},monochrome = true, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/Sprint1.html","html:target/cucumber-html-report"}
		)
 
public class RunCukesTest {
		
	@AfterClass
    public static void setup() {
        Reporter.loadXMLConfig(new File("./Configuration/extent-config.xml"));
        Reporter.setTestRunnerOutput("Edmodo Test Execution Summary ");
    }
 
}
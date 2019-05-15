package com.demoPOC.bdd;

import java.io.IOException;

import com.cucumber.listener.Reporter;
import com.demoPOC.bdd.BaseTest;
import com.demoPOC.helpers.Utils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.model.Result;

public class Hooks extends BaseTest {

	@Before
	// @Parameters("browser") Launch the Browser
	public void setUp() throws Exception {
		// Launch the specific Browser type
		init();

	}

	// Take the Screenshot for the failures and exit the Testcase & close
	// Browser
	@After
	public void afterHook(Scenario scenario) throws IOException {
		try {
			if (scenario.getStatus().equals(Result.FAILED)) {

				String path = Utils.CaptureScreenshot(scenario.getName());
				// Add a step to take a screenshot and save it in a file
				Reporter.addScreenCaptureFromPath(path);

			}

			driver.quit();
		} catch (Exception e) {
			System.out.println("\nLog Message::@AfterMethod: Exception caught" + e.getMessage());

		}
	}


	
}

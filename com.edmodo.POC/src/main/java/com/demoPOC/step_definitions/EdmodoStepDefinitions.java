package com.demoPOC.step_definitions;

import org.testng.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.cucumber.listener.Reporter;

import com.demoPOC.basePageFactory.HomePage;
import com.demoPOC.bdd.BaseTest;

import com.demoPOC.helpers.PropertyReader;
import com.demoPOC.helpers.Utils;

public class EdmodoStepDefinitions extends BaseTest {
	// Load the Page Object Class Login
	HomePage home = PageFactory.initElements(driver, HomePage.class);

	@Given("^Launch the edmondo website$")
	public void Launch_the_edmondo_website() throws Exception {

		try {
			home.launchApp();

		} catch (Exception e) {
			// TODO Auto-generated catch block

			Reporter.addStepLog("Not Logged in to Dealer Portal " + e.getMessage().toString());
			e.printStackTrace();
		}

	}

	@And("^Search for course in primary search bar$")
	public void Search_for_course_in_primary_search_bar() throws Exception {
		home.searchforCourse();
		Reporter.addStepLog("Click on Tire Search ");

	}

	@Then("^User should see the Course Name$")
	public void User_should_see_the_Course_Name() throws Exception {
		Assert.assertTrue(home.VerifySearchedCourse());
		Reporter.addStepLog("Verify the course name ");
		Utils.CaptureScreenshot("VerifyCourseName");

	}

	@When("^User click on the course it should navigate product page$")
	public void User_click_on_the_course_it_should_navigate_product_page() throws Exception {
		home.ClickOnProductLink();
		Reporter.addStepLog("Click on Product link ");
		home.VerifyProductLandingPage();
		Reporter.addStepLog("Verify Product landing page ");
		Utils.CaptureScreenshot("Verify the product landing page");

	}

	@When("^seats avaliable for the selected course$")
	public void no_seats_avaliable_for_the_selected_course() throws Exception {

		home.getEnrollMessage();
		Reporter.addStepLog("Verify No Seats avaliable ");

	}

	@Then("^system should display enroll button enabled$")
	public void system_should_display_enroll_button_disabled() throws Exception {
		Assert.assertTrue(home.VerifyEnrollButton());

		Reporter.addStepLog("Verify Enroll Button ");
		Utils.CaptureScreenshot("Verify the Enroll button");

	}

	@Then("^verify the header tabs$")
	public void verify_the_header_tabs() throws Exception {

		home.verifyHeaderTabs();

		Reporter.addStepLog("Verify Meata header tabs displayed in product page ");
		Utils.CaptureScreenshot("Header tab");

	}

}

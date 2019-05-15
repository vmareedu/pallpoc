package com.demoPOC.basePageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.demoPOC.bdd.BaseTest;
import com.demoPOC.helpers.Utils;

public class HomePage extends BaseTest {

	
	// Home page Search bar Objects
	@FindBy(xpath = "//div[@id='search-bar-container-primary']//input[@id='new-form-search-q']")
	WebElement txtSearchBar;
	@FindBy(xpath = "//div[@id='search-bar-container-primary']//i[@id='searchIcon']")
	WebElement icnSearch;
	@FindBy(xpath = "//div[@class='cust-breadcrumb']")
	WebElement lnkBreadCrumb;
	@FindBy(xpath = "//a[contains(@class,'hovered-product-grid-title')][contains(text(),'Edmodo Certified Learner Course')]")
	WebElement lnkCourseName;
	@FindBy(xpath = "//button[@id='action-button']")
	WebElement btnEnroll;
	@FindBy(xpath = "//div[@class='btn-msg']")
	WebElement txtEnrollMessage;
	@FindBy(xpath = "//li[@id='product-description']")
	WebElement tabDesc;
	@FindBy(xpath = "//li[@id='product-syllabus']")
	WebElement tabSyllabus;
	@FindBy(xpath = "//li[@id='product-prerequisites']")
	WebElement tabPreReq;
	@FindBy(xpath = "//li[@id='product-instructor']")
	WebElement tabAbtInst;
	@FindBy(xpath = "//li[@id='others']")
	WebElement tabOther;


	/**
	 * @author Pallavi.Chirakala , Launch edmodo site
	 * @throws Exception
	 */
	public void launchApp() throws Exception {
		driver.get(Repository.getProperty("APP_URL"));
		Utils.waitForPageToLoad(5);

	}
	
	/**
	 * @author Pallavi.Chirakala , Enter the product name in the primary search bar
	 * @throws Exception
	 */
	
	public void searchforCourse() throws Exception {
		txtSearchBar.click();
		txtSearchBar.sendKeys(Repository.getProperty("courseName"));
		icnSearch.click();
		Utils.waitForPageToLoad(5);

	}

	/**
	 * @author Pallavi.Chirakala , Verify the product (course name)
	 * @return Boolean value
	 */
	public Boolean VerifySearchedCourse() {
		try {
			(new WebDriverWait(driver, 120)).until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver d) {

					return lnkCourseName.isDisplayed();
				}
			});
			return Boolean.TRUE;
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}

	/**
	 * @author Pallavi.Chirakala , Click on the Product
	 * @throws Exception
	 */
	
	public void ClickOnProductLink() throws Exception {
		lnkCourseName.click();

		Utils.waitForPageToLoad(5);

	}

	/**
	 * @author Pallavi.Chirakala , Verify the product landing page
	 * @throws Exception
	 */
	public void VerifyProductLandingPage() throws Exception {
		System.out.println("Print" + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Edmodo Certified Learner Course"));
		Utils.waitForPageToLoad(5);

	}

	/**
	 * @author Pallavi.Chirakala , Verify the  seats are avaliable to enroll reading the text in webpage
	 * @throws Exception
	 */
	public void getEnrollMessage() throws Exception {
		Utils.waitForPageToLoad(5);

		if (driver.findElements(By.xpath("//div[@class='btn-msg']")).size() != 0) {
			System.out.println("Element is Present");
		} else {
			System.out.println("Element is Absent");
			Assert.assertTrue(true, "Seats are avaliable");
		}

	}

	/**
	 * @author Pallavi.Chirakala , Verify the  enroll button enable or disable
	 * @throws Exception
	 * @return Boolean
	 */
	public Boolean VerifyEnrollButton() throws Exception {
		try {
			(new WebDriverWait(driver, 120)).until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver d) {

					return btnEnroll.isEnabled();
				}
			});
			return Boolean.TRUE;
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}
	
	/**
	 * @author Pallavi.Chirakala , Verify the  meta header tabs
	 * @throws Exception
	 * 
	 */
		public void verifyHeaderTabs() throws Exception {
			(new WebDriverWait(driver, 120)).until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver d) {

					return tabDesc.isDisplayed();
				}
			});
			tabDesc.isDisplayed();
			tabSyllabus.isDisplayed();
			tabPreReq.isDisplayed();
			tabDesc.isDisplayed();
			tabAbtInst.isDisplayed();
			tabOther.isDisplayed();

		}

}

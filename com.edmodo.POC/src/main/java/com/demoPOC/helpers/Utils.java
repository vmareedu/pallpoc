package com.demoPOC.helpers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.demoPOC.bdd.BaseTest;

public class Utils {

	public static WebDriver driver;

	public static Properties Repository = new Properties();

	static WebDriverWait wait;

	/**
	 * This method initialize browser object
	 * 
	 * @param browser
	 * @return browser driver
	 * @throws MalformedURLException
	 */
	public static WebDriver selectBrowser(String browser) throws Exception {
		if (browser.equals("firefox") || browser.equals("FIREFOX")) {
			System.setProperty("webdriver.gecko.driver", BaseTest.getFirefoxPath());
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			return driver;
		} else if (browser.equals("chrome") || browser.equals("CHROME")) {
			System.out.println("chrome browser");
			System.setProperty("webdriver.chrome.driver", BaseTest.getChromePath());
			driver = new ChromeDriver();

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			return driver;
		} else if (browser.equals("ie") || browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", BaseTest.getIEPath());
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
		} else if (browser.equals("safari") || browser.equals("SAFARI")) {
			WebDriver driver = new SafariDriver();
			driver.manage().window().maximize();
			return driver;
		}
		return null;
	}

	
	

	public static void waitForPageToLoad(long timeOutInSeconds) {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		try {
			System.out.println("Waiting for page to load...");
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			wait.until(expectation);
		} catch (Throwable error) {
			System.out.println(
					"Timeout waiting for Page Load Request to complete after " + timeOutInSeconds + " seconds");
			Assert.assertTrue(false, "Timeout waiting for Page Load Request to complete.");

		}
	}

	

	public static boolean isTextPresent(String text) {
		try {
			boolean b = driver.getPageSource().contains(text);
			return b;
		} catch (Exception e) {
			return false;
		}
	}

	

	public static String CaptureScreenshot(String Screenshotname) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		System.out.println("Source Path" + src);
		String destination = "../Screenshots/" + Screenshotname + System.currentTimeMillis() + ".PNG";

		try {
			FileUtils.copyFile(src, new File("./Screenshots/" + Screenshotname + System.currentTimeMillis() + ".PNG"));
			System.out.println("Screenshot copied to destination Screenshots folder Sucessfully" + destination);
		} catch (IOException e) {
			System.out.println("Failed to take Screenshot" + e.getMessage());

		}
		return destination;
	}

	// Close the Browser
	public static void closeBrowser() {
		driver.quit();
	}



	public static void KillChromeBrowsers() throws Exception {
		Runtime.getRuntime().exec("taskkill /F /IM Chrome.exe");
	}

}
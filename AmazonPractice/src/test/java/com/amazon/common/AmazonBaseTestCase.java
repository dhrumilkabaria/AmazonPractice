package com.amazon.common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.amazon.pages.HomePage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class AmazonBaseTestCase extends WebDriverTestCase {

	@BeforeSuite
	public void signIn()
	{
		getDriver().get("/");
		getDriver().manage().window().maximize();
	}
	
	@AfterSuite
	public void tearDown()
	{
		getDriver().quit();
	}
	
}

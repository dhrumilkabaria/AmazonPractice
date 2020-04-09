package com.amazon.common;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class AmazonBaseTestCase extends WebDriverTestCase {

	@BeforeMethod(alwaysRun = true)
	public void signIn()
	{
		getDriver().get("/");
		getDriver().manage().window().maximize();
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		getDriver().quit();
		
	}
	
	
	
}

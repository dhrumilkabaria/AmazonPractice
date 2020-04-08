package com.amazon.common;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class AmazonBaseTestCase extends WebDriverTestCase {

	@BeforeMethod
	public void signIn()
	{
		getDriver().get("/");
		getDriver().manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
		
	}
	
	
	
}

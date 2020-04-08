package com.amazon.common;

import org.testng.annotations.BeforeSuite;

import com.amazon.pages.HomePage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class AmazonBaseTestCase extends WebDriverTestCase {

	@BeforeSuite
	public void signIn() throws InterruptedException
	{
		getDriver().get("/");
		getDriver().manage().window().maximize();
		HomePage homePage = new HomePage();
		homePage.doLogin(getProps().getString("user.username"), getProps().getString("user.password"));
		Thread.sleep(10000);
	}
	
}

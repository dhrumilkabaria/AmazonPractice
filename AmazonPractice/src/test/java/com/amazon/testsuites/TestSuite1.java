package com.amazon.testsuites;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.common.AmazonBaseTestCase;
import com.amazon.pages.HomePage;

public class TestSuite1 extends AmazonBaseTestCase{
	
	HomePage homePage;
	
	@BeforeTest
	public void initializingPages() {
		homePage = new HomePage();
	}
	
	
	@Test
	public void verifyLogoInHeaderAfterLogin()
	{
		homePage.getAmazonLogo().verifyVisible();
	}

}

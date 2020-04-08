package com.amazon.utils;

import java.util.Set;

import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;

public class AmazonUtility {
	
	public static void switchToNewWindow() {
		QAFExtendedWebDriver driver = new WebDriverTestBase().getDriver();
		String currentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String window : windowHandles) {
			if (!window.equals(currentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
	}
}

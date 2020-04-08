package com.amazon.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class LoginPage extends WebDriverBaseTestPage<WebDriverTestPage>{

	@FindBy(locator = "loginPage.emailOrPhoneNumberTextBox.textbox")
	private QAFWebElement emailOrPhoneNumberTextBox;
	public QAFWebElement getEmailOrPhoneNumberTextBox() {
		return emailOrPhoneNumberTextBox;
	}
	
	@FindBy(locator = "loginPage.continueButton.button")
	private QAFWebElement continueButton;
	public QAFWebElement getContinueButton() {
		return continueButton;
	}

	@FindBy(locator = "loginPage.passwordTextBox.textbox")
	private QAFWebElement passwordTextBox;
	public QAFWebElement getPasswordTextBox() {
		return passwordTextBox;
	}
	
	@FindBy(locator = "loginPage.loginButton.button")
	private QAFWebElement loginButton;
	public QAFWebElement getLoginButton() {
		return loginButton;
	}

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("/");
	}

}

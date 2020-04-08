package com.amazon.pages;

import org.openqa.selenium.interactions.Actions;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HomePage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "homepage.signinMenu.link")
	private QAFWebElement signinMenu;
	public QAFWebElement getSigninMenu() {
		return signinMenu;
	}
	
	@FindBy(locator = "homepage.signinButton.link")
	private QAFWebElement signinButton;
	public QAFWebElement getSigninButton() {
		return signinButton;
	}

	@FindBy(locator = "homepage.amazonLogo.link")
	private QAFWebElement amazonLogo;
	public QAFWebElement getAmazonLogo() {
		return amazonLogo;
	}
	
	public void doLogin(String username, String password) {
		Actions action = new Actions(driver);
		action.moveToElement(this.getSigninMenu());
		//homePage.getSigninButton().click();
		this.getSigninMenu().click();
		LoginPage loginPage = new LoginPage();
		loginPage.getEmailOrPhoneNumberTextBox().sendKeys(username);
		loginPage.getContinueButton().click();
		loginPage.getPasswordTextBox().sendKeys(password);
		loginPage.getLoginButton().click();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("/");
		driver.manage().window().maximize();
	}

}

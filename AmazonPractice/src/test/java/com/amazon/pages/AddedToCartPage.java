package com.amazon.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.annotations.PageIdentifier;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class AddedToCartPage extends WebDriverBaseTestPage<WebDriverTestPage>{

	@FindBy(locator = "addedToCartPage.addedToCartMessage.header")
	private QAFWebElement addedToCartMessage;
	public QAFWebElement getAddedToCartMessage() {
		return addedToCartMessage;
	}
	
	@PageIdentifier
	@FindBy(locator = "addedToCartPage.proceedToBuyButton.button")
	private QAFWebElement proceedToBuyButton;
	public QAFWebElement getProceedToBuyButton() {
		return proceedToBuyButton;
	}
	
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		driver.get("/");
		
	}

}

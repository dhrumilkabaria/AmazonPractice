package com.amazon.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class ProductDetailsPage extends WebDriverBaseTestPage<WebDriverTestPage>{

	
	@FindBy(locator = "productDetailsPage.productName.text")
	private QAFWebElement productName;
	public QAFWebElement getProductName() {
		return productName;
	}
	
	@FindBy(locator = "productDetailsPage.addToCartButton.button")
	private QAFWebElement addToCartButton;
	public QAFWebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		driver.get("/");
		
	}

}

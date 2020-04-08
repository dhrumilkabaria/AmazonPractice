package com.amazon.components;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class SearchedProductComponent extends QAFWebComponent{

	public SearchedProductComponent(String locator) {
		super(locator);
	}
	
	@FindBy(locator = "searchResultPage.productName.text")
	private QAFWebElement productName;
	public QAFWebElement getProductName() {
		return productName;
	}

}

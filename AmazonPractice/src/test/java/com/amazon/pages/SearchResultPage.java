package com.amazon.pages;

import java.util.List;

import com.amazon.components.SearchedProductComponent;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.annotations.PageIdentifier;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class SearchResultPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@PageIdentifier
	@FindBy(locator = "searchResultsPage.searchResultsPanel.span")
	private QAFWebElement searchPanel;
	public QAFWebElement getSearchPanel() {
		return searchPanel;
	}
	
	@FindBy(locator = "searchResultsPage.searchedProducts.components")
	private List<SearchedProductComponent> searchedProducts;
	public List<SearchedProductComponent> getListOfSearchedProducts(){
		return searchedProducts;
	}
	
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("/");
	}

}

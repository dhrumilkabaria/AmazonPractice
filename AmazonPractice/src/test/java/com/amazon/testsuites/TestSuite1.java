package com.amazon.testsuites;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.amazon.common.AmazonBaseTestCase;
import com.amazon.components.SearchedProductComponent;
import com.amazon.pages.HomePage;
import com.amazon.pages.ProductDetailsPage;
import com.amazon.pages.SearchResultPage;
import com.amazon.utils.AmazonUtility;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;

public class TestSuite1 extends AmazonBaseTestCase{
	
	@Test(groups = "logoVerification")
	public void verifyLogoInHeaderAfterLogin()
	{
		HomePage homePage = new HomePage();
		homePage.getAmazonLogo().verifyVisible();
	}
	
	@QAFDataProvider(key = "searchItems.category1.item1")
	@Test(groups ="category1")
	public void searchCategory1AndSelectItem(Map<String, String> data)
	{
		HomePage homePage = new HomePage();
		homePage.getSearchTextBox().sendKeys(data.get("name"));
		homePage.getSearchIcon().click();
		
		SearchResultPage searchResultPage = new SearchResultPage();
		searchResultPage.waitForPageToLoad();
		searchResultPage.getSearchPanel().verifyVisible();
		
		List<SearchedProductComponent> listOfSearchedProducts = searchResultPage.getListOfSearchedProducts();
		
		String productNameInSearchResults = listOfSearchedProducts.get(2).getProductName().getText();
		verifyTrue(productNameInSearchResults.contains(data.get("name")), "3rd product in the search results doesn't contain the searched keyword '"+data.get("name")+"'", "3rd product in the search results contains the searched keyword '"+data.get("name")+"'");
		
		listOfSearchedProducts.get(2).getProductName().click();
		AmazonUtility.switchToNewWindow();
		
		ProductDetailsPage productDetailsPage = new ProductDetailsPage();
		String productNameOnDetailsPage = productDetailsPage.getProductName().getText();
		verifyTrue(productNameInSearchResults.equals(productNameOnDetailsPage), "Product name in details page doesn't match with product name in search results page", "Product name in details page doesn't match with product name in search results page");
	}
	
	@QAFDataProvider(key = "searchItems.category2.item1")
	@Test(groups ="category2")
	public void searchCategory2AndSelectItem(Map<String, String> data)
	{
		HomePage homePage = new HomePage();
		homePage.getSearchTextBox().sendKeys(data.get("name"));
		homePage.getSearchIcon().click();
		
		SearchResultPage searchResultPage = new SearchResultPage();
		searchResultPage.waitForPageToLoad();
		searchResultPage.getSearchPanel().verifyVisible();
		
		List<SearchedProductComponent> listOfSearchedProducts = searchResultPage.getListOfSearchedProducts();
		
		String productNameInSearchResults = listOfSearchedProducts.get(2).getProductName().getText();
		//verifyTrue(productNameInSearchResults.contains(data.get("name")), "3rd product in the search results doesn't contain the searched keyword '"+data.get("name")+"'", "3rd product in the search results contains the searched keyword '"+data.get("name")+"'");
		
		listOfSearchedProducts.get(2).getProductName().click();
		AmazonUtility.switchToNewWindow();
		
		ProductDetailsPage productDetailsPage = new ProductDetailsPage();
		String productNameOnDetailsPage = productDetailsPage.getProductName().getText();
		verifyTrue(productNameInSearchResults.equals(productNameOnDetailsPage), "Product name in details page doesn't match with product name in search results page", "Product name in details page doesn't match with product name in search results page");
	}
	
	@QAFDataProvider(key = "searchItems.category3.item1")
	@Test(groups ="category3")
	public void searchCategory3AndSelectItem(Map<String, String> data)
	{
		HomePage homePage = new HomePage();
		homePage.getSearchTextBox().sendKeys(data.get("name"));
		homePage.getSearchIcon().click();
		
		SearchResultPage searchResultPage = new SearchResultPage();
		searchResultPage.waitForPageToLoad();
		searchResultPage.getSearchPanel().verifyVisible();
		
		List<SearchedProductComponent> listOfSearchedProducts = searchResultPage.getListOfSearchedProducts();
		
		String productNameInSearchResults = listOfSearchedProducts.get(2).getProductName().getText();
		//verifyTrue(productNameInSearchResults.contains(data.get("name")), "3rd product in the search results doesn't contain the searched keyword '"+data.get("name")+"'", "3rd product in the search results contains the searched keyword '"+data.get("name")+"'");
		
		listOfSearchedProducts.get(2).getProductName().click();
		AmazonUtility.switchToNewWindow();
		
		ProductDetailsPage productDetailsPage = new ProductDetailsPage();
		String productNameOnDetailsPage = productDetailsPage.getProductName().getText();
		verifyTrue(productNameInSearchResults.equals(productNameOnDetailsPage), "Product name in details page doesn't match with product name in search results page", "Product name in details page doesn't match with product name in search results page");
	}

}

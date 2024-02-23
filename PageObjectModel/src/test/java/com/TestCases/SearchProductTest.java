package com.TestCases;

import org.testng.annotations.Test;

import com.Base.BrowserSetup;
import com.POM.SearchProductPage;

public class SearchProductTest extends BrowserSetup
{
	RegistrationTest reg;
	LoginTest lgt;
	SearchProductPage spp;
	
	
	@Test
	public void searchProduct() throws InterruptedException
	{
		lgt = new LoginTest();
		lgt.login();
		
		spp = new SearchProductPage(driver);
				
		spp.entersearchInput("Mac");
		Thread.sleep(1500);
		
		spp.clickOnSearch();
		Thread.sleep(1500);
		
		spp.selectProduct();
		Thread.sleep(1500);
		
		spp.addproducttocart();
		Thread.sleep(1500);
		
		System.out.println("Cart Value is: ");
		spp.getcartvalue();
		
		
		
	}
}

package com.TestCases;


import org.testng.annotations.Test;

import com.Base.BrowserSetup;
import com.POM.LoginPage;

public class LoginTest extends BrowserSetup
{
//	WebDriver driver;
	RegistrationTest regt;
	LoginPage lp;
	
	@Test
	public void login() throws InterruptedException
	{
		regt = new RegistrationTest();
		regt.bLaunch();
		
		regt.Register();
		
		lp = new LoginPage(driver);
		
		lp.enterUsername("mrtester@mailnator.com");
		
		Thread.sleep(1500);
		
		lp.enterPassword("Test@123321");
		Thread.sleep(1500);
		
		lp.clickOnLogin();
		
	}
	

}

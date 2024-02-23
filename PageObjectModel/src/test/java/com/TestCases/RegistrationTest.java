package com.TestCases;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.BrowserSetup;
import com.Base.ScreenShot;
import com.POM.RegistrationPageObjects;

public class RegistrationTest extends BrowserSetup
{
//	WebDriver driver;
	RegistrationPageObjects reg;
	BrowserSetup bs;
	ScreenShot sc;
	
//	String browser = "chrome";
//	String baseUrl = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";
	
	int i = 0;
	
	// Launch user selected Browser
	
	@BeforeTest
	public void bLaunch()
	{
		bs = new BrowserSetup();
		driver = bs.launchBrowser("chrome", "https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@Test
	public void Register() throws InterruptedException
	{
		reg = new RegistrationPageObjects(driver);
		
		// Wait before redirecting to Registration page
		Thread.sleep(1500);
		
		reg.navigatetoRegister();
		Thread.sleep(1500);
		
		reg.enterFirstname("Test");
		Thread.sleep(1500);
		
		reg.enterLastname("QA");
		Thread.sleep(1500);
		
		reg.enterEmail("mrtester1@mailnator.com");
		Thread.sleep(1500);
		
		reg.enterPhoneNum("9874651230");
		Thread.sleep(1500);
		
		reg.enterpassword("Test@123321");
		Thread.sleep(1500);
		
		reg.entercnfpassword("Test@123321");
		Thread.sleep(1500);
		
		reg.subscribe();
		Thread.sleep(1500);
		
		reg.policyagree();
		Thread.sleep(1500);
		
		reg.completeregistration();
		Thread.sleep(1500);
		
		reg.clickonLogoutbutton();
		Thread.sleep(1500);
		
		reg.clickonAccountbutton();
		
		
		
	}
	
	// Take Screenshot
	@AfterMethod
	public void takeScreenShot(ITestResult result)
	{
		i = i+1;
		
		String name = "ScreenShot";
		String x = name+String.valueOf(i);
		
		if(ITestResult.SUCCESS==result.getStatus())
		{
			ScreenShot.takeScreenShot(driver, x);
		}
		
	}
	


}

package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserSetup 
{
	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public WebDriver launchBrowser(String browser, String url)
	{
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
//			driver.get(url);
			
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
//			driver.get(url);
			
		}
		
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver =  new EdgeDriver();
//			driver.get(url);
			
		}
		
		else
		{
			System.out.println("Invalid Browser name: ");
		}
		
			if (driver != null) {
	            
				// Navigate to the URL if driver is initialized
				driver.get(url); 
	            driver.manage().window().maximize();
	    		
	    		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        }
		
		return driver;
		
	}

}

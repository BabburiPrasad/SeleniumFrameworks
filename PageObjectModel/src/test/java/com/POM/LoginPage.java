package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Base.BrowserSetup;

public class LoginPage extends BrowserSetup
{
//	WebDriver driver;
	
	By userName = By.xpath("//input[@id='input-email']");
	By password = By.xpath("//input[@id='input-password']");
	By loginbutton = By.xpath("//input[@class='btn btn-primary']");
	
	public LoginPage(WebDriver driver)
	{
		BrowserSetup.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(userName).sendKeys(username);
	}
	
	public void enterPassword(String passwd)
	{
		driver.findElement(password).sendKeys(passwd);
	}
	
	public void clickOnLogin()
	{
		driver.findElement(loginbutton).click();
	}

}

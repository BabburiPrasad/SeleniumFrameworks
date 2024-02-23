package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Base.BrowserSetup;




public class RegistrationPageObjects extends BrowserSetup
{
//	WebDriver driver;
	
	By Registrationbuttonloc = By.xpath("(//a[text()='Register'])[2]");
	By firstnameloc = By.xpath("//input[@id='input-firstname']");
	By lastnameloc = By.xpath("//input[@id='input-lastname']");
	By emailloc = By.xpath("//input[@id='input-email']");
	By passwordloc = By.xpath("//input[@id='input-password']");
	By confpasswordloc = By.xpath("//input[@id='input-confirm']");
	By telphonelec = By.xpath("//input[@id='input-telephone']");
	
	By subscribeloc = By.xpath("(//input[@type='radio'])[2]");
	By policyagreecheckloc = By.xpath("//input[@name='agree']");
	By continuebloc = By.xpath("//input[@class='btn btn-primary']");
	
	By logoutloc = By.xpath("(//a[text()='Logout'])[2]");
	By accountloc = By.xpath("//a[text()='Account']");
	
	
	public RegistrationPageObjects(WebDriver driver)
	{
		BrowserSetup.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
		public void navigatetoRegister()
		{
			
			driver.findElement(Registrationbuttonloc).click();
		}
		
		public void enterFirstname(String fName)
		{
			driver.findElement(firstnameloc).sendKeys(fName);
		}
		
		public void enterLastname(String lName)
		{
			driver.findElement(lastnameloc).sendKeys(lName);
		}
		
		public void enterEmail(String email)
		{
			driver.findElement(emailloc).sendKeys(email);
		}
		
		public void enterpassword(String password)
		{
			driver.findElement(passwordloc).sendKeys(password);
		}
		
		public void entercnfpassword(String confpassword)
		{
			driver.findElement(confpasswordloc).sendKeys(confpassword);
		}
		
		public void enterPhoneNum(String phone)
		{
			driver.findElement(telphonelec).sendKeys(phone);
		}
		
		public void subscribe()
		{
			driver.findElement(subscribeloc);
		}
		
		public void policyagree()
		{
			driver.findElement(policyagreecheckloc).click();
		}
		
		public void completeregistration()
		{
			driver.findElement(continuebloc).click();
		}
		
		public void clickonLogoutbutton()
		{
			driver.findElement(logoutloc).click();
		}
		
		public void clickonAccountbutton()
		{
			driver.findElement(accountloc).click();
		}

}

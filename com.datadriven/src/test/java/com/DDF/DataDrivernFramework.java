package com.DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.security.SecureRandom;

public class DataDrivernFramework 
{
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		String baseURL = "https://naveenautomationlabs.com/opencart/index.php?route=account/register";

		int length = 10; // Change the length as per your requirement
        String randomStrng = generateRandomString(length);
        String domain = "@mailnator.com"; // Change the domain name as per your requirement
        String email = randomStrng + domain;
        System.out.println("Random Email: " + email);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String propertypath = "C:\\Users\\HP\\Documents\\SeleniumPractice\\com.datadriven\\Properties\\registration.properties";
		
		Properties p = new Properties();
		
		
		try 
		{
			
			FileInputStream file = new FileInputStream(propertypath);
			p.load(file);
			
		} 
		catch (IOException e) 
		{
			
			System.out.println("Property file not found, Please check the given path: " +e);
		
		}
		
		String fname = p.getProperty("FirstName");
		String lname = p.getProperty("LastName");
	//	String emailid = p.getProperty("Email");
		String phonenum = p.getProperty("Phone");
		String Passwd = p.getProperty("Password");
		String CnfPassword = p.getProperty("CnfPassword");
		
		System.out.println("First Name: "+fname);
		System.out.println("Last Name: "+lname);
	//	System.out.println("Email Id: "+randomEmail);
		System.out.println("Email Id: "+email);
		System.out.println("Phone Number: "+phonenum);
		System.out.println("Password : "+Passwd);
		System.out.println("Confirmation Password: "+CnfPassword);
		
		
		WebElement enterfirstname = driver.findElement(By.xpath("//input[@id='input-firstname']"));
		enterfirstname.sendKeys(fname);
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lname);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(phonenum);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(Passwd);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(CnfPassword);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		Thread.sleep(5000);
		
		String successmessage = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
		
		
		Assert.assertEquals(successmessage, "Your Account Has Been Created!");
		
		Thread.sleep(10000);
		
		driver.close();
		
		
	}
	private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz0123456789";
	private static final SecureRandom random = new SecureRandom();
	
	public static String generateRandomString(int length) 
    {
		 StringBuilder stringBuilder = new StringBuilder(length);
	        for (int i = 0; i < length; i++) 
	        {
	            stringBuilder.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
	        }
	        return stringBuilder.toString();
    }
	
/*public static String generateRandomEmail(int length)
    {
		
    	Random random = new Random(10);
        StringBuilder sb = new StringBuilder(length);
        // @mailnator.com
        for(int i = 0; i< length; i++)
        {
        	int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            
            sb.append(randomChar);
        }
        return sb.toString();
        
        
    }*/
	
}
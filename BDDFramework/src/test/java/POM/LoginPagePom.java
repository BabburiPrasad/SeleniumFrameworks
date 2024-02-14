package POM;

import org.openqa.selenium.By;
import Utilities.BaseDriver;
import org.openqa.selenium.WebDriver;



public class LoginPagePom extends BaseDriver {
	public static WebDriver driver;
	public static String successMsg;
	
	
	public static String uNametextbox = "\"//input[@id='input-email']\"";
	public static String passwordTextbox = "//input[@id='input-password']\"";
	public static String loginButton = "//input[@type='submit']\"";
	
	public static String succesMessage = "\"(//a[@class='list-group-item'][1])\"";
	public static String logOutbuttton = "\"//a[@class='list-group-item'][13])\"";
	
	
	public static void enterUsername()
	{
		driver.findElement(By.xpath(uNametextbox)).sendKeys("e7w0fnwvv1@rentforsale7.com");
	}
	
	public static void enterPassword()
	{
		driver.findElement(By.xpath(passwordTextbox)).sendKeys("Test@123");
	}
	
	public static void clickOnLogin()
	{
		driver.findElement(By.xpath(loginButton)).click();
	}
	
	public static String verifyLogin()
	{
		driver.findElement(By.xpath(succesMessage)).getText();
		return successMsg;
	}
	
	public static void clickOnLogout()
	{
		driver.findElement(By.xpath(logOutbuttton)).click();
	}
	
    //WebElements
    
//    @FindBy(xpath = "//input[@id='input-email']")
//	private WebElement usernametextbox;
////    = driver.findElement(By.xpath("//input[@id='input-email']"));
//    
////    @FindBy(xpath = "//input[@id='input-password']")
//    private WebElement passwordtextbox;
////    = driver.findElement(By.xpath("//input[@id='input-password']"));
//    
//    @FindBy(xpath = "//input[@type='submit']")
//    private WebElement loginbutton;
////    = driver.findElement(By.xpath("//input[@type='submit']"));
//    
//    @FindBy(xpath = "(//a[@class='list-group-item'][1])")
//    private WebElement successMessage;
////    = driver.findElement(By.xpath("//a[@class='list-group-item'][1])"));
//    
//    @FindBy(xpath = "//a[@class='list-group-item'][13])")
//    private WebElement logOutbutton;
////    = driver.findElement(By.xpath("//a[@class='list-group-item'][13])"));
//
//	public static WebDriver getDriver() {
//		return driver;
//	}
//
//	public WebElement getUsernametextbox(String username) {
//		
//		usernametextbox.sendKeys(username);
//		return usernametextbox;
//	}
//
//	public WebElement getPasswordtextbox(String password) {
//		passwordtextbox.sendKeys(password);
//		return passwordtextbox;
//	}
//
//	public WebElement getLoginbutton() {
//		
//		loginbutton.click();
//		return loginbutton;
//	}
//
//	public WebElement getSuccessMessage() {
//		
//		successMessage.getText();
//		return successMessage;
//	}
//
//	public WebElement getLogOutbutton() {
//		
//		logOutbutton.click();
//		return logOutbutton;
//	}
    
    //Methods

//	public void enterUsername(String username)
//    {
//		this.usernametextbox.sendKeys(username);
//    	usernametextbox.sendKeys(username);
//    }
//    
//    public void entePassword(String password)
//    {
//    	this.passwordtextbox.sendKeys(password);
//    	passwordtextbox.sendKeys(password);
//    }
//    
//    public void clickOnlogin()
//    {
//    	this.loginbutton.click();
//    	loginbutton.click();
//    }
//    public String checkSuccessmessage()
//    {
//    	this.successMessage.getText();
//    	return successMessage.getText();
//    }
//    
//    public void clickOnlogout()
//    {
//    	this.logOutbutton.click();
//    	logOutbutton.click();
//    }
}

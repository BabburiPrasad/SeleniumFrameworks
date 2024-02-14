package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver{
	
	public static WebDriver driver;
	
	public ChromeOptions options;
	
	public BaseDriver()
	{
		
		//options = new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");
        
//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	public void close()
	{
		driver.close();
	}

}

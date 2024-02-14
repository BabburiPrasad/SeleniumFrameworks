package Utilities;

import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public static BaseDriver driver;
	
	public static ChromeOptions options;
	
	@Before
	public void setUp() 
	{
		driver = new BaseDriver();
	}
	
	@After
	public void teardown()
	{
		driver.close();
	}

}

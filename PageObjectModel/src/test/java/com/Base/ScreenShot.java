package com.Base;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot 
{
	public static void takeScreenShot(WebDriver driver, String ScreenShotName)
	{
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./PageObjectModel/ScreenShot"+ScreenShotName+".jpg"));
			System.out.println("Screenshot is taken");
			
		}
		catch(Exception e)
		{
			System.out.println("Path not found: "+ e.getMessage());
		}
		
	}

}

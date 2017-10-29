package com.snyder.utils;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class DeviceHandler {
	
	public static void changeOrientationToPortrait(RemoteWebDriver driver)
	{
		
		if(driver.getClass().getName().contains("AndroidDriver")){
			
			AndroidDriver android_driver=(AndroidDriver)driver;
			ScreenOrientation current=android_driver.getOrientation();
			try{
				android_driver.rotate(ScreenOrientation.PORTRAIT);				
				
			}catch(Exception e)
			{
				System.err.println("orientation is not supported by the application");
			}			
		}
		
		else if(driver.getClass().getName().contains("IOSDriver"))
		{
			
			IOSDriver ios_driver=(IOSDriver)driver;
			ScreenOrientation current=ios_driver.getOrientation();
			try
			{
				ios_driver.rotate(ScreenOrientation.PORTRAIT);
				
			}catch(Exception e)
			{
				System.err.println("orientation is not supported by the application");
			}			
		}
		
	   }
	
	public static void changeOrientationToLandScape(RemoteWebDriver driver)
	{
		
			AndroidDriver android_driver=(AndroidDriver)driver;
			ScreenOrientation current=android_driver.getOrientation();
			if(current.toString().equalsIgnoreCase("portrait"))
			{
				android_driver.rotate(ScreenOrientation.LANDSCAPE);
			}		
	}
	
}

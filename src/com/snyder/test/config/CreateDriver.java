package com.snyder.test.config;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.snyder.utils.ReadData;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CreateDriver {
	
	public static AppiumDriver getDriverInstance()
	{
		AppiumDriver driver=null;
		
		try{
			
			DesiredCapabilities cap=new DesiredCapabilities();
			//String driverType=ReadData.fromProperties("configuration", "driverType");
			String driverType="aos";
			System.out.println("Drivertype: " +driverType);
			Thread.sleep(1000);
			String appActivity=ReadData.fromProperties("configuration", "appActivity");
			System.out.println("Configuration: " +appActivity);
			Thread.sleep(1000);
			String appPackage=ReadData.fromProperties("configuration", "appPackageName");
			System.out.println("appPackage : " +appPackage);
			Thread.sleep(1000);
			
			System.out.println("-----------------");
			System.out.println(appPackage);
			System.out.println("com.flipkart.android");
			System.out.println("--------------------");
			
			if(appPackage.equals("com.flipkart.android"))
			{
				System.out.println("app package is equal");
			}
			
			
			if(driverType.trim().equalsIgnoreCase("aos"))
			{
		
				System.out.println("In get driverInstance class : AOS");
				cap.setCapability("platformName","Android");
				cap.setCapability("platformVersion","5.1.0");
				cap.setCapability("deviceName","0123456789ABCDEF");
				//cap.setCapability("appPackage","com.flipkart.android");
				cap.setCapability("appPackage", appPackage);
				//cap.setCapability("appActivity","com.flipkart.android.SplashActivity");			
				cap.setCapability("appActivity",appActivity);
				driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);				
			}
			else if(driverType.equals("ios")){
				System.out.println("In get driverInstance class : ios");
				
				cap.setCapability("platformName", "IOS");
				cap.setCapability("platformVersion","10.0");
				cap.setCapability("UDID","");
				cap.setCapability("bundleID", "");
				driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);					
			}
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}	
		
		return driver;
		
	}
	

}

package com.snyder.ui.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.snyder.ui.object.AOSMenuItems;

public class MenuItemsPage {
	
	RemoteWebDriver driver;
	
	
	public MenuItemsPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getMyAccount()
	{

		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			return driver.findElement(AOSMenuItems.myAccount);
			
		}
		else if(driver.getClass().getName().contains("IOSDriver")){
			
			return driver.findElement(AOSMenuItems.myAccount);
			
		}
		return null;
		
		
	}
	

}

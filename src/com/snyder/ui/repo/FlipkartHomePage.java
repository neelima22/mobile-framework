package com.snyder.ui.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.snyder.ui.object.AOSFlipkartHome;
import com.snyder.ui.object.IOSFlipkartHome;

public class FlipkartHomePage {
	
	RemoteWebDriver driver;
	
	public FlipkartHomePage(RemoteWebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public WebElement getSearchTextBox()
	{
		
		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			return driver.findElement(AOSFlipkartHome.searchTextBox);
			
		}
		else if(driver.getClass().getName().contains("IOSDriver")){
			
			return driver.findElement(IOSFlipkartHome.searchTextBox);
			
		}
		return null;
	}
	
	
	
	public WebElement getAddToCart()
	{
		
		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			return driver.findElement(AOSFlipkartHome.addToCart);
			
		}
		else if(driver.getClass().getName().contains("IOSDriver")){
			
			return driver.findElement(IOSFlipkartHome.addToCart);
			
		}
		return null;
	}
	
	
	public WebElement getMenuIcon()
	{
		
		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			return driver.findElement(AOSFlipkartHome.menuIcon);
		}
		else if(driver.getClass().getName().contains("IOSDriver"))
		{
			return driver.findElement(IOSFlipkartHome.menuIcon);
		}
		
		return null;
	}
	
	

}

package com.snyder.test.smoke;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.snyder.test.config.CreateDriver;
import com.snyder.ui.repo.FlipkartHomePage;
import com.snyder.ui.repo.MenuItemsPage;

import io.appium.java_client.AppiumDriver;

public class TestLoginUS100 {
	
	AppiumDriver driver;
	FlipkartHomePage home_page;
	MenuItemsPage menu_items;
	
	@BeforeMethod
	public void setUp()
	{
		driver=CreateDriver.getDriverInstance();
		home_page=new FlipkartHomePage(driver);
		menu_items=new MenuItemsPage(driver);		
	}
	
	@Test
	public void testLoginSucessTC117()
	{
		home_page.getMenuIcon().click();
		menu_items.getMyAccount().click();		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		
		
	}
	
	

}

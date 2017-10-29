package com.snyder.ui.object;

import org.openqa.selenium.By;

public interface AOSFlipkartHome {
	
	By searchTextBox=By.id("com.flipkart.android:id/search_widget_textbox");
	By addToCart=By.id("com.flipkart.android:id/cart_bg_icon");
	By menuIcon=By.xpath("//android.widget.ImageButton[@content-desc='Open Drawer']");

}

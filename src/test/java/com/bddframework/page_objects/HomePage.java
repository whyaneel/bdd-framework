package com.bddframework.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	@FindBy(how = How.XPATH, using = "//li[7]//input[1]")
	public static WebElement menuItem;
	
	@FindBy(how = How.XPATH, using = "//span[contains(.,'Place Order')]")
	public static WebElement btn_PlaceOrder;
	
	
	public static void placeOrder(){
		menuItem.click();
		btn_PlaceOrder.click();
	}
	
	public static boolean verify(String title){
		System.out.println("Page > " + title);
		return title.contains("/home/");
	}
}

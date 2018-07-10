package com.bddframework.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrdersPage {
	
	@FindBy(how = How.XPATH, using = "//span[contains(.,'$')]")
	public static WebElement element_TotalPrice;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Confirm Order')]")
	public static WebElement btn_ConfirmOrder;
	
	public static void confirmOrder(){
		btn_ConfirmOrder.click();
	}
	
	public static boolean isTotalPriceVisible(){
		return element_TotalPrice.getText().length() > 0;
	}
	
	public static boolean verify(String title){
		System.out.println("Page > " + title);
		return title.contains("/orders/");
	}
	
}

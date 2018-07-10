package com.bddframework.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentPage {
	
	@FindBy(how = How.XPATH, using = "//span[contains(.,'$')]")
	public static WebElement element_TotalPrice;
	
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Order Number')]")
	public static WebElement element_OrderNumber;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Payment')]")
	public static WebElement btn_Payment;
	
	public static void billPayment(){
		btn_Payment.click();
	}
	
	public static boolean isOrderNumberVisible(){
		System.out.println("Order # " + element_OrderNumber.getText());
		return element_TotalPrice.getText().length() > 0 && element_OrderNumber.getText().length() > 0;
	}
	
	public static boolean verify(String title){
		System.out.println("Page > " + title);
		return title.contains("/payment/");
	}
}

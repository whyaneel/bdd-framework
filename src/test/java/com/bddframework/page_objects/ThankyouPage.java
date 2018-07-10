package com.bddframework.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ThankyouPage {
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Payment has been successful')]")
	public static WebElement element_SuccessMessage;
	
	
	public static boolean isSucess(){
		return element_SuccessMessage.getText().length() > 0;
	}
	
	public static boolean verify(String title){
		System.out.println("Page > " + title);
		return title.contains("/payment-done/");
	}
}

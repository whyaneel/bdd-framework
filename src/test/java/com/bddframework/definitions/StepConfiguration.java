package com.bddframework.definitions;

import com.bddframework.hooks.WebDriverHook;
import com.bddframework.page_objects.HomePage;
import com.bddframework.page_objects.OrdersPage;
import com.bddframework.page_objects.PaymentPage;
import com.bddframework.page_objects.ThankyouPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class StepConfiguration {
	protected WebDriver driver;
	
	public StepConfiguration() {
		driver = WebDriverHook.driver;
		if(null != driver) {
			PageFactory.initElements(driver, HomePage.class);
			PageFactory.initElements(driver, OrdersPage.class);
			PageFactory.initElements(driver, PaymentPage.class);
			PageFactory.initElements(driver, ThankyouPage.class);
		}else{
			System.out.println("Please map your .feature file with tab @OpenBrowser to invoke WebDriverHook.");
		}
	}
}

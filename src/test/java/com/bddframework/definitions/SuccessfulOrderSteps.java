package com.bddframework.definitions;

import com.bddframework.page_objects.HomePage;
import com.bddframework.page_objects.OrdersPage;
import com.bddframework.page_objects.PaymentPage;
import com.bddframework.page_objects.ThankyouPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SuccessfulOrderSteps extends StepConfiguration {
	
	@Given("user launches the app by entering url {string}")
	public void user_launches_the_app_by_entering_url(String app_url) {
		driver.get(app_url);
	}
	
	@Given("user is on home page of the app")
	public void user_is_on_home_page_of_the_app() {
		if(HomePage.verify(driver.getCurrentUrl())) {
			System.out.println("on Homepage");
		}else {
			System.out.println("not on Homepage");
		}
	}
	
	@Given("user clicks Place Order")
	public void user_clicks_Place_Order() {
		HomePage.placeOrder();
	}
	
	@Given("user should see the total price")
	public void user_should_see_the_total_price() {
		if(OrdersPage.verify(driver.getCurrentUrl()) && OrdersPage.isTotalPriceVisible()	){
			System.out.println("can see Total Price");
		}else {
			System.out.println("can not see Total Price");
		}
	}
	
	@Given("user clicks Confirm Order")
	public void user_clicks_Confirm_Order() {
		OrdersPage.confirmOrder();
	}
	
	@Given("user should see an order number")
	public void user_should_see_an_order_number() {
		if(PaymentPage.verify(driver.getCurrentUrl()) && PaymentPage.isOrderNumberVisible()	){
			System.out.println("can see Order Number");
		}else {
			System.out.println("can not see Order Number");
		}
	}
	
	@Given("user clicks Payment")
	public void user_clicks_Payment() {
		PaymentPage.billPayment();
	}
	
	@Then("user should see a successfull message")
	public void user_should_see_a_successfull_message() {
		if(ThankyouPage.verify(driver.getCurrentUrl()) && ThankyouPage.isSucess()	){
			System.out.println("Order Successful");
		}else {
			System.out.println("Order Fail");
		}
	}
	
	
}

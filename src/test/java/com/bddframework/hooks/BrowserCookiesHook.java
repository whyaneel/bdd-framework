package com.bddframework.hooks;

import cucumber.api.java.Before;

public class BrowserCookiesHook {
	@Before("@browsercookies")
	public void clear(){
		System.out.println("Clear Browser Cookies.");
	}
}

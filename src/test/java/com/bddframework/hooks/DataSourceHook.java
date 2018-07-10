package com.bddframework.hooks;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class DataSourceHook {
	
	@Before("@datasource")
	public void openConnection(){
		System.out.println("DataSource Created.");
	}
	
	@After("@datasource")
	public void closeConnection(){
		System.out.println("DataSource Removed.");
	}
}

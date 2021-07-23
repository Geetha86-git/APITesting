package com.browserhandling;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.pages.initializePages;


public class BaseFunctions extends initializePages {

	private WebDriver driver;
	String url="https://todomvc.com/examples/react/#/";
	
	@BeforeSuite
	public void initaizeSetUp()
	{
		initializeBrowser();
		deleteCookies();
		launchURL(url);		
	}
	
	public void initializeBrowser()
	{
		driver = BrowserFunctions.getInstance();
		initializePageObjects();
	}
	
	public void deleteCookies()
	{
		driver.manage().deleteAllCookies();
	}
	
	public void launchURL(String url)
	{
		driver.get(url);
	}
}

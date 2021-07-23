package com.browserfunctions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.pages.Initializepages;

public class BaseTest extends Initializepages{
	
	private String url = "https://www.amazon.in/";
	private WebDriver driver;
	
	public void initializeBrowser()
	{
		driver = DriverObjects.getInstance();
		InitializePageObjects();
	}
	
	@BeforeSuite	
	public void openApp()
	{
		initializeBrowser();
		clearCookies();
		launchApp();
	}
	
	public void clearCookies()
	{
		driver.manage().deleteAllCookies();
	}
	
	public void launchApp()
	{
		driver.get(url);
	}
	
	public void quitDriver()
	{
		driver.close();
	}
}

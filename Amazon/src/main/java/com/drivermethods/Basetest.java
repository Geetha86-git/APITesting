package com.drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.pages.Initializepages;

public class Basetest extends Initializepages
{
	public WebDriver driver;
	private String url = "https://www.amazon.in/";
	
	@BeforeSuite
	public void launchApp()
	{
		initializeBrowser();
		deleteCookies();
		goToHomePage();	
	}
	
	@AfterSuite
	
	public void driverClose()
	{
		driver.close();
	}
	
	public void initializeBrowser()
	{
		driver = Driverobjects.getInstance();
		initializePageObjects();
	}	
	
	public void deleteCookies()
	{
		driver.manage().deleteAllCookies();
	}
	
	public void goToHomePage()
	{
		driver.get(url);
	}
}
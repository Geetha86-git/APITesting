package com.browserobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Driverobjects
{
	public WebDriver driver;
	private String url = "https://www.bookmyshow.com";
	
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
	
	public WebDriver initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saravana Kumar\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
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
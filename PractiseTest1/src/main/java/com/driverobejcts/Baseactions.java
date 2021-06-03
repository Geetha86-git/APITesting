package com.driverobejcts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.pages.Initializepageobjects;

public class Baseactions extends Initializepageobjects{

	private static WebDriver driver;
	private static String url = "https://rahulshettyacademy.com/angularpractice/";
	
	@BeforeSuite
	public void getReady() throws IOException
	{
		initializeBrowser();
		deleteCookies();
		launchApp();
	}
	
	public void initializeBrowser() throws IOException
	{
		driver = Initializebrowser.getInstance();
		initializePage();
	}
	
	public void deleteCookies()
	{
		driver.manage().deleteAllCookies();
	}
	
	public void launchApp()
	{
		driver.get(url);
	}
	
	@AfterSuite
	public void closeDriver()
	{
		driver.close();
	}
}

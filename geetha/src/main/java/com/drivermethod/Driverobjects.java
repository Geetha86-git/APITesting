package com.drivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverobjects {
	
	WebDriver driver;
	
	public WebDriver initializeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saravana Kumar\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://google.com");
		return driver;
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	

	
}
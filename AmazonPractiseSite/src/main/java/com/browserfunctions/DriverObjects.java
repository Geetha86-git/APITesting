package com.browserfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverObjects {

	protected static WebDriver driver;
	
	public static WebDriver getInstance()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saravana Kumar\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
}

/**
 * 
 */
package com.driverobejcts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Geetha
 *
 */
public class Initializebrowser{
	
	protected static WebDriver driver;
	
	
	public static WebDriver getInstance() throws IOException
	{
		String filePath = System.getProperty("user.dir")+"\\src\\main\\java\\resources.properties";
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(filePath);
		
		prop.load(fis);
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saravana Kumar\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

}

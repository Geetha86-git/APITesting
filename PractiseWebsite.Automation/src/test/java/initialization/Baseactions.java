package initialization;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import pages.Pageinitialization;

public class Baseactions extends Pageinitialization{
	
	public WebDriver driver;
	protected String url = "https://rahulshettyacademy.com/seleniumPractise/#/";
	
	@BeforeSuite
	public void initialSetup()
	{
		launchBrowser();
		deleteCookies();
		launchApp(url);
	}
	
	public void launchBrowser()
	{
		try {
			driver=Driverobjects.getInstance();
			initializepage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteCookies()
	{ 
		driver.manage().deleteAllCookies();
	}
	
	public void launchApp(String url)
	{
		driver.get(url);
	}

	/*@AfterSuite
	public void driverClose()
	{
		driver.quit();
	}*/
}	

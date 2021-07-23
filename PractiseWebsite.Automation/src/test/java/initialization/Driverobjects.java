package initialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverobjects {

	protected static WebDriver driver;
	
	public static WebDriver getInstance() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\resource.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saravana Kumar\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
}

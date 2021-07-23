import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saravana Kumar\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.id("searchDropdownBox")).click();
		WebElement element = driver.findElement(By.id("searchDropdownBox")); 
		Select s = new Select(element);
		s.selectByVisibleText("Books");	
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
	}

}

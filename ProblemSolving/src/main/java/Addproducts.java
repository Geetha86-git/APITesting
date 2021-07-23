import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

public class Addproducts {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saravana Kumar\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Map<String,String> prodList = new HashMap<String,String>();
		prodList.put("Brocolli", "1");
		prodList.put("Tomato", "2");
		prodList.put("Mushroom", "1");
		
		
		By cart = By.xpath("//*[@class='cart-icon']");
		
		String inputProduct = "//div[@class='product']//h4[contains(text(),'productName')]/following-sibling::div[@class='stepper-input']/input";
		String addToCart = "//div[@class='product']//h4[contains(text(),'productName')]/following-sibling::div[@class='product-action']/button";
		By proceedButton = By.xpath("//div[@class='action-block']/button");
		
		String verifyAddedQunatity = "//*[@id='productCartTables']//td/p[contains(text(),'product_name')]/parent::td/following-sibling::td[1]/p";
		String verifyAddedProducts = "//*[@id='productCartTables']//td/p[@class='product-name'][contains(text(),'product_name')]";
		
		clickProduct(inputProduct, addToCart, prodList);
		click(cart);
		click(proceedButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		checkProducts(verifyAddedProducts, verifyAddedQunatity, prodList);
		
	}
	
	public static void clickProduct(String quantity,String addItem,Map<String,String> products)
	{
		for(Entry<String,String> m:products.entrySet())
		{
			String pName = m.getKey();
			String pQuantity = m.getValue();
			String qLocator = quantity.replace("productName", pName);
			String pAddItem = addItem.replace("productName", pName);
			
			driver.findElement(By.xpath(qLocator)).clear();
			driver.findElement(By.xpath(qLocator)).sendKeys(pQuantity);
			driver.findElement(By.xpath(pAddItem)).click();
		}
	}
	
	public static void click(By xPath)
	{
		driver.findElement(xPath).click();
	}
	
	public void waitFunction(By specifyElement)
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(specifyElement));
	}
	
	public static void checkProducts(String product,String quanity,Map<String,String> products)
	{	
		for(Entry<String,String> e:products.entrySet())
		{
			String addedProductName = product.replace("product_name", e.getKey());
			String addedProductQuantity = quanity.replace("product_name", e.getKey());
			
			System.out.println(e.getKey()+","+e.getValue());
			System.out.println(driver.findElement(By.xpath(addedProductQuantity)).getText());
			
			
			if((driver.findElement(By.xpath(addedProductName)).getText().split("-")[0].trim()).equals(e.getKey()) && (driver.findElement(By.xpath(addedProductQuantity)).getText().equals(e.getValue())))
			{
				System.out.println("Product Present");
			}
			else
			{
				System.out.println("Product wrongly added");
			}
		}
	}

}

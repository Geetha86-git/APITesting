package utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import initialization.Driverobjects;

public class Coreutils extends Driverobjects{
	

	public void setText(By xPath,String text)
	{
		driver.findElement(xPath).sendKeys(text);
	}
	
	public void clickProduct(String quantity,String addItem,Map<String,String> products)
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
	
	public void click(By xPath)
	{
		driver.findElement(xPath).click();
	}
	
	public void waitFunctionForElementPresence(By xPath)
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.presenceOfElementLocated(xPath));
	}
	
	public void waitFunctionForElementClickable(By xPath)
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(xPath));
	}
	
	public void checkProducts(String product,String quanity,Map<String,String> products)
	{	
		for(Entry<String,String> e:products.entrySet())
		{
			String addedProductName = product.replace("product_name", e.getKey());
			String addedProductQuantity = quanity.replace("product_name", e.getKey());
			
			System.out.println(e.getKey()+","+e.getValue());
			System.out.println(driver.findElement(By.xpath(addedProductQuantity)).getText());
			
			
			if((driver.findElement(By.xpath(addedProductName)).getText().split("-")[0].trim()).equals(e.getKey()) && (driver.findElement(By.xpath(addedProductQuantity)).getText().equals(e.getValue())))
			{
				Assert.assertTrue(true, "Product Present");
			}
			else
			{
				Assert.assertTrue(false, "Product wrongly added");
			}
		}
	}
	
}

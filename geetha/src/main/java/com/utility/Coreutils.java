package com.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Coreutils{
	
	WebDriver driver;
	
	public void clickElement(WebDriver driver,By xPath)
	{
		driver.findElement(xPath).click();
	}
	
	public void setText(WebDriver driver,By xPath,String text)
	{
		driver.findElement(xPath).click();
		driver.findElement(xPath).sendKeys(text);
	}
	
	public void selectTripLocations(WebDriver driver,WebElement element,String text)
	{
		if(element.getAttribute("aria-expanded").equalsIgnoreCase("true"))
		{
			while(!element.getAttribute("value").contains(text))
			{
				element.sendKeys(Keys.ARROW_DOWN);
			}
			element.sendKeys(Keys.ENTER);
		}
	}
	

	public void selectTripLocations1(WebDriver driver,WebElement element,String text)
	{
		if(element.getAttribute("aria-expanded").equalsIgnoreCase("false"))
		{
			while(!element.getAttribute("value").contains(text))
			{
				element.sendKeys(Keys.ARROW_DOWN);
			}
			element.sendKeys(Keys.ENTER);
		}
	}
	
	public String getText(WebDriver driver,By xPath)
	{
		String text = driver.findElement(xPath).getText();
		return text;
	}
	
	public String getAttribute(WebDriver driver, By xPath)
	{
		String value = driver.findElement(xPath).getAttribute("value");
		return value;
	}
	
	public void selectDropDownByText(WebDriver driver,WebElement element,String text)
	{
		Select value = new Select(element);
		value.selectByVisibleText(text);
	}
	
}
package com.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.browserhandling.BrowserFunctions;

public class Coreutils extends BrowserFunctions{
	
	public void setText(By xPath,String text)
	{
		driver.findElement(xPath).sendKeys(text);
	}	

	public void elementClick(By xPath)
	{
		driver.findElement(xPath).click();
	}
	
	public void pressEnter(By xPath)
	{
		driver.findElement(xPath).sendKeys(Keys.ENTER);
	}
	
	public List<WebElement> verifyElements(By xPath)
	{
		return driver.findElements(xPath);
		
	}
}

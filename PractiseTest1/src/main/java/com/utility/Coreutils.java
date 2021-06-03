package com.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.driverobejcts.Initializebrowser;

public class Coreutils extends Initializebrowser {
	
	
	public void setText(By xPath,String text)
	{
		driver.findElement(xPath).sendKeys(text);
	}

	public void buttonClick(By xPath)
	{
			driver.findElement(xPath).click();
	}
	
	public void checkRadioClick(By xPath)
	{
		if(!driver.findElement(xPath).isSelected())
		{
			driver.findElement(xPath).click();
		}
	}
	
	public void selectStaticWebElement(By xPath,String text)
	{
		WebElement elements = driver.findElement(xPath);
		Select option = new Select(elements);
		option.selectByVisibleText(text);
	}
	
	public String getText(By xPath)
	{
		return driver.findElement(xPath).getText();
	}
	
	public List<WebElement> fetchList(By xPath)
	{
		return driver.findElements(xPath);
	}
	
}

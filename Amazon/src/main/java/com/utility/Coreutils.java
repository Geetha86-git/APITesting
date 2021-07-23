package com.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.drivermethods.Driverobjects;


public class Coreutils extends Driverobjects
{
	public void selectStaticDropDown(By xPath,String text)
	{
		WebElement element = driver.findElement(xPath); 
		Select s = new Select(element);
		s.selectByVisibleText(text);	
	}
	
	public void buttonClick(By xPath)
	{
		driver.findElement(xPath).click();
	}
	
	public List<WebElement> listSelection(By xPath)
	{
		return driver.findElements(xPath);
	}
	
	public String getText(By xPath)
	{
		return driver.findElement(xPath).getText();
	}
}
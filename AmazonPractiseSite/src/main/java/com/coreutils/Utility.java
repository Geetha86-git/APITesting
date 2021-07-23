package com.coreutils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.browserfunctions.DriverObjects;

public class Utility extends DriverObjects{
	
	public void click(By xPath)
	{
		driver.findElement(xPath).click();
	}
	
	public void selectDropDown(By xPath,String text) {
		
		WebElement element = driver.findElement(xPath);
		Select option = new Select(element);
		option.selectByVisibleText(text);
		click(xPath);
	}
	
	public void click(String str)
	{
		driver.findElement(By.xpath(str)).click();
	}
	
	public void switchWindows(String title) {
			
		Set<String> listOfWindows = driver.getWindowHandles();
		//Iterator<String> it = listOfWindows.iterator();
		
		for(String handles:listOfWindows)
		{
			//String childWindow = driver.getTitle();
			if(!handles.equalsIgnoreCase(title))
			{
				driver.switchTo().window(handles);
			}
		}
		
	}
	
	public String windowTitle() {
		
		return driver.getTitle();
	}

	public String getText(By xPath)
	{
		return driver.findElement(xPath).getText();
	}
}

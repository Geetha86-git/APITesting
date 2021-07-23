package com.utility;

import org.openqa.selenium.By;

import com.browserobjects.Driverobjects;

public class Coreutils extends Driverobjects{
	
	public void clickAlertCancel()
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void setText(By xPath,String text)
	{
		driver.findElement(xPath).sendKeys(text);
	}
}
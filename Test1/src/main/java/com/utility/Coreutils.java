package com.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.browserComponents.Browserhandling;

public class Coreutils {

	public WebDriver driver;
	
	public Coreutils()
	{
		Browserhandling bh = new Browserhandling();
		try {
			this.driver = bh.initailizeDriver();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public void elementInteration(By xPath)
	{
		driver.findElement(xPath).click();
		
	}
	
	public void setText(By xPath,String Text)
	{
		driver.findElement(xPath).sendKeys(Text);
	}
	
	public void enterValues(By xPath)
	{
		driver.findElement(xPath).sendKeys(Keys.ENTER);
	}
	
	public List<WebElement> getList(By xPath) {
		
		return driver.findElements(xPath);
	}
}

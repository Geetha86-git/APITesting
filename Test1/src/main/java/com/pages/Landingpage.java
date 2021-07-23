package com.pages;
import com.utility.*;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Landingpage
{
	Coreutils cu = new Coreutils();
	
		
	By textField = By.className("new-todo");
	By toList = By.xpath("//ul[@class='todo-list']//label"); 
	
	public void enterValue(String text) {
		
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(textField));
		
		cu.elementInteration(textField);		
		cu.setText(textField, text);
	}


	public void addValue()
	{
		cu.enterValues(textField);
	}
	
	public void list() {
		
		for(WebElement reqText:cu.getList(toList))
		{
			System.out.println(reqText.getText());
		}
	}
}
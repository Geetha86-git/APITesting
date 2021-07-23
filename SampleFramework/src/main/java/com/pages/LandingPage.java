package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.Coreutils;

public class LandingPage extends Coreutils{
	
	By textBox = By.className("new-todo");
	By listOfValues = By.xpath("//ul[@class='todo-list']//input[@class='edit']");
	
	public void clickTextBox()
	{
		elementClick(textBox);
	}

	public void enterText(ArrayList<String> list)
	{
		for(String li:list)
		{
			setText(textBox, li);
			pressEnter(textBox);
		}		
	}
	
	public void verifyEnteredElements()
	{
		List<WebElement> todoList = verifyElements(listOfValues);
		for(WebElement li:todoList)
		{
			System.out.println(li.getAttribute("value"));
		}
	}
}

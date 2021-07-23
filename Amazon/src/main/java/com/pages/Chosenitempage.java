package com.pages;

import org.openqa.selenium.By;

import com.utility.Coreutils;

public class Chosenitempage extends Coreutils{

	private static By addItem = By.id("add-to-cart-button");
	private static By price = By.xpath("//*[@id='buyNewSection']//span");
	
	public String getPrice()
	{
		String reqPrice = getText(price);
		return reqPrice;
	}
	
	public void addItem()
	{
		buttonClick(addItem);
	}
	
}

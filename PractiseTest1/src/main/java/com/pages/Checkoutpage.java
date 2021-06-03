package com.pages;

import org.openqa.selenium.By;

import com.utility.Coreutils;

public class Checkoutpage extends Coreutils{ 
	
	private static By itemTotalPrice = By.xpath("//h3/Strong");
	private static By checkOut = By.xpath("//*[@class = 'btn btn-success']");

	public float verifyTotal()
	{
		return Float.parseFloat(getText(itemTotalPrice).split(" ")[1]);		
	}
	
	public void clickCheckOut()
	{
		buttonClick(checkOut);
	}
}

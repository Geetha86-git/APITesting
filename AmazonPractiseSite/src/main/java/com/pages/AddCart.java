package com.pages;

import org.openqa.selenium.By;

import com.coreutils.Utility;

public class AddCart extends Utility{

	private By addCart = By.id("add-to-cart-button");
	private By productPrice = By.xpath("//span[@id='priceblock_ourprice']");
	private By productCartPrice = By.xpath("//div[@id='hlb-subcart']//span[2]");
	
	public void switchCurrentWindow(String title)
	{
		switchWindows(title);
	}
	
	public String getPrice()
	{
		String priceText = getText(productPrice).replaceAll(" ","");
		//String price = priceText[1];
		return priceText;
	}
	
	public void addProducts()
	{
		click(addCart);
	}
	
	public String cartPrice()
	{
		return getText(productCartPrice);
	}
}

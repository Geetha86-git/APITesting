package com.pages;

import org.openqa.selenium.By;

import com.utility.Coreutils;

public class Totalverificationpage extends Coreutils{

	private static By totalPriceInCart = By.xpath("//*[@id='hlb-subcart']//span//span[2]");
	
	public String cartPrice()
	{
		String cartPrice = getText(totalPriceInCart);
		return cartPrice;
	}
}

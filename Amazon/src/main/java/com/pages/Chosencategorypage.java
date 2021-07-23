package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.Coreutils;

public class Chosencategorypage extends Coreutils{

	private static By selectItem = By.xpath("//div[(@id='anonCarousel1')]/ol[@class = 'a-carousel']/li");
	
	public void selectFromList() {
		for(WebElement neededItem: listSelection(selectItem))
		{
			neededItem.click();
			break;
		}
	}
}

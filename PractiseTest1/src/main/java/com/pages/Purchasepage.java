package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.Coreutils;

import okio.Timeout;

public class Purchasepage extends Coreutils{
	
	private static By country = By.id("country");
	private static By clickCountry = By.xpath("//div[@class='suggestions']//a");
	private static By purchase = By.xpath("//*[@value='Purchase']");

	public void chooseCountry(String text)
	{
		setText(country, text);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(clickCountry));
		buttonClick(clickCountry);
	}
	
	public void clickPurchase()
	{
		buttonClick(purchase);
	}
}

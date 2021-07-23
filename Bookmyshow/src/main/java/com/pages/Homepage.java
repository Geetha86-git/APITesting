package com.pages;

import org.openqa.selenium.By;

import com.utility.Coreutils;

public class Homepage extends Coreutils
{
	private static By alertBox = By.className("wzrk-alert wiz-show-animate");
	private static By searchCity = By.xpath("//div/input[contains(@placeholder,'Search')]");
	private static String searchCityDynamic= "//ul//li//span//*[contains(text(),'CityName')]";
	
	public void handleAlert()
	{
		clickAlertCancel();
	}
	
	public void searchCity(String text)
	{
		setText(searchCity, text);
		String temp=searchCityDynamic.replaceAll("CityName", text);
		By element = By.xpath(temp);	
	}
	
	
	
}
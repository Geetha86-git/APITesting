package com.pages;

import org.openqa.selenium.By;

import com.utility.Coreutils;

public class Homepage extends Coreutils
{
	private static By chooseCategory = By.id("searchDropdownBox");
	private static By go = By.id("nav-search-submit-button");
	
	public void selectCategory(String text)
	{
		selectStaticDropDown(chooseCategory, text);
	}
	
	public void clickSubmit()
	{
		buttonClick(go);
	}
	
}
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.coreutils.Utility;

public class ChooseCategory extends Utility{

	By selectCategory = By.id("searchDropdownBox");
	By categorySearch = By.id("nav-search-submit-button");
	
	public void chooseCate(String text)
	{
		click(selectCategory);
		selectDropDown(selectCategory, text);
		click(categorySearch);
	}
	
}

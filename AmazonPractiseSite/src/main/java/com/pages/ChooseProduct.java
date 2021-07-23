package com.pages;

import org.openqa.selenium.By;

import com.coreutils.Utility;

public class ChooseProduct extends Utility{
	
	private String productCategory = "//h2[contains(text(),'BRANDS')]//ancestor::div[contains(@class,'bxc-grid__row')]/following-sibling::div//a[contains(@aria-label,'categoryName')]";
	private By chosenProdcut = By.xpath("//div[contains(@class,'s-main-slot')]/div");
	
	public void clickCategory(String text)
	{
		String requiredCategory = productCategory.replace("categoryName", text);
		click(requiredCategory);
		click(chosenProdcut);
	}
	
	public String getTitle() {
		return windowTitle();
	}
	
	
}

package com.pages;

import java.util.List;

import org.openqa.selenium.By;

import com.utility.Coreutils;

public class Shoppingpage extends Coreutils{

	private static By itemName = By.xpath("//app-card-list//h4/a");
	private static By itemPrice = By.xpath("//app-card-list//h5");
	private static By addItem = By.xpath("//div[@class='card-footer']/button");
	private static By shoppingCart = By.xpath("//div/ul/li[@class='nav-item active']");
	float price = 0;int itemCount;
	
	public float selectItem(List<String> itemList) 
	{
		for(int i = 0;i<fetchList(itemName).size();i++)
		{
			if(itemList.contains(fetchList(itemName).get(i).getText()))
			{
				price = price + Float.parseFloat((fetchList(itemPrice).get(i).getText().replaceAll("\\$","")));
				fetchList(addItem).get(i).click();
				itemCount = itemCount+1;
			}
			if(itemCount==itemList.size()) {
				break;
			}
		}
		return price;
	}
	
	public void clickCart()
	{
		buttonClick(shoppingCart);
	}
}

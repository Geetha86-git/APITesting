package pages;

import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.By;

import utility.Coreutils;

public class Chooseproducts extends Coreutils{
	
	By cart = By.xpath("//*[@class='cart-icon']");
	
	String inputProduct = "//div[@class='product']//h4[contains(text(),'productName')]/following-sibling::div[@class='stepper-input']/input";
	String addToCart = "//div[@class='product']//h4[contains(text(),'productName')]/following-sibling::div[@class='product-action']/button";
	By proceedButton = By.xpath("//div[@class='action-block']/button");
	
	
	
	public void selectProduct(Map<String, String> prodList) throws InterruptedException
	{
		//clickItems(listOfProducts,productQuantity,addProducts,prodList);
		clickProduct(inputProduct, addToCart, prodList);
	}
	
	public void clickCart()
	{
		click(cart);
	}
	
	public void clickProceed()
	{
		click(proceedButton);
	}
	
}

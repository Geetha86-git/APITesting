package pages;

import java.util.Map;

import org.openqa.selenium.By;

import utility.Coreutils;

public class Productverification extends Coreutils{
	
	By promoCodeTextBox = By.xpath("//*[@class='promoCode']");
	By promoApplyButton = By.xpath("//*[@class='promoBtn']");
	By promoInfo = By.xpath("//*[@class='promoInfo']");
	By placeOrder = By.xpath("//div[@class='promoWrapper']/following-sibling::button");
	By prodTable = By.xpath("//*[@id='productCartTables']");
	
	String verifyAddedQunatity = "//*[@id='productCartTables']//td/p[contains(text(),'product_name')]/parent::td/following-sibling::td[1]/p";
	String verifyAddedProducts = "//*[@id='productCartTables']//td/p[@class='product-name'][contains(text(),'product_name')]";
	
	
	public void verifyProducts(Map<String,String> products)
	{
		waitFunctionForElementPresence(prodTable);
		checkProducts(verifyAddedProducts, verifyAddedQunatity, products);
	}
	
	public void enterPromoCode(String text)
	{
		setText(promoCodeTextBox,text);
	}
	
	public void clickPromoApply()
	{
		click(promoApplyButton);
	}
}

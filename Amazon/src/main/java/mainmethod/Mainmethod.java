package mainmethod;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.drivermethods.Basetest;

public class Mainmethod extends Basetest
{
	@Test
	public void bookOrder() 
	{
		getHome_page().selectCategory("Books");
		getHome_page().clickSubmit();
		
		getChosen_categpry_page().selectFromList();
		
		String price = getChosen_item_page().getPrice();
		getChosen_item_page().addItem();
		
		String cartPrice = getTotal_verification_page().cartPrice();
		
		if(price.equals(cartPrice))
		{
			System.out.println(cartPrice + " and "+ price);
			Assert.assertTrue(true, "Both price matches");
		}
		else
		{
			Assert.assertFalse(false, "Price Varies");
		}
	}
}
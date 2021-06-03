package com.mainmethod;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.driverobejcts.Baseactions;

public class Mainmethod extends Baseactions{

	@Test(dataProvider="getData")
	public void mainMethod(String name, String email, String pwd, String dob,String gender,String page,String country)
	{
		ArrayList<String> itemList = new ArrayList<String>();
		itemList.add("iphone X");
		itemList.add("Nokia Edge");
		
		
		//invoke front Page methods
		
		getFront_page().enterFields(name,email,pwd,dob); //date: dd/mm/yyyy
		getFront_page().selectCheckBox();
		getFront_page().selectGender(gender);
		getFront_page().clickSubmit();
		getFront_page().verifyMessage();
		getFront_page().clickShop(page);
		
		//invoke Shopping Page methods
		float price = getShopping_page().selectItem(itemList);
		getShopping_page().clickCart();
		
		//invoke Checkout Page methods		
		float totalPrice = getCheckout_page().verifyTotal();
		Assert.assertNotEquals(price, totalPrice, 0);		
		getCheckout_page().clickCheckOut();
		
		//invoke Purchase Page methods
		getPurchase_page().chooseCountry(country);
		getPurchase_page().clickPurchase();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[1][7];
		obj[0][0] = "Geetha";
		obj[0][1] = "geetha@gmail.com";
		obj[0][2] = "geetha";
		obj[0][3] = "12/12/1986";
		obj[0][4] = "Female";
		obj[0][5] = "Shop";
		obj[0][6] = "India";
		return obj;
	}
}

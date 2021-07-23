package com.mainmethod;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.browserfunctions.BaseTest;

public class MainRunner extends BaseTest{
	
	@Test
	public void run()
	{
		getChoose_category().chooseCate("Beauty");
		getChoose_product().clickCategory("Loreal");
		String title = getChoose_product().getTitle();
		
		getAdd_cart().switchCurrentWindow(title);
		String price = getAdd_cart().getPrice();
		getAdd_cart().addProducts();
		String cartPrice = getAdd_cart().cartPrice();
		

		Assert.assertEquals(price, cartPrice);
		
	}

}

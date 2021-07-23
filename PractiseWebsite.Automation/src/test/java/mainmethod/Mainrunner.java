package mainmethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

import org.testng.annotations.Test;

import initialization.Baseactions;

public class Mainrunner extends Baseactions{

	@Test
	public void mainMethod() throws InterruptedException
	{
		Map<String,String> prodList = new HashMap<String,String>();
		prodList.put("Brocolli", "1");
		prodList.put("Tomato", "2");
		prodList.put("Mushroom", "1");
		
	/*	ArrayList<String> prodList = new ArrayList<String>();
		prodList.add("Mushroom");
		prodList.add("Tomato");
		prodList.add("Brocolli");*/
		
		getChoose_products().selectProduct(prodList);
		getChoose_products().clickCart();
		getChoose_products().clickProceed();
		
		
		getProduct_verification().verifyProducts(prodList);
	}
}

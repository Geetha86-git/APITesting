package com.pages;

public class Initializepageobjects {
	

	private static Frontpage front_page;
	private static Shoppingpage shopping_page;
	private static Checkoutpage checkout_page;
	private static Purchasepage purchase_page;

	
	public static Frontpage getFront_page() {
		return front_page;
	}
	
	public static Shoppingpage getShopping_page() {
		return shopping_page;
	}

	public static Checkoutpage getCheckout_page() {
		return checkout_page;
	}
	
	public static Purchasepage getPurchase_page() {
		return purchase_page;
	}
	
	public void initializePage()
	{
		front_page = new Frontpage();
		shopping_page = new Shoppingpage();
		checkout_page = new Checkoutpage();
		purchase_page = new Purchasepage();
	}
	
}

package com.pages;

public class Initializepages {

	private static Chosencategorypage chosen_categpry_page;
	private static Chosenitempage chosen_item_page;
	private static Homepage home_page;
	private static Totalverificationpage total_verification_page;
	
	public void initializePageObjects()
	{
		chosen_categpry_page = new Chosencategorypage();
		chosen_item_page = new Chosenitempage();
		home_page = new Homepage();
		total_verification_page = new Totalverificationpage();
	}
	
	public static Chosencategorypage getChosen_categpry_page() {
		return chosen_categpry_page;
	}

	public static Chosenitempage getChosen_item_page() {
		return chosen_item_page;
	}

	public static Homepage getHome_page() {
		return home_page;
	}
	
	public static Totalverificationpage getTotal_verification_page() {
		return total_verification_page;
	}
}

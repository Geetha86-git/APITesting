package com.pages;

public class Initializepages {

	private ChooseCategory choose_category;
	private ChooseProduct choose_product;
	private AddCart add_cart;
	
	public ChooseCategory getChoose_category() {
		return choose_category;
	}

	public ChooseProduct getChoose_product() {
		return choose_product;
	}

	public AddCart getAdd_cart() {
		return add_cart;
	}
	
	public void setChoose_category(ChooseCategory choose_category) {
		this.choose_category = choose_category;
	}

	public void setChoose_product(ChooseProduct choose_product) {
		this.choose_product = choose_product;
	}

	public void setAdd_cart(AddCart add_cart) {
		this.add_cart = add_cart;
	}


	public void InitializePageObjects()
	{
		choose_product = new ChooseProduct();
		add_cart = new AddCart();
		choose_category = new ChooseCategory();
	}
	
}

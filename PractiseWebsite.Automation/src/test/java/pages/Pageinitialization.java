package pages;

public class Pageinitialization {

	Chooseproducts choose_products;
	Productverification product_verification;

	public Chooseproducts getChoose_products() {
		return choose_products;
	}
	
	public Productverification getProduct_verification() {
		return product_verification;
	}

	public void initializepage()
	{
		choose_products = new Chooseproducts();
		product_verification = new Productverification();
	}
}

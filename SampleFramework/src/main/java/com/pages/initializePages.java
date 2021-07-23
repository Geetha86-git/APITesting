package com.pages;

public class initializePages {
	
	private LandingPage landing_page;

	public LandingPage getLanding_page() {
		return landing_page;
	}
	
	public void initializePageObjects()
	{
		landing_page = new LandingPage();
	}

}

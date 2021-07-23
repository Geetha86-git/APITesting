package com.businesscomponents;

import org.openqa.selenium.WebDriver;

import com.pages.Selectpage;

public class Selectoperations extends Selectpage{
		
	public void bookTicket(WebDriver driver) throws InterruptedException {
		
		launchUrl(driver,"http://www.goibibo.com");
		selectTrip(driver);
		sourceCity(driver,"Delhi");
		destinationCity(driver,"Coimbatore");
		selectStartDate(driver,"20210525");
		selectReturnDate(driver, "20210725");
		chooseClass(driver, "2", "1", "1", "Business");
		
	}
	
}
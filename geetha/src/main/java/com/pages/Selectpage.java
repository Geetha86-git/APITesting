package com.pages;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utility.Coreutils;

public class Selectpage extends Coreutils{
	
	WebDriver driver;
	
	By tripSelect = By.id("roundTrip");
	By fromID = By.id("gosuggest_inputSrc");
	By destID = By.id("gosuggest_inputDest");
	By departureCalendar = By.id("departureCalendar");
	By returnCalendar = By.id("returnCalendar");
	By returnMonth = By.xpath("//*[@class='DayPicker-Caption']");
	By monthSelection = By.xpath("//*[@class = 'DayPicker-NavButton DayPicker-NavButton--next']");
	By chooseClassAndPassengers = By.id("pax_link_common");
	By adultIncrementer = By.id("adultPaxPlus");
	By childIncrementer = By.id("childPaxPlus");
	By infantsIncrementer = By.id("infantPaxPlus");
	By adultCount = By.id("adultPaxBox");
	By childCount = By.id("childPaxBox");
	By infantsCount = By.id("infantPaxBox");
	By chooseTravelClass = By.id("gi_class");
	By chooseClassClose = By.id("pax_close");
		
	public void launchUrl(WebDriver driver,String url)
	{
		driver.get(url);
	}
	
	public void selectTrip(WebDriver driver) {
		
		clickElement(driver, tripSelect);
	}
	
	public void sourceCity(WebDriver driver,String sourceCity) throws InterruptedException
	{
		setText(driver,fromID, sourceCity);
		WebElement source = driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']"));
		Thread.sleep(3000);
		selectTripLocations(driver,source,"Toronto");
	}
	
	public void destinationCity(WebDriver driver,String destinationCity) throws InterruptedException
	{
		setText(driver,destID, destinationCity);
		WebElement destination = driver.findElement(By.xpath("//*[@id='gosuggest_inputDest']"));
		Thread.sleep(3000);
		selectTripLocations(driver,destination,"Kozhikode");
	}
	
	public void selectStartDate(WebDriver driver,String startDate)
	{	
		clickElement(driver, departureCalendar);
		driver.findElement(By.xpath("//*[@id='fare_"+startDate+"']")).click();
	}
	public void selectReturnDate(WebDriver driver,String returnDate)
	{	
		clickElement(driver, departureCalendar);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "yyyyMMdd" );
		LocalDate localDate = LocalDate.parse( returnDate , formatter ); 
		
		while(!getText(driver,returnMonth).toUpperCase().contains(localDate.getMonth().toString()))
		{
			clickElement(driver, monthSelection);
		}
		driver.findElement(By.xpath("//*[@id='fare_"+returnDate+"']")).click();
		
	}
	
	public void chooseClass(WebDriver driver,String adult,String child,String infant,String chooseClass)
	{
		clickElement(driver, chooseClassAndPassengers);
		
		while(!getAttribute(driver, adultCount).equals(adult))
		{
			clickElement(driver, adultIncrementer);
		}
		while(!getAttribute(driver, childCount).equals(child))
		{
			clickElement(driver, childIncrementer);
		}
		while(!getAttribute(driver, infantsCount).equals(infant))
		{
			clickElement(driver, infantsIncrementer);
		}
		WebElement element = driver.findElement(chooseTravelClass);
		selectDropDownByText(driver, element, chooseClass);
		clickElement(driver, chooseClassClose);
		
	}
}
	

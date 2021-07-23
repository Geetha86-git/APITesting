package com.businessOperations;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.browserComponents.*;
import com.pages.Landingpage;

public class mainClass {
	
		
	public static void main(String args[]) throws InterruptedException
	{
		
		
		Landingpage lp = new Landingpage();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Gee");
		list.add("Priya");
		list.add("Honey");
		
		for(String li:list)
		{
			lp.enterValue(li);
			lp.addValue();
		}
		
		lp.list();
		
	}
}
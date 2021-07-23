package com.mainmethod;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.browserhandling.BaseFunctions;

public class MainMethod extends BaseFunctions{

	@Test
	public void mainMethod()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Geetha");
		list.add("Priya");
		
		getLanding_page().clickTextBox();
		getLanding_page().enterText(list);
		getLanding_page().verifyEnteredElements();
	}
	
}

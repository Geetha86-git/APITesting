package com.pages;
import org.testng.Assert;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.Coreutils;

public class Frontpage extends Coreutils{

	private static By enterName = By.xpath("//div/input[@name='name']");
	private static By enterEmail = By.name("email");
	private static By enterPassword = By.id("exampleInputPassword1");
	private static By checkBox = By.id("exampleCheck1");
	private static By selectGender = By.id("exampleFormControlSelect1");
	private static By radioButton = By.id("inlineRadio1");
	private static By dob = By.name("bday");
	private static By submit = By.xpath("//*[@type='submit']");
	private static By verifyName = By.xpath("//h4/input[@name='name']");
	private static By VerifyFromSubmit = By.xpath("//div/strong[contains(text(),'Success')]");
	private static By shopLink = By.xpath("//ul/li/a[@class='nav-link']");
		
	
	public void enterFields(String name,String email, String pwd, String date)
	{
		setText(enterName, name);
		setText(enterEmail, email);
		setText(enterPassword, pwd);
		setText(dob, date);
	}
	
	public String enterFields(String name)
	{
		return name;
	}
	
	public void selectCheckBox()
	{
		checkRadioClick(checkBox);
		checkRadioClick(radioButton);
	}
	
	public void selectGender(String text)
	{
		selectStaticWebElement(selectGender, text);
	}
	
	public void clickSubmit()
	{
		buttonClick(submit);
	}
	
	public void verifyName(String text)
	{
		String name = getText(verifyName);
		Assert.assertEquals(text,name);
	}
	
	public void verifyMessage()
	{
		if(getText(VerifyFromSubmit).contains("Success"))
		{
			Assert.assertTrue(true, "Form Submitted Successfully");
		}
		else
		{
			Assert.assertFalse(false,"Form Submission was Failure");
		}
	}
	
	public void clickShop(String text)
	{
		for(WebElement links:fetchList(shopLink))
		{
			if(links.getText().equalsIgnoreCase(text))
			{
				links.click();
			}
		}
	
	}
}

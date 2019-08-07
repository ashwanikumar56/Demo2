package com.CRM.QA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * this class contains Page Factory--> OR of login page
 * 
 * 
 * 
 * 
 */

import com.CRM.QA.Base.TestBase;
public class LoginPage extends TestBase
{
	//Page Factory
	@FindBy(name="email") WebElement useremail; 
	
	@FindBy(name="password") WebElement password;

	@FindBy(css="div[class*='ui']") WebElement button;
	
	@FindBy(linkText = "Sign Up") WebElement singupbtn;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
		//initialize in the webelements with the given driver
	}
	
	
	//Actions
	
	public HomePage login(String email,String pass)
	{
		
		useremail.sendKeys(email);
		password.sendKeys(pass);
		button.click();
		
		return new HomePage();
	}
	

}

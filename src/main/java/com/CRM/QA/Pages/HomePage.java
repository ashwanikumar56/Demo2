package com.CRM.QA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.QA.Base.TestBase;

public class HomePage  extends TestBase 
{
	
	@FindBy(css="span[class^='user']") WebElement Username_label;
	
	@FindBy(linkText ="contacts") WebElement contact;
	
	@FindBy(linkText ="deals") WebElement deals;
	
	@FindBy(linkText ="tasks") WebElement tasks;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public String VerifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public ContactsPage clickContactlink()
	{
		contact.click();
		return new ContactsPage();
	}
	
	public DealPage clickDeals() {
		
		deals.click();
		return new DealPage();
		
	}
	
	public TaskPage clickTask(){
	
		
		tasks.click();
		return new TaskPage();
	}

}

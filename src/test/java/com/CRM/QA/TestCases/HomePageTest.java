package com.CRM.QA.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.QA.Base.TestBase;
import com.CRM.QA.Pages.HomePage;
import com.CRM.QA.Pages.LoginPage;

public class HomePageTest extends TestBase
{
	LoginPage loginPage;
	HomePage homePage;
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("email"),prop.getProperty("password"));
		
	}
	
	
	
	@Test 
	public void verifyHomePageTitleTest() {
		
	String title=	homePage.VerifyHomePageTitle();
	Assert.assertEquals(title,"CRM","Home page title matched");
		
	}
	
	
	

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}

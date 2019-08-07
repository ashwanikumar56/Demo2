package com.CRM.QA.TestCases;

import org.apache.log4j.Priority;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.QA.Base.TestBase;
import com.CRM.QA.Pages.HomePage;
import com.CRM.QA.Pages.LoginPage;

public class LoginPageTest extends TestBase
{
	HomePage homePage;
	LoginPage loginPage ;
	public LoginPageTest() {
		
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		
	}
	
	
	@Test(priority =1 )
	public void loginTest()
	{
		homePage= loginPage.login(prop.getProperty("email"),prop.getProperty("password"));
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}

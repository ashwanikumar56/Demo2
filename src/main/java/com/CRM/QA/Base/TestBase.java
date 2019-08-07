package com.CRM.QA.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CRM.QA.util.TestUtil;

public class TestBase 
{
	public static Properties prop;
	public static WebDriver driver;
	public TestBase() 
	{
		try
		{
		
		prop=new Properties();
		FileInputStream ip=new FileInputStream("/home/qainfotech/eclipse-workspace/POM_Selenium"
				+ "/src/main/java/com/CRM/QA/config/config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("email"));
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void initialization()
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			  System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");  
			    driver=new ChromeDriver();  
		}
		else if(browsername.equals("firebox"))
		{
			
		}
		
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}

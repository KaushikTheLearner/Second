package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.SignInPage;

public class SignInPageTest extends TestBase{
	 SignInPage signin;
	 HomePage homepage;
	
	public SignInPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		signin =new SignInPage();		
	}
	@Test(priority=1)
	public void validateSignInPageTitleTest()
	{
		String title= signin.validateSignInPageTitle();
		Assert.assertEquals(title, "NeoSOFT Technologies - Career Portal Login");
	}
	@Test(priority=2)
	public void loginTest()
	{
	homepage =signin.login(prop.getProperty("email"), prop.getProperty("password"), prop.getProperty("verifycode"));
		
	}
	@AfterMethod
	public void tearDown()
	{
	  driver.close();
	}
}

package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SignInPage extends TestBase{
	
	//Initializing the PageObjects
	public SignInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="loginform-username")
	WebElement email;
	
	@FindBy(id="loginform-password")
	WebElement password;
	
	@FindBy(id="loginform-verifycode")
	WebElement verifycode;
	
	@FindBy(id="m_login_signin_submit")
	WebElement signin;
	
	public WebElement email()
	{
		return email;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement verifycode()
	{
		return verifycode;
	}
	public WebElement signin()
	{
		return signin;
	}
	
	public String validateSignInPageTitle()
	{
		 return driver.getTitle();
	}
	
	public HomePage login(String un, String pw, String vc)
	{
		email.sendKeys(un);
		password.sendKeys(pw);
		verifycode.sendKeys(vc);
		signin.click();
		
		return new HomePage();
	}
	
	

}

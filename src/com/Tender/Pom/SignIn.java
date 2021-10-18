package com.Tender.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	
	
	@FindBy(xpath="//a[@class='signin-btn']")
	private WebElement SignIn;
	
	
	@FindBy(xpath="//input[@id='MobileNumber']")
	private WebElement untbx;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pwtxb;
	
	@FindBy(xpath="//input[@id='submit']")
	private WebElement lgbtn;
	


	public SignIn(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
	}
	
	public void setLogin(String un, String pw) {
		
		SignIn.click();
		
		untbx.sendKeys(un);
		
		pwtxb.sendKeys(pw);
		
		lgbtn.click();
		
		

		
		
		
		}

}

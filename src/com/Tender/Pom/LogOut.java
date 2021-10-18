package com.Tender.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	@FindBy(xpath="//span[contains(@class,'name-of-user')]")
	private WebElement Username;
	
	@FindBy(xpath="//a[normalize-space()='Sign Out']")
	private WebElement logOut;
	
	@FindBy(xpath="//input[@value='Yes']")
	private WebElement button;

	public LogOut(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void Setlogout() throws InterruptedException
	{
		Thread.sleep(2000);
		Username.click();
		logOut.click();
		button.click();
	}
}

package com.Tender.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfile {
	@FindBy(xpath="//span[contains(@class,'name-of-user')]")
	private WebElement Username;

	@FindBy(xpath="//a[text()='My Profile']")
	private WebElement MyProfile;

	@FindBy(xpath="//span[text()='Change Password']")
	private WebElement ChangePassword;

	@FindBy(xpath="//input[@placeholder='Old Password *']")
	private WebElement OldPassword;

	@FindBy(xpath="//input[@placeholder='New password *']")
	private WebElement Newpassword;

	@FindBy(xpath="//input[@placeholder='Confirm New Password *']")
	private WebElement ConfirmNewPassword;

	@FindBy(xpath="//input[@value='change']")
	private WebElement changebutton;

	@FindBy(xpath="//input[@id='Name']")
	private WebElement NameField;
	
	@FindBy(xpath="(//div[@class=\" css-1hb7zxy-IndicatorsContainer\"])[3]")
	private WebElement OperatingLocation;
	
	@FindBy(xpath="//div[text()=\"Assam\"]")
	private WebElement SelectOperatingLocation;
	
	@FindBy(xpath="//input[@placeholder='Enter your company’s name']")
	private WebElement Companyname;
	
	@FindBy(xpath="(//div[@class=\" css-1hb7zxy-IndicatorsContainer\"])[1]")
	private WebElement CityField;
	
	@FindBy(xpath="//div[text()=\"Chittoor\"]")
	private WebElement SelectCityField;
	
	@FindBy(xpath="//input[@placeholder='Enter your website link']")
	private WebElement WebsitelinkField;
	
	@FindBy(xpath="//input[@placeholder='Enter your registered GST number']")
	private WebElement CompanyGST;
	
	@FindBy(xpath="//input[@placeholder='Enter your years of experience']")
	private WebElement YearOfexperience;
	
	@FindBy(xpath="//input[@placeholder='Enter your turnover']")
	private WebElement yourturnover;

	@FindBy(xpath="(//div[@class=\" css-1hb7zxy-IndicatorsContainer\"])[2]")
	private WebElement NatureofWork;
	
	@FindBy(xpath="//div[text()=\"Consumables Raw Materials\"]")
	private WebElement SelectNatureofWork;

	@FindBy(xpath="//input[@value='clear']")
	private WebElement clearbutton;
	
	@FindBy(xpath="//div[@class='form-footer']//input[@type='submit']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//div[@class=\"Alertmsg\"]//div[@class='success']")
	private WebElement Success;
	
	public MyProfile(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void ChangePassword() throws InterruptedException
	{
		Thread.sleep(500);
		Username.click();
		MyProfile.click();
		ChangePassword.click();
		OldPassword.sendKeys("Active@111");
		Newpassword.sendKeys("Active@123");
		ConfirmNewPassword.sendKeys("Active@123");
		changebutton.click();

	}

	public void Myprofile() throws InterruptedException
	{
		Username.click();
		MyProfile.click();
		
		submitbutton.click();
		Success.click();
		String text = Success.getText();
		System.out.println("Success msg : "+text);
		
		NameField.clear();
		NameField.sendKeys("AbhayM");
		
		OperatingLocation.click();
		SelectOperatingLocation.click();
		
		Companyname.clear();
		Companyname.sendKeys("SolutionTechActive");
		
		CityField.click();
		SelectCityField.click();
		
		WebsitelinkField.clear();
		WebsitelinkField.sendKeys("www.ekbazaar.com");
		
		CompanyGST.clear();
		
		if(CompanyGST.isDisplayed()) {
			CompanyGST.sendKeys("18AABC18AABC564654654");
		}else {
			CompanyGST.sendKeys("18AABC18AABC564654654");
		}
		
		YearOfexperience.clear();
		YearOfexperience.sendKeys("11");
		
		yourturnover.clear();
		yourturnover.sendKeys("299987893");
		
		NatureofWork.click();
		
		SelectNatureofWork.click();
		
		clearbutton.click();
		
		System.out.println("Filds are clear");
		
	}
	
	
	

}

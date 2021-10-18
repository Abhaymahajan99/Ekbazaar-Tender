package com.Tender.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentFlow {


	@FindBy(xpath="//a[contains(text(),'Pricing')]")
	private WebElement Price;
	
	@FindBy(xpath="//a[@id='quarterly']")
	private WebElement BuyNow;
	
	@FindBy(xpath="//input[@type='tel']")
	private WebElement PinCode;
	
	@FindBy(xpath="//button[@value='Checkout']")
	private WebElement Checkout;
	
//	@FindBy(xpath="(//div[contains(text(),'Card')])[1]")
//	private WebElement Card;
//	
//	@FindBy(xpath="//div[text()='Card']//input[@id='card_number']")
//	private WebElement Cardnumber;
//	
	@FindBy(xpath="//div[@id='modal-close']")
    private WebElement X; 
	
	@FindBy(xpath="//div[@class=\"svelte-zf5zxn\"]/../../div[1]")
	private WebElement PhonePe;
	
	@FindBy(xpath="//span[@id='footer-cta']")
	private WebElement Pay;
	
	@FindBy(xpath="//button[.=\"Success\"]")
	private WebElement Success;
	
	@FindBy(xpath="//div[.=\"Okay\"]")
	private WebElement Okay;
	
	

	public PaymentFlow(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void HearderPrice() throws InterruptedException
	{
		Price.click();	
	}
	
	public void Payment() throws InterruptedException
	{
		BuyNow.click();	
		Checkout.click();
		PinCode.sendKeys("560076");
		Checkout.click();
		
	}
	public void PaymentGetway() throws InterruptedException
	{
		

		X.click();
	
		/*
		 * PhonePe.click(); Pay.click(); Success.click(); Okay.click();
		 */
		
		
		
		
	}
}

package com.Tender.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterRedirections {


	@FindBy(xpath="//a[text()=\" About Us \"]")
	private WebElement AboutUs;

	@FindBy(xpath="//a[text()='Tender Bazaar']")
	private WebElement TenderBazaar;

	@FindBy(xpath="//a[text()='Investment Bazaar']")
	private WebElement InvestmentBazaar;

	@FindBy(xpath="//a[text()=\"Trade Bazaar\"]")
	private WebElement TradeBazaar;

	@FindBy (xpath="//a[text()=\"Pricing\"]")
	private WebElement Pricing;

	@FindBy(xpath="//a[text()=\" FAQs\"]")
	private WebElement FAQs;

	@FindBy(xpath="//a[text()='Customer Care']")
	private WebElement CustomerCare; 

	@FindBy(xpath="//a[text()=' Privacy Policy']")
	private WebElement PrivacyPolicy;


	@FindBy(xpath="//a[text()=' Terms and Conditions']")
	private WebElement TermsAndConditions;

	@FindBy(xpath="//a[text()='Latest Tenders']")
	private WebElement LatestTenders;

	@FindBy(xpath="//a[text()='  Industry ']")
	private WebElement Industry;

	@FindBy(xpath="//a[text()='State']")
	private WebElement State;

	@FindBy(xpath="(//a[text()=' Authorities'])[2]")
	private WebElement Authorities;
	
	

	@FindBy(xpath="(//a[@rel=\"noopener noreferrer\"])[3]")
	private WebElement GooglePlay;

	@FindBy(xpath="(//a[@rel=\"noopener noreferrer\"])[4]")
	private WebElement AppStore;

	@FindBy(xpath="(//a[@rel=\"noopener noreferrer\"])[6]")
	private WebElement twitter;

	@FindBy(xpath="(//a[@rel=\"noopener noreferrer\"])[5]")
	private WebElement facebook;

	@FindBy(xpath="//a[text()='Refund & Cancellation ']")
	private WebElement RefundAndCancellation;

	public FooterRedirections(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void AboutUs() throws InterruptedException
	{
		AboutUs.click();	
	}

	public void TenderBazaar() throws InterruptedException
	{

		TenderBazaar.click();
	}
	public void InvestmentBazaar() {

		InvestmentBazaar.click();
	}
	public void TradeBazaar() {
		TradeBazaar.click();
	}
	public void Pricing() {
		Pricing.click();
	}

	public void FAQs() {
		FAQs.click();
	}

	public void CustomerCare() {
		CustomerCare.click();
	}

	public void PrivacyPolicy() {

		PrivacyPolicy.click();
	}

	public void TermsAndConditions() {
		TermsAndConditions.click();
	}
	public void RefundAndCancellation()   {
		RefundAndCancellation.click();
	}

	public void LatestTenders() {
		LatestTenders.click();
	}

	public void Industry() {
		Industry.click();
	}
	
	public void State() {
		State.click();
	}

	public void Authorities() {
		Authorities.click();
	}
	
	public void GooglePlay() {
		GooglePlay.click();
	}
	public void AppStore() {
		AppStore.click();
	}
	public void facebook() {
		facebook.click();
	}
	
	public void twitter()   throws InterruptedException{
		twitter.click();
	}

	
}
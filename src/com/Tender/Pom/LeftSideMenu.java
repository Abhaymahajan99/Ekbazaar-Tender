package com.Tender.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;

public class LeftSideMenu {


	@FindBy(xpath="//div[contains(@class,'hamburger-web')]")
	private WebElement LeftMenuButton;

	@FindBy(xpath="//ul[@class='tender']//a[normalize-space()='Pricing']")
	private WebElement Pricing;

	@FindBy(xpath="//a[normalize-space()='Buy Now']")
	private WebElement BuyNow;

	@FindBy(xpath="(//a[text()='Popularity'])[1]")
	private WebElement Popularity;
	@FindBy(xpath="//li[contains(text(),'popularity')]")
	private WebElement PopularTender;

	@FindBy(xpath="(//a[text()='Latest'])[1]")
	private WebElement Latest;

	@FindBy(xpath="//li[contains(text(),'new')]")
	private WebElement LatestTenders;

	@FindBy(xpath="//a[text()='Closing Date']")
	private WebElement ClosingDate;
	@FindBy(xpath="(//div[@class='conatiner'])[4]")
	private WebElement ClosingDatePage;

	@FindBy(xpath="(//a[text()='Value'])[1]")
	private WebElement Value;
	@FindBy(xpath="//div[@class=\"form\"]")
	private WebElement SearchTendersByValue;

	@FindBy(xpath="(//a[text()='Department'])[1]")
	private WebElement Department;
	@FindBy(xpath="//div[@class=\"common-component\"]")
	private WebElement SearchTendersByDepartment;

	@FindBy(xpath="//a[text()='Authorities '][1]")
	private WebElement Authorities;

	@FindBy(xpath="//div[@class=\"common-component\"]")
	private WebElement SearchTendersByAuthorities;

	@FindBy(xpath="(//a[text()='State'])[1]")
	private WebElement State;
	@FindBy(xpath="//div[@class=\"common-component\"]")
	private WebElement SearchTendersbyState;

	@FindBy(xpath="(//a[text()='Industry'])[1]")
	private WebElement Industry;

	@FindBy(xpath="//div[@class=\"common-component\"]")
	private WebElement SearchTendersbyIndustry;

	@FindBy(xpath="(//a[text()='Favourites'])[1]")
	private WebElement Favourites;
	@FindBy(xpath="//div[@class='card-sol'][1]")
	private WebElement FavouritesTenders;

	@FindBy(xpath="(//a[text()='My Interests'])[1]")
	private WebElement MyInterests;
	@FindBy(xpath="//li[text()='All']")
	private WebElement MyInterestsPage;

	@FindBy(xpath="(//a[.='Trade Bazaar'])[1]")
	private WebElement TraddBazaar;
	@FindBy(xpath="(//a[.='Investment Bazaar'])[1]")
	private WebElement InvestmentBazaar;

	@FindBy(xpath="//img[@alt='logo']")

	private WebElement EkBazaarlogo;



	public LeftSideMenu(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void LeftMenu() throws InterruptedException
	{
		Thread.sleep(500);

		LeftMenuButton.click();
		if(Pricing.isDisplayed()){

			Pricing.click();

		}else {

			Pricing.click();
		}

		BuyNow.isDisplayed();
		Reporter.log("LeftSideMenu Pricing",true);
		Thread.sleep(200);

		LeftMenuButton.click();

		if(Popularity.isDisplayed()){

			Popularity.click();

		}else {

			Popularity.click();
		}


		PopularTender.isSelected();
		Reporter.log("LeftSideMenu Popularity",true);

		Thread.sleep(200);
		LeftMenuButton.click();

		if(	Latest.isDisplayed()){

			Latest.click();

		}else {

			Latest.click();
		}

		LatestTenders.isSelected();
		Reporter.log("LeftSideMenu Latest",true);

		Thread.sleep(200);
		LeftMenuButton.click();
		ClosingDate.click();
		//ClosingDatePage.isDisplayed();
		Reporter.log("LeftSideMenu ClosingDate",true);

		Thread.sleep(200);
		LeftMenuButton.click();
		Value.click();
		SearchTendersByValue.isDisplayed();		
		Reporter.log("LeftSideMenu Value",true);

		Thread.sleep(200);
		LeftMenuButton.click();

		if(	Department.isDisplayed()){

			Department.click();

		}else {

			Department.click();
		}

		SearchTendersByDepartment.isDisplayed();		
		Reporter.log("LeftSideMenu Department",true);

		Thread.sleep(200);
		LeftMenuButton.click();

		if(	Authorities.isDisplayed()){

			Authorities.click();

		}else {

			Authorities.click();
		}
		Reporter.log("LeftSideMenu Authorities",true);
		//SearchTendersByAuthorities.isDisplayed();

		Thread.sleep(200);
		LeftMenuButton.click();

		if(	State.isDisplayed()){

			State.click();

		}else {

			State.click();
		}
		SearchTendersbyState.isDisplayed();
		Reporter.log("LeftSideMenu State",true);

		Thread.sleep(200);
		LeftMenuButton.click();

		if(	Industry.isDisplayed()){

			Industry.click();

		}else {

			Industry.click();
		}

		SearchTendersbyIndustry.click();
		Reporter.log("LeftSideMenu Industry",true);

		Thread.sleep(200);
		LeftMenuButton.click();

		if(	Favourites.isDisplayed()){

			Favourites.click();
		}else {

			Favourites.click();
		}
		FavouritesTenders.isDisplayed();
		Reporter.log("LeftSideMenu Favourites",true);

		Thread.sleep(200);
		LeftMenuButton.click();


		if(	MyInterests.isDisplayed()){
			MyInterests.click();
		}else {

			MyInterests.click();
			Reporter.log("LeftSideMenu MyInterests",true);
		}
		//MyInterestsPage.isDisplayed();
	}




	public void ClickTraddBazaar() throws InterruptedException {
		Thread.sleep(200);
		LeftMenuButton.click();

		TraddBazaar.click();
		Reporter.log("TraddBazaar",true);

	}

	public void ClickOnInvestmentBazaar() throws InterruptedException {

		Thread.sleep(300);

		LeftMenuButton.click();
		InvestmentBazaar.click();
		Reporter.log("InvestmentBazaar",true);



	}


}

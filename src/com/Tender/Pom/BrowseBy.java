package com.Tender.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BrowseBy {
	
	
	
	@FindBy(xpath="//a[text()='All']")
	private WebElement All;
	@FindBy(xpath="//div[@class=\"card-sol\"][1]")
	private WebElement LiveTenders;
	
	@FindBy(xpath="//a[text()=\" Industry\"]")
	private WebElement Industry;
	@FindBy(xpath="//div[@class=\"common-component\"]")
	private WebElement SearchTendersbyIndustry;
	
	@FindBy(xpath="//a[contains(text(),'State')]")
	private WebElement State;
	@FindBy(xpath="//div[@class=\"common-component\"]")
	private WebElement SearchTendersbyState;
	
	@FindBy(xpath="//a[contains(text(),'Authorities')]")
	private WebElement Authorities;
	@FindBy(xpath="//div[@class=\"common-component\"]")
	private WebElement SearchTendersByAuthorities;
	
	@FindBy(xpath="//a[normalize-space()='Department']")
	private WebElement Department;
	@FindBy(xpath="//div[@class=\"common-component\"]")
	private WebElement SearchTendersByDepartment;
	
	@FindBy(xpath="//a[normalize-space()='Value']")
	private WebElement Value;
	@FindBy(xpath="//div[@class=\"form\"]")
	private WebElement SearchTendersByValue;
	
	@FindBy(xpath="//a[normalize-space()='Latest']")
	private WebElement Latest;
	@FindBy(xpath="//li[contains(text(),'new')]")
	private WebElement LatestTenders;
	
	@FindBy(xpath="//a[normalize-space()='Popularity']")
	private WebElement Popularity;
	@FindBy(xpath="//li[contains(text(),'popularity')]")
	private WebElement PopularTender;
	
	@FindBy(xpath="//a[normalize-space()='Favourites']")
	private WebElement Favourites;
	@FindBy(xpath="//div[@class='card-sol'][1]")
	private WebElement FavouritesTenders;
	
	
	@FindBy(xpath="//a[normalize-space()='My Interests']")
	private WebElement MyInterests;
	
	@FindBy(xpath="//li[text()='All']")
	private WebElement MyInterestsPage;
	
	/*
	 * @FindBy(xpath="//li[text()='All']") private WebElement MyInterestsPage;
	 */
	

	public BrowseBy(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void Browse() throws InterruptedException
	{
		Thread.sleep(500);
		All.click();
		LiveTenders.isDisplayed();
		Reporter.log("BrowseBy All",true);
		
		Industry.click();
		SearchTendersbyIndustry.isDisplayed();
		Reporter.log("BrowseBy Industry",true);
		
		State.click();
		SearchTendersbyState.isDisplayed();
		Reporter.log("BrowseBy State",true);
		
		Authorities.click();
		SearchTendersByAuthorities.isDisplayed();
		Reporter.log("BrowseBy Authorities",true);
		
		Department.click();
		SearchTendersByDepartment.isDisplayed();
		Reporter.log("BrowseBy Department",true);
		
		Value.click();
		SearchTendersByValue.isDisplayed();
		Reporter.log("BrowseBy Value",true);
		
		Latest.click();
		LatestTenders.isSelected();
		Reporter.log("BrowseBy Latest",true);
		
		Popularity.click();
		PopularTender.isSelected();
		Reporter.log("BrowseBy Popularity",true);
		
		Favourites.click();
		FavouritesTenders.isDisplayed();
		Reporter.log("BrowseBy Favourites",true);
		
		MyInterests.click();
		//MyInterestsPage.isSelected();
		Reporter.log("BrowseBy MyInterests",true);
		Thread.sleep(500);
		
		
	}

}

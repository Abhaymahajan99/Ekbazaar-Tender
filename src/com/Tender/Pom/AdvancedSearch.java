package com.Tender.Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AdvancedSearch {

	@FindBy(xpath="//a[text()='Advanced Search ']")
	private WebElement AdvancedSearch;

	@FindBy(xpath="//div[text()='Enter Keyword']")
	private WebElement SearchbyKeyword;

	@FindBy(xpath="//div[text()='3d Graphic System']")
	private WebElement SelectSearchbyKeyword;

	@FindBy(xpath="(//input[@value='Submit'])[1]")
	private WebElement Submit;

	@FindBy(xpath="//input[@placeholder='Enter TID']")
	private WebElement SearchbyTID;

	@FindBy(xpath="//div[@class=\"card-sol\"]")
	private WebElement result;
	
	@FindBy(xpath="//div[@class='industry controlling']//div[@class='advance__value-container advance__value-container--is-multi css-g1d714-ValueContainer']")
	private WebElement Indutry;
	
	@FindBy(xpath="//div[.=\"Aluminium\"]")
	private WebElement SelectAluminium;
	
	@FindBy(xpath="//label[.=\"Document\"]")
	private WebElement Document;
	
	@FindBy(xpath="//div[@class='Company-Ownership controlling']//div[@class='advance__value-container advance__value-container--is-multi css-g1d714-ValueContainer']")
	private WebElement CompanyOwnership;
	
	@FindBy(xpath="//div[.=\"State Government\"]")
	private WebElement SelectCompanyOwnership;
	
	@FindBy(xpath="//div[@class='Tender-Type controlling']//div[@class='advance__value-container advance__value-container--is-multi css-g1d714-ValueContainer']")
	private WebElement TenderType;
	
	@FindBy(xpath="//div[.=\"Buy And Sell\"]")
	private WebElement SelectTenderType;
	
	@FindBy(xpath="//div[@class='Company-industry controlling']//div[@class='advance__value-container advance__value-container--is-multi css-g1d714-ValueContainer']")
	private WebElement Authorities;
	
	@FindBy(xpath="//div[.=\"A C C Limited\"]")
	private WebElement SelectAuthorities;
	
	@FindBy(xpath="//div[@class='advance__value-container advance__value-container--has-value css-g1d714-ValueContainer']")
	private WebElement TenderStatus;
	
	@FindBy(xpath="//div[text()='Archive']")
	private WebElement SelectTenderStatus;
	
	@FindBy(xpath="//input[@placeholder='Select']")
	private WebElement TenderPostingDate;
	
	@FindBy(xpath="//input[@placeholder='Select From Date']")
	private WebElement TenderClosingDate1;
	
	@FindBy(xpath="//input[@placeholder='Select To Date']")
	private WebElement TenderClosingDate2;
	
	@FindBy(xpath="//span[@class='rct-title'][text()='east']")
	private WebElement SelectRegion;

	@FindBy(xpath="//div[@class='val-btn mobhide']//input[@value='clear']")
	private WebElement Clearbutton;


	public AdvancedSearch(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void AdvancedField1() throws InterruptedException
	{

		AdvancedSearch.click();
		SearchbyKeyword.click();
		SelectSearchbyKeyword.click();
		Submit.click();

		AdvancedSearch.click();

		SearchbyTID.sendKeys("10000-9029",Keys.ENTER);


		if (result.isDisplayed()) {
			String text = result.getText();

			System.out.println("SearchbyTID :"+text);
			Reporter.log("SearchbyTID",true);

		}
	}
	public void AdvancedField2() throws InterruptedException
	{
		AdvancedSearch.click();
		Indutry.click();
		SelectAluminium.click();
		Document.click();
		CompanyOwnership.click();
		SelectCompanyOwnership.click();
		TenderType.click();
		SelectTenderType.click();
		Authorities.click();
		SelectAuthorities.click();
		TenderStatus.click();
		SelectTenderStatus.click();
		TenderPostingDate.sendKeys("March 13, 2021 ",Keys.ENTER);
		TenderClosingDate1.sendKeys("June 20, 2021 ",Keys.ENTER);
		TenderClosingDate2.sendKeys("June 10, 2022 ",Keys.ENTER);
		
		SelectRegion.click();
		
		Clearbutton.click();
		Thread.sleep(2000);
		
	}
	
	public void AdvancedField3() throws InterruptedException
	{
		AdvancedSearch.click();
		Indutry.click();
		SelectAluminium.click();
		Document.click();
		CompanyOwnership.click();
		SelectCompanyOwnership.click();
		TenderType.click();
		SelectTenderType.click();
		Authorities.click();
		SelectAuthorities.click();
		TenderStatus.click();
		SelectTenderStatus.click();
		TenderPostingDate.sendKeys("March 13, 2021 ",Keys.ENTER);
		TenderClosingDate1.sendKeys("June 20, 2021 ",Keys.ENTER);
		TenderClosingDate2.sendKeys("June 10, 2022 ",Keys.ENTER);
		SelectRegion.click();
		
		Submit.click();
		Thread.sleep(2000);
		}
	

}


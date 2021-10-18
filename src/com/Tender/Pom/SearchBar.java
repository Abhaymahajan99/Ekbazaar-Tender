package com.Tender.Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SearchBar {

	@FindBy(xpath="//input[@placeholder='Search by Keyword or T.No']")
	private WebElement SearchBarField;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement SearchButton;

	@FindBy(xpath="(//div[@class=\"card-sol\"])[1]")
	private WebElement Tender;



	public SearchBar(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void SearchbyKeyword() throws InterruptedException
	{

		SearchBarField.sendKeys("Piezometer");

		SearchButton.click();

		if (Tender.isDisplayed()) {

			String text1 = Tender.getText();

			System.out.println("SearchbyKeyword"+text1);

			Reporter.log("SearchbyKeyword",true);
		}
		Thread.sleep(2000);
	}
	public void SearchbyKeyword2() throws InterruptedException
	{

		SearchBarField.sendKeys("Cloth Bag",Keys.ENTER);

		if (Tender.isDisplayed()) {

			String text = Tender.getText();

			System.out.println("SearchbyKeyword2"+text);

			Reporter.log("SearchbyTwoKeyword",true);

		}

	}

	public void SearchbyTenderNO() throws InterruptedException
	{

		SearchBarField.sendKeys("GEM/2020/B/849999");

		SearchButton.click();

		if (Tender.isDisplayed()) {

			String text2 = Tender.getText();

			System.out.println("SearchbyTenderNumber :"+text2);
			Reporter.log("SearchbyTenderNumber",true);
			
			
		}}

	public void SearchbyAuthorities() throws InterruptedException
	{

		SearchBarField.sendKeys("Anna University");

		SearchButton.click();

		if (Tender.isDisplayed()) {

			String text2 = Tender.getText();

			System.out.println("SearchbyAuthorities :"+text2);
			Reporter.log("SearchbyAuthorities",true);
			
		}


	}

}
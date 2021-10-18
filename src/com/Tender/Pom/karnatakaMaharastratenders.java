package com.Tender.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class karnatakaMaharastratenders {

	@FindBy(xpath="(//div[@class=\"card_tender\"])[1]")
	private WebElement KarnatakaTenders1;

	@FindBy(xpath="(//div[@class=\"card_tender\"])[2]")
	private WebElement KarnatakaTenders2;

	@FindBy(xpath="(//div[@class=\"card_tender\"])[3]")
	private WebElement KarnatakaTenders3;

	@FindBy(xpath="(//div[@class=\"card_tender\"])[5]")
	private WebElement MaharastraTenders1;

	@FindBy(xpath="(//div[@class=\"card_tender\"])[6]")
	private WebElement MaharastraTenders2;

	@FindBy(xpath="(//div[@class=\"card_tender\"])[7]")
	private WebElement MaharastraTenders3;






	public karnatakaMaharastratenders(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void karnatakaTenders1() throws InterruptedException
	{
		if (KarnatakaTenders1.isDisplayed()) {
			String text = KarnatakaTenders1.getText();

			System.out.println("karnatakaTenders1 :"+text);
			Reporter.log("karnatakaTenders1",true);


		}else
			System.out.println("karnatakaTender1 Not Displaying");

	}
	public void karnatakaTenders2() throws InterruptedException
	{

		if (KarnatakaTenders2.isDisplayed()) {
			String text = KarnatakaTenders2.getText();

			System.out.println("karnatakaTenders2 :"+text);
			Reporter.log("karnatakaTenders2",true);	
		}else
			System.out.println("karnatakaTender2 Not Displaying");
	}
	public void karnatakaTenders3() throws InterruptedException
	{

		if (KarnatakaTenders3.isDisplayed()) {
			String text = KarnatakaTenders3.getText();

			System.out.println("karnatakaTenders3 :"+text);
			Reporter.log("karnatakaTenders3",true);

		}
		else
			System.out.println("karnatakaTender3 Not Displaying");
	}

	public void MaharastraTenders1() throws InterruptedException
	{
		if (MaharastraTenders1.isDisplayed()) {
			String text = MaharastraTenders1.getText();

			System.out.println("MaharastraTenders1 :"+text);
			Reporter.log("MaharastraTenders1",true);

		}
		else
			System.out.println("MaharastraTenders1 Not Displaying");
	}
	public void MaharastraTenders2() throws InterruptedException
	{
		if (MaharastraTenders2.isDisplayed()) {
			String text = MaharastraTenders2.getText();

			System.out.println("MaharastraTenders2 :"+text);
			Reporter.log("MaharastraTenders2",true);

		}
		else
			System.out.println("MaharastraTenders2 Not Displaying");}
	public void MaharastraTenders3() throws InterruptedException
	{
		if (MaharastraTenders3.isDisplayed()) {
			String text = MaharastraTenders3.getText();

			System.out.println("MaharastraTenders3 :"+text);
			Reporter.log("MaharastraTenders3",true);

		}
		else
			System.out.println("MaharastraTenders3 Not Displaying");}
}

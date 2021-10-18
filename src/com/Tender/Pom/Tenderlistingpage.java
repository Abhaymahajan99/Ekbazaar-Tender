package com.Tender.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tenderlistingpage {

	@FindBy(xpath="//a[text()='All']")
	private WebElement All;

	@FindBy(xpath="(//h2[contains(text(),' ')])[2]")
	private WebElement Cart;
	
	@FindBy(xpath="//div[@class='Wishlist']//div//button")
	private WebElement Fav;
	
	@FindBy(xpath="(//li[@title='Ask an expert'])[1]")
	private WebElement Askanexpert;
	
	@FindBy(xpath="//textarea[@id='comments']")
	private WebElement comments;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement Submit;
	
	@FindBy(xpath="//div[@class=\"Alertmsg\"]//div[@class='success']")
	private WebElement Success;
	
	@FindBy(xpath="//div[@class=\"Alertmsg\"]//div[@class='danger']")
	private WebElement danger;
	
	@FindBy(xpath="(//li[@title=\"Get e-mail alerts\"])[1]")
	private WebElement EmailAlerts;
	
	@FindBy(xpath="(//li[@title=\"Save to favorites\"])[1]")
	private WebElement SaveToFavorites;
	
	@FindBy(xpath="//div[@class=\"set-alert\"]")
	private WebElement SetAlert;
	
	@FindBy(xpath="//div[@class='download']//div//button")
	private WebElement download;
	
	@FindBy(xpath="//div[@class='share']//div//button")
	private WebElement Share;
	
	@FindBy(xpath="//div[@class=\"content\"]")
	private WebElement content;
	
	@FindBy(xpath="(//button[@class='view-more-ancmnt'])[1]")
	private WebElement view;
	
	

	public Tenderlistingpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void Listingpage() throws InterruptedException
	{
		All.click();
		EmailAlerts.click();
		Success.click();
		String text = Success.getText();
		System.out.println("EmailAlerts Success Msg:"+text);
		
		SaveToFavorites.click();
		Success.click();
		String text1 = Success.getText();
		System.out.println("EmailAlerts Success Msg:"+text1);
		
	}
	
	public void AskAndExpert() throws InterruptedException
	{
		Askanexpert.click();
		comments.sendKeys("Automated test comment");
		Submit.click();
		Success.click();
		String text = Success.getText();
		System.out.println("Ask an Expert Success Msg:"+text);
		
	}
	
	
	
	public void ClickCart() throws InterruptedException
	{
		
		Cart.click();
		
		SetAlert.click();
		String text1 = Success.getText();
		System.out.println("In Cart SetAlerts Msg:"+text1);
		
		Fav.click();
		String text2 = Success.getText();
		System.out.println("In Cart Favourites Msg:"+text2);
		
		download.click();
		String text3 = danger.getText();
		System.out.println("In Cart download Msg:"+text3);
		
		Share.click();
		String text4 =content.getText();
		System.out.println("In Cart download Msg:"+text4);
	}
	
	public void ViewMore() throws InterruptedException
	{
		if(view.isDisplayed()) {
			view.click();
		}else {
			view.click();
		}
	}
	
	
}

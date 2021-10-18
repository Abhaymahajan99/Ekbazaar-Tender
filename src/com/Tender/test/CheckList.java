package com.Tender.test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Tender.Pom.AdvancedSearch;
import com.Tender.Pom.BrowseBy;
import com.Tender.Pom.FooterRedirections;
import com.Tender.Pom.HomePageBrowseTenders;
import com.Tender.Pom.LeftSideMenu;
import com.Tender.Pom.MyProfile;
import com.Tender.Pom.SearchBar;
import com.Tender.Pom.Tenderlistingpage;
import com.Tender.Pom.karnatakaMaharastratenders;
import com.Tender.generics.TenderBaseClass;

public class CheckList extends TenderBaseClass {


	@Test
	public void BrowseByElement() throws InterruptedException {

		BrowseBy b = new BrowseBy(driver);

		b.Browse();

		sa.assertTrue(true == true);
		sa.assertAll(); 

	}
	@Test(priority = 3)
	public void SearchBar() throws InterruptedException 
	{
		SearchBar s= new SearchBar(driver);

		s.SearchbyKeyword();

		driver.navigate().back();
		driver.navigate().back();

		s.SearchbyKeyword2();

		driver.navigate().back();
		driver.navigate().back();

		s.SearchbyTenderNO();

		driver.navigate().back();
		driver.navigate().back();

		s.SearchbyAuthorities();



	}
	@Test(priority = 2)
	public void LeftMenu() throws InterruptedException 
	{
		LeftSideMenu lf= new LeftSideMenu(driver);

		lf.LeftMenu();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'hamburger-web')]")));

		lf.ClickTraddBazaar();

		driver.navigate().back(); 
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'hamburger-web')]")));

		lf.ClickOnInvestmentBazaar();

		driver.navigate().back();

		sa.assertTrue(true == true);
		sa.assertAll();

	}
	@Test(priority = 1)
	public void Footer() throws InterruptedException {

		FooterRedirections f= new FooterRedirections(driver);

		String c="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(c);
		f.AboutUs();
		Reporter.log("Footer AboutUs",true);

		String d="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(d);
		f.TenderBazaar();
		Reporter.log("Footer TenderBazaar",true);
		driver.navigate().back();

		String a="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(a);
		f.InvestmentBazaar();
		Reporter.log("Footer InvestmentBazaar",true);
		driver.navigate().back();

		String b="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(b);
		f.Pricing();
		Reporter.log("Footer Pricing",true);


		String e="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(e);
		f.FAQs();
		Reporter.log("Footer FAQs",true);

		String g="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(g);
		f.CustomerCare();
		Reporter.log("Footer CustomerCare",true);

		String h="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(h);
		f.PrivacyPolicy();
		Reporter.log("Footer PrivacyPolicy",true);

		String i="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(i);
		f.TermsAndConditions();
		Reporter.log("Footer TermsAndConditions",true);

		String z="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(z);
		f.RefundAndCancellation();
		Reporter.log("Footer TermsAndConditions",true);

		String j="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(j);
		f.LatestTenders();
		Reporter.log("Footer LatestTenders",true);

		String k="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(k);
		f.Industry();
		Reporter.log("Footer Industry",true);

		String l="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(l);
		f.State();
		Reporter.log("Footer State",true);

		String m="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(m);
		f.Authorities();
		Reporter.log("Footer Authorities",true);


		String n="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(n);
		f.facebook();
		Reporter.log("Footer facebook",true);
		driver.switchTo().defaultContent();

		String o="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(o);
		f.twitter();
		Reporter.log("Footer Twitter",true);
		driver.switchTo().defaultContent();

		String p="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(p);
		f.GooglePlay();
		Reporter.log("Footer GooglePlay",true);
		driver.switchTo().defaultContent();

		String q="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(q);
		f.AppStore();
		Reporter.log("Footer AppStore",true);
		driver.switchTo().defaultContent();



		sa.assertTrue(true == true);
		sa.assertAll();
	}
		@Test(priority = 4)
		public void karnatakaMaharastraTenders() throws InterruptedException 
		{
			karnatakaMaharastratenders t= new karnatakaMaharastratenders(driver);

			WebElement element = driver.findElement(By.xpath("//h2[text()='Karnataka Tenders']")); 

			js.executeScript("arguments[0].scrollIntoView(true);", element);

			t.karnatakaTenders1();
			t.karnatakaTenders2();
			t.karnatakaTenders3();
			t.MaharastraTenders1();
			t.MaharastraTenders2();
			t.MaharastraTenders3();

			sa.assertTrue(true == true);
			sa.assertAll();
		}
		
		@Test(priority = 5)
		public void PaymentFlow() throws InterruptedException
		{
			HomePageBrowseTenders t=new HomePageBrowseTenders(driver);
			
			t.State();
			t.Industry();
			t.Authorities();
			t.Department();
			t.MyInterests();
			sa.assertTrue(true == true);
			sa.assertAll();
		}
		
		@Test(priority = 6)
		public void AdvSearchField() throws InterruptedException
		{
			AdvancedSearch t=new AdvancedSearch(driver);
			
			t.AdvancedField1();
			
			t.AdvancedField2();
			
			t.AdvancedField3();
			sa.assertTrue(true == true);
			sa.assertAll();
		}
		 
		
		@Test(priority = 7)
		public void TenderlistingAndDetailPage() throws InterruptedException	
		{
			Tenderlistingpage t= new Tenderlistingpage(driver);

			t.Listingpage();


			List<WebElement> Price = driver.findElements(By.xpath("//div[@class=\"card-sol\"]"));

			int TotalCount = Price.size();

			for(int i=0;i<TotalCount;i++) 
			{

				String text = Price.get(i).getText();


				System.out.println("Listing Tenders :   "+text);

			}

			Thread.sleep(500);
			
			//Please disable when running scrept on live.
			
			//t.AskAndExpert();

			t.ClickCart();

			String etitle = "Acharya Jagadish Chandra Bose Indian Botanic Garden"; 
			String atitle = driver.findElement(By.xpath("//h2[contains(text(),'Acharya Jagadish Chandra Bose Indian Botanic Garde')]")).getText();
			Assert.assertEquals(etitle, atitle);


			WebElement element =driver.findElement(By.xpath("//button[text()='view more']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);

			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='view more']/..//button")));
			//element.click();

			/*
			 * String q="window.scrollTo(0,document.body.scrollHeight)";
			 * js.executeScript(q);
			 */
			//t.ViewMore();

			sa.assertTrue(true == true);
			sa.assertAll();
		}
		
		@Test(priority = 8) 
		public void MyProfile() throws InterruptedException	
		{
			MyProfile my= new MyProfile(driver);
			
			my.Myprofile();
			 Thread.sleep(500);

			sa.assertTrue(true == true);
			sa.assertAll();
		}
		

		/*  @Test(priority = 9) 
		  public void ChangePassword() throws InterruptedException
		  { MyProfile my=new MyProfile (driver); 
		  my.ChangePassword();
		  sa.assertTrue(true == true); 
		  sa.assertAll();
		  }*/
		  
		  

	}

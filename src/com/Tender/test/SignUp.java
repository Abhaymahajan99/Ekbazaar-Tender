package com.Tender.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	static
	{
		System.setProperty("webdriver.chrome.driver", "/Users/activemac03/Documents/chromedriver");
	}

	public static void main(String[] args) throws InterruptedException,IndexOutOfBoundsException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://tenders.ekbazaar.com/");

		driver.findElement(By.xpath("//a[@class=\"Register-cs\"]")).click();

		driver.findElement(By.xpath("//input[@id=\"Mobile\"]")).sendKeys("8770041250");

		driver.findElement(By.className("get_otp")).click();

		driver.findElement(By.xpath("//input[@data-testid=\"input\"]")).sendKeys("1234");

		driver.findElement(By.className("otp-validate-btn")).click();

		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Active@123");

		driver.findElement(By.xpath("//input[@id=\"Confirm-Password\"]")).sendKeys("Active@123");

		driver.findElement(By.className("submit-to-cnfrm-pass-btn")).click();

		driver.findElement(By.className("proceed-next-btn")).click();

		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("AbhayAutomation");

		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abh@active.agency");

		driver.findElement(By.xpath("//*[@id=\"toggleremove\"]/div/div[1]")).click();

		driver.findElement(By.xpath("//div[.=\"Anantapur\"]")).click();

		driver.findElement(By.xpath("//input[@id=\"company\"]")).sendKeys("BsNL2");

		driver.findElement(By.xpath("//input[@id=\"submit\"]")).click();

		driver.findElement(By.xpath("//a[.=\"Verify Later\"]")).click();

		driver.findElement(By.className("tender-browse-btn")).click();

		String text = driver.findElement(By.xpath("//div[@class=\"Alertmsg\"]")).getText();

		System.out.println(text);
		
		driver.findElement(By.xpath("//span[.=\"Abrasives\"]")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Type Tender Location (i.e. Karnataka)')]")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Type Tender Location (i.e. Karnataka)')]")).sendKeys("Assam",Keys.ENTER);
		
		

		driver.findElement(By.className("tender-browse-btn")).click();
		String etitle = "EkBazaar - One Nation. One Market. Many Languages."; 
		String atitle = driver.getTitle(); 
		System.out.println("Title name : "+atitle);

		driver.quit();

	}
}
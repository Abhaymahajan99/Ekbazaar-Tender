package com.Tender.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPass {

	static
	{
		System.setProperty("webdriver.chrome.driver", "/Users/activemac03/Documents/chromedriver");
	}

	public static void main(String[] args) throws InterruptedException,IndexOutOfBoundsException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://tenders.ekbazaar.com/");

		driver.findElement(By.xpath("//a[@class='signin-btn']")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Forgot password?')]")).click();

		driver.findElement(By.xpath("//input[@id='Mobile']")).sendKeys("8770041250");

		driver.findElement(By.xpath("//a[@class='get-otp']")).click();

		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@data-testid=\"input\"]")).sendKeys("1234");

		//driver.findElement(By.xpath("//p[@class='verify']")).click();

		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Active@111");

		driver.findElement(By.xpath("//input[@id=\"Confirm-Password\"]")).sendKeys("Active@111");

		driver.findElement(By.xpath("//input[@value='Reset Password']")).click();
		
		
		/*
		 * WebDriverWait wait2 =new WebDriverWait(driver,10);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//input[@id='submit']")));
		 */

		String atitle = driver.findElement(By.xpath("//h2[text()='Password Updated Successfully']")).getText();

		driver.findElement(By.xpath("//a[.='Back to login']")).click();
		
		System.out.println( atitle);

		driver.quit();


	}
}
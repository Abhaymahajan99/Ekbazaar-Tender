package com.Tender.generics;

	import java.io.File;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxOptions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.Tender.Pom.LogOut;
import com.Tender.Pom.SignIn;




	public class TenderBaseClass {

		public FirefoxOptions options1;
		public ChromeOptions options;
		public WebDriver driver;
		public WebDriverWait wait;
		public JavascriptExecutor js;
		public SoftAssert sa;

		public TenderFilelibrary f = new TenderFilelibrary();

		static {

			System.setProperty("webdriver.chrome.driver", "/Users/activemac03/Documents/chromedriver");
			System.setProperty("webdriver.gecko.driver", "/driver/geckodriver");
			System.getProperty("webdriver.edge.driver", "/driver/msedgedriver");
		}

		@BeforeTest
		// @Parameters("browser")
		public void openBrowser() throws Exception {

			options = new ChromeOptions();

			options1 = new FirefoxOptions();

			options1.addArguments("--disable-notifications");
			options.addArguments("--disable-notifications");

			String url = f.getPropertyData("url");

			String browser = f.getPropertyData("browser");

			if (browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver(options);
			}

			else if (browser.equalsIgnoreCase("firefox")) {

				driver = new FirefoxDriver(options1);

			} else if (browser.equals("edge")) {
				driver = new EdgeDriver();
			}

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 10);

			js = (JavascriptExecutor) driver;

			sa = new SoftAssert();
			driver.get(url);
		}

		@AfterTest
		public void closeBrowser() throws InterruptedException {
			Thread.sleep(500);
			driver.close();
		}

		@BeforeMethod

		public void login() throws IOException, InterruptedException {

			String un = f.getPropertyData("username");

			String pw = f.getPropertyData("password");

			SignIn l = new SignIn(driver);

			l.setLogin(un, pw);

			Thread.sleep(4000);

		}

		@AfterMethod
		public void TenderUtility(ITestResult result) {
			if (ITestResult.FAILURE == result.getStatus()) {

				TenderUtility.captureScreenshot(driver, result.getName());

			}

		}
		
		  
		  @AfterMethod
		  
		  public void logout() throws InterruptedException {
			  LogOut lg=new LogOut(driver); 
		      lg.Setlogout();
		  
		  }
		  
		 

	}




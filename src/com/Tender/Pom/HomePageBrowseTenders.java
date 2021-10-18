package com.Tender.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePageBrowseTenders {
	
	@FindBy(xpath="//p[text()='State']")
	private WebElement State;
	
	@FindBy(xpath="//div[@class=\"gg\"]")
	private WebElement StateFilds;
	
	@FindBy(xpath="//p[text()='Industry']")
	private WebElement Industry;
	
	@FindBy(xpath="//div[@class=\"gg\"]")
	private WebElement IndustryFilds;
	
	@FindBy(xpath="//p[text()='Authorities']")
	private WebElement Authorities;
	
	@FindBy(xpath="//div[@class=\"gg\"]")
	private WebElement AuthoritiesFilds;

	
	@FindBy(xpath="//p[text()='Department']")
	private WebElement Department;
	
	@FindBy(xpath="//div[@class=\"gg\"]")
	private WebElement DepartmentFilds;

	
	@FindBy(xpath="//p[text()='My Interests']")
	private WebElement MyInterests;
	
	@FindBy(xpath="(//div[@class=\"card-sol\"])[1]")
	private WebElement MyInterestsFilds;


	public HomePageBrowseTenders(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void State() throws InterruptedException
	{
		
		State.click();
		
		if (StateFilds.isDisplayed()) {
			String text = StateFilds.getText();

			System.out.println("StateFilds :"+text);
			Reporter.log("StateFilds",true);

		}
		else
			System.out.println("StateFilds Not Displaying");

}
	
	public void Industry() throws InterruptedException
	{
		
		Industry.click();
		
		if (IndustryFilds.isDisplayed()) {
			String text = IndustryFilds.getText();

			System.out.println("IndustryFilds :"+text);
			Reporter.log("IndustryFilds",true);

		}
		else
			System.out.println("IndustryFilds Not Displaying");

}
	public void Authorities() throws InterruptedException
	{
		
		Authorities.click();
		
		if (AuthoritiesFilds.isDisplayed()) {
			String text = AuthoritiesFilds.getText();

			System.out.println("AuthoritiesFilds :"+text);
			Reporter.log("AuthoritiesFilds",true);

		}
		else
			System.out.println("AuthoritiesFilds Not Displaying");

}
	public void Department() throws InterruptedException
	{
		
		Department.click();
		
		if (DepartmentFilds.isDisplayed()) {
			String text = DepartmentFilds.getText();

			System.out.println("DepartmentFilds :"+text);
			Reporter.log("DepartmentFilds",true);

		}
		else
			System.out.println("DepartmentFilds Not Displaying");

}

	public void MyInterests() throws InterruptedException
	{
		
		MyInterests.click();
		
		if (MyInterestsFilds.isDisplayed()) {
			String text = MyInterestsFilds.getText();

			System.out.println("MyInterestsFilds :"+text);
			Reporter.log("MyInterestsFilds",true);

		}
		else
			System.out.println("MyInterestsFilds Not Displaying");

}
}
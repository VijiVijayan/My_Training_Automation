package com.obsqura.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	JavascriptExecutor executor;
	
	@FindBy(tagName="a")
	private WebElement Settings;
	
	@FindBy(xpath="//a[@href='#']")
	private WebElement CarolThomasButton;
	
	@FindBy(tagName="h2")
	private WebElement TextinCarolThomas;
	
	@FindBy(xpath="//a[@href='/payrollapp/user/profile\']")
	private WebElement viewProfile;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="//*[text()='Dashboard']")
	private WebElement dashboard1;
	
	@FindBy(xpath="//*[text()='Company']")
	private WebElement companypage;
	
	@FindBy(xpath="//*[text()='Clients']")
	private WebElement clientpage;
	
	@FindBy(xpath="//*[text()='Home']")
	private WebElement homepage;
	
	@FindBy(xpath="//*[text()='Workers']")
	private WebElement workerspage;
	
	@FindBy(xpath="//*[text()='Deduction']")
	private WebElement deductionpage;
	
	@FindBy(xpath="//*[text()='TimeSheet']")
	private WebElement timesheetpage;
	
	@FindBy(xpath="//*[text()='Payslip']")
	private WebElement payslippage;
	
	@FindBy(xpath="//*[text()='Invoice']")
	private WebElement invoicepage;
	
	@FindBy(xpath="//*[text()='Report']")
	private WebElement reportpage;

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		this.executor=(JavascriptExecutor) this.driver;
		PageFactory.initElements(driver, this);
	}
	public String settingsButton()
	{
		Settings.click();
		return Settings.getText();
	}
	public void carolThomasButton()
	{
		CarolThomasButton.click();
	}
	public void viewProfileButton()
	{
		CarolThomasButton.click();
		executor.executeScript("arguments[0].click();",viewProfile);
	}
	public String textInCarol() 
	{
		return TextinCarolThomas.getText();
    }
	public void logOut()
    {
    	executor.executeScript("arguments[0].click();",logout);
    }
	public String logOutText()
    {
    	return logout.getText();
    }
	public void dashBoard1()
	{
		dashboard1.click();
	}
	public String dashBoardText()
	{
		return dashboard1.getText();
	}
	public void companyPage()
	{
		companypage.click();
	}
	public String companyPageTex()
	{
		return companypage.getText();
	}

	public void clientsPage()
	{
		clientpage.click();
		homepage.click();
	}
	public String clientsPageText()
	{
		return clientpage.getText();
	}
	public void workersPage()
	{
		workerspage.click();
		homepage.click();
	}
	public String workersPageText()
	{
		return workerspage.getText();
	}

	public void deductionPage()
	{
		deductionpage.click();
		homepage.click();
	}
		public String deductionText()
		{
		return deductionpage.getText();
	}
	public void timeSheetPage()
	{
		timesheetpage.click();
		homepage.click();
	}
		public String timeSheetPageText()
		{
		return timesheetpage.getText();
	}
	public void payslipPage()
	{
		payslippage.click();
		homepage.click();
	}
	public String payslipPageText()
	{
		return payslippage.getText();
	}
	public void invoicePage()
	{
		invoicepage.click();
		homepage.click();
	}
	public String invoiceText()
	{
		
		return invoicepage.getText();
	}
	public void reportPage()
	{
		reportpage.click();
		homepage.click();
	}
		public String reportPageText()
		{
		return reportpage.getText();
		}


}

package com.obsqura.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Workers {
	WebDriver driver;
	JavascriptExecutor executor;
	@FindBy(xpath="//a[text()='Workers']")
	private WebElement workerspage;
	
	@FindBy(name="WorkerSearch[first_name]")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='workersearch-last_name']")
	private WebElement lastname;
	
	@FindBy(name="WorkerSearch[postcode]")
	private WebElement postcode;
	
	@FindBy(name="WorkerSearch[ni_number]")
	private WebElement ni_number;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement searchbutton;
	
	@FindBy(xpath="//h1[text()='Workers']")
	private WebElement workerTextHeading;
	
	@FindBy(xpath="//button[text='Reset']")
	private WebElement resetbuttonworker;
	
	@FindBy(xpath="//a[text()='Create Worker']")
	private WebElement createworkerbtn;
	
	@FindBy(xpath="//input[@name='Worker[first_name]']")
	private WebElement workerfirstname;
	
	@FindBy(xpath="//input[@name='worker-middle_name']")
	private WebElement workermiddlename;
	
	@FindBy(xpath="//input[@name='Worker[last_name]']")
	private WebElement workerlastname;
	
	@FindBy(xpath="//input[@id='worker-address1']")
	private WebElement address1;
	
	@FindBy(xpath="//input[@id='worker-postcode']")
	private WebElement postcodecreateworker;
	
	@FindBy(xpath="//input[@id='worker-dob']")
	private WebElement dateofbirth;
	
	@FindBy(xpath="//input[@id='worker-phone']")
	private WebElement workerphone;
	
	@FindBy(xpath="//input[@name='Worker[ni_number]']")
	private WebElement ninumber1;
	
	@FindBy(xpath="//input[@id='worker-email']")
	private WebElement workerEmail;
	
	@FindBy(id="worker-country")
	private WebElement workercountry;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement workernextbtn;
	
	@FindBy(xpath="//a[text()='Bank Details']")
	private WebElement bankdetailsbtn;
	
	
	@FindBy(name="Worker[start_date]")
	private WebElement bankstartdate;
	
	@FindBy(id="worker-roll_no")
	private WebElement rollno;
	
	@FindBy(name="Worker[ac_name]")
	private WebElement accountname;
	
	@FindBy(name="Worker[bank_name]")
	private WebElement bankname;
	
	@FindBy(name="Worker[ac_no]")
	private WebElement accountno;
	
	@FindBy(name="Worker[sort_code]")
	private WebElement Sortcode;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SaveButton1;
	
	public Home_Workers(WebDriver driver)
	{
		this.driver=driver;
		//this.executor=(JavascriptExecutor) this.driver;
		PageFactory.initElements(driver, this);
	}
	public void workersPage()
	{
		workerspage.click();
	}
	public String workersPageHeading()
	{
		return workerspage.getText();
	}
	public void firstNameField(String firstName)
	{
		firstname.sendKeys(firstName);
	}
	public void lastNameField(String lastName)
	{
		lastname.sendKeys(lastName);
	}
	public void postCode(String Postcode)
	{
		postcode.sendKeys(Postcode);
	}
	public void postCode1(String Postcode)
	{
		postcodecreateworker.sendKeys(Postcode);
	}
	public void niNumber(String ninumber)
	{
		ni_number.sendKeys(ninumber);
	}
	public void searchButton()
	{
		searchbutton.click();
	}
	public String workerText()
	{
		return workerTextHeading.getText();
	}
	public void resetButtonWorker()
		{
			resetbuttonworker.click();
		}
	
	public void createWorkerbtn()
	{
		createworkerbtn.click();
	}
	public void firstNameWorker(String firstnme)
	{
		workerfirstname.sendKeys(firstnme);
	}
	public void middleNameWorker(String middlename)
	{
		workermiddlename.sendKeys(middlename);
	}
	public void lastNameWorker(String lastname)
	{
		workerlastname.sendKeys(lastname);
	}
	public void addressWorker(String address)
	{
		address1.sendKeys(address);
	}
	public void dateOBirth(String date)
	{
		dateofbirth.sendKeys(date);
	}
	public void workerPhone(String phoneno)
	{
		workerphone.sendKeys(phoneno);
	}
	public void ninumber2(String nino2)
	{
		ninumber1.sendKeys(nino2);
	}
	public void workeremail(String workermail)
	{
		workerEmail.sendKeys(workermail);
	}
	public void workercountry1(String Workercountry)
	{
		workercountry.clear();
		workercountry.sendKeys(Workercountry);
	}
	public void workerNextBtn()
	{
		workernextbtn.click();
	}
	public void BankDetailsBtn()
	{
		bankdetailsbtn.click();
	}
	public void bankStartDate(String date1)
	{
		bankstartdate.clear();
		bankstartdate.sendKeys(date1);
	}
	public void rollNo(String roll)
	{
		rollno.sendKeys(roll);
	}
	public void accountName(String acname)
	{
		accountname.sendKeys(acname);
	}
	public void bankName(String bnkname)
	{
		bankname.sendKeys(bnkname);
	}
	public void accountNo(String Accountno)
	{
		accountno.sendKeys(Accountno);
	}
	public void sortCode(String sortcode)
	{
		Sortcode.sendKeys(sortcode);
	}
	public void savebtn12()
	{
		SaveButton1.click();
	}
	

}

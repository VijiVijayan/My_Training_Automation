package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Clients {
	WebDriver driver;
	@FindBy(xpath="//a[@href='/payrollapp/client/index\']")
	private WebElement ClientsPage;
	
	@FindBy(id="clientsearch-client_name")
	private WebElement ClientName;
	
	@FindBy(xpath="//*[@name='ClientSearch[id]']")
	private WebElement ClientId;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SearchButton;
	
	@FindBy(tagName="label")
	private WebElement clientnameText;
	
	@FindBy(xpath="//label[text()='Client ID']")
	private WebElement clientIdText;
	
	@FindBy(xpath="//*[text()='Reset']")
	private WebElement ResetClient;
	
	@FindBy(xpath="//*[@id=\"w1\"]/ul/li[12]/a")
	private WebElement nextbutton;
	
	@FindBy(xpath="//a[text()='Create Client']")
	private WebElement createclient;
	
	@FindBy(id="client-your_ref")
	private WebElement refno;
	
	@FindBy(id="client-invoice_contact")
	private WebElement invoicecontact;
	
	@FindBy(name="Client[client_name]")
	private WebElement clientname;
	
	@FindBy(id="client-phone")
	private WebElement clientphone;
	
	@FindBy(id="client-client_address")
	private WebElement clientaddress;
	
	@FindBy(xpath="//div[text()='No results found.']")
	private WebElement resultsnotfound;
	
	@FindBy(id="client-settilement_days")
	private WebElement settlementdays;
	
	@FindBy(id="client-postcode")
	private WebElement postcode;
	
	@FindBy(id="client-email")
	private WebElement emailid;
	
	@FindBy(id="client-company_reg")
	private WebElement companyreg;
	
	@FindBy( id="client-country")
	private WebElement country;
	
	@FindBy(id="client-direct_client")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement savebutton;
	
	@FindBy(xpath="//h1[text()='Create Client']")
	private WebElement createclienttext;
	
	public Home_Clients(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clientsPage()
	{
		ClientsPage.click();
	}
	public String clientsPageText()
	{
		return ClientsPage.getText();
	}
	public void searchClientName(String clientname)
	{
		ClientName.sendKeys(clientname);
	}
	public void clearClientName()
	{
		ClientName.clear();
	}
	public void clearClientId()
	{
		ClientId.clear();
	}
	public void searchClientId(String clientId)
	{
		ClientId.sendKeys(clientId);
	}
	public void searchButton()
	{
		SearchButton.click();
	}
	public String clientNameText()
	{
		return clientnameText.getText();
	}
	public String clientidText()
	{
		return clientIdText.getText();
	}
	public void resetClientButton()
	{
		ResetClient.click();
	}
	public void nextButton()
	{
		nextbutton.click();
	}
	
	public void createClientButton()
	{
		createclient.click();
	}
	public void createRef(String ref)
	{
		refno.sendKeys(ref);
	}
	public void invoiceContact(String contactno)
	{
		invoicecontact.sendKeys(contactno);
	}
	public void clientName(String name)
	{
		clientname.sendKeys(name);
	}
	public void clearClientID()
	{
		ClientId.clear();
	}
	public void clientPhone(String phone)
	{
		clientphone.sendKeys(phone);
	}
	public void clientAddress(String address)
	{
		clientaddress.sendKeys(address);
	}
	public String resultsNotFound()
	{
		return resultsnotfound.getText();
	}
	public void settlementDays(String days)
	{
		settlementdays.sendKeys(days);
	}
	public void postCode(String post)
	{
		postcode.sendKeys(post);
	}
	public void emailId(String email)
	{
		emailid.sendKeys(email);
	}
	public void companyReg(String company)
	{
		companyreg.sendKeys(company);
	}
	public void countryName(String countryname)
	{
		country.clear();
		country.sendKeys(countryname);
	}
	public void checkBox()
	{
		checkbox.isSelected();
	}
	public void saveButton()
	{
		savebutton.click();
	}
	public String createNewClientText()
	{
		return createclienttext.getText();
	}

}

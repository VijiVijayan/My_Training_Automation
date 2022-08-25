package com.obsqura.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtility {
	WebDriver driver;
	@FindBy(id="client-branch_id")
	private WebElement clientbranch;
	
	@FindBy(xpath="//select[@id='client-invoice_order']")
	private WebElement invoiceorder;
	
	@FindBy(xpath="//select[@id='client-division_id']")
	private WebElement division;
	
	@FindBy(name="Client[invoice_delivery_method]")
	private WebElement deliverymethod;
	
	@FindBy(id="client-master_document")
	private WebElement masterdocument;
	
	@FindBy(id="client-vat_rate")
	private WebElement vatrate;
	
	/*@FindBy(name="Worker[title]")
	private WebElement workertitle;*/
	
	@FindBy(xpath="//select[@name='Worker[gender]']")
	private WebElement workergender;
	
	@FindBy(name="Worker[branch_id]")
	private WebElement workerbranch;
	
	@FindBy(id="worker-division_id")
	private WebElement workerdivision;
	
	@FindBy(id="worker-employment_type")
	private WebElement employmenttype;
	
	@FindBy(xpath="//*[@id='worker-payslip_method']")
	private WebElement payslipmethod;
	
	@FindBy(xpath="//select[@name='Worker[payment_method]']")
	private WebElement workerpaymentmethod;
	
	@FindBy(id="worker-ac_type")
	private WebElement accounttype;
	
	public PageUtility(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void dropDown1(String value)
	{
		 Select dropdownselect1=new Select(clientbranch);
		 dropdownselect1.selectByVisibleText(value);
	}
	public void dropDown11(String value1)
	{
		Select dropdownselect2=new Select(invoiceorder);
		dropdownselect2.selectByValue(value1);
	}
	public void dropDown2(String value2)
	{
		Select dropdownselect3=new Select(division);
		dropdownselect3.selectByValue(value2);
		
	}
	public void dropDown3(String value3)
	{
		Select dropdownselect4=new Select(deliverymethod);
		dropdownselect4.selectByValue(value3);
		
	}
	public void dropDown4(String value4)
	{
		Select dropdownselect5=new Select(masterdocument);
		dropdownselect5.selectByValue(value4);
		
	}
	public void dropDown5(String value5)
	{
		Select dropdownselect6=new Select(vatrate);
		dropdownselect6.selectByValue(value5);
	      
	}
	/*public void dropDown6(String value6)
		{
			Select dropdownselect7=new Select(workertitle);
			dropdownselect7.selectByValue(value6);
		}*/
		public void dropDown7(String value7)
		{
			Select dropdownselect8=new Select(workergender);
			dropdownselect8.selectByValue(value7);
		}
		public void dropDown8(String value8)
		{
			Select dropdownselect9=new Select(workerbranch);
			dropdownselect9.selectByVisibleText(value8);
		}
		public void dropDown9(String value9)
		{
			Select dropdownselect10=new Select(workerdivision);
			dropdownselect10.selectByValue(value9);
		}
		public void dropDown10(String value10)
		{
			Select dropdownselect11=new Select(employmenttype);
			dropdownselect11.selectByValue(value10);
		}
		public void dropDown12(String value11)
		{
			Select dropdownselect12=new Select(payslipmethod);
			dropdownselect12.selectByValue(value11);
		}
		public void dropDown13(String value12)
		{
			Select dropdownselect13=new Select(workerpaymentmethod);
			dropdownselect13.selectByVisibleText(value12);
		}
		public void dropDown14(String value13)
		{
			Select dropdownselect14=new Select(accounttype);
			dropdownselect14.selectByValue(value13);
		}
		public void logOutClick(WebDriver driver, WebElement logout)
		{
		        //Retrieve WebElemnt  to perform mouse hover
		    	Actions actions = new Actions(driver);
		    	actions.doubleClick(logout);
		    	actions.build().perform();
		    	
			
		}


}

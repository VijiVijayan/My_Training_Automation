package com.obsqura.scripts;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.constants.constants;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.Home_Clients;
import com.obsqura.pages.Home_Workers;
import com.obsqura.pages.LoginPage;
import com.obsqura.utility.ExcelUtility;
import com.obsqura.utility.PageUtility;
import org.testng.annotations.DataProvider;

public class TestClass extends TestBase {
	
	LoginPage obj;
	Home_Clients obj1;
	PageUtility obj2;
	Home_Workers obj3;
	HomePage obj5;
	@Test(priority=6)
	public void verify_Login_with_correctUsername_and_password() throws IOException 
	{
		obj=new LoginPage(driver);
		synchronized(obj) {
			try {
				obj.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		driver.navigate().refresh();
		String username = ExcelUtility.getCellData(1, 0);
	    String password = ExcelUtility.getCellData(1, 1);
		obj.setUsername(username);
		obj.setPassword(password);
		obj.clickLogin();
		String actualTitle=driver.getTitle();
		String expectedTitle=constants.TITLE;
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(priority=2)
	public void verifyLogin_with_no_username_and_password()
	{
		obj=new LoginPage(driver);
		synchronized(obj) {
			try {
				obj.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		driver.navigate().refresh();
		obj.setUsername("");
		obj.setPassword("");
		obj.clickLogin();
		String actualTitle=driver.getTitle();
		String expectedTitle=constants.TITLE;
		Assert.assertEquals(actualTitle,expectedTitle);
	}
	@Test(priority=1)
	public void Login_with_incorrectUsername_and_incorrectpassword() throws IOException
	{
		obj=new LoginPage(driver);
		synchronized(obj) {
			try {
				obj.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		driver.navigate().refresh();
		String username = ExcelUtility.getCellData(3, 0);
		obj.setUsername(username);
		String password = ExcelUtility.getCellData(3, 1);
		obj.setPassword(password);
		obj.clickLogin();
		String actualTitle=driver.getTitle();
		String expectedTitle=constants.TITLE;
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(dataProvider="dataProvider1")
	public void verify_invalidLogin_using_dataprovider(String PassWord)
	{
		obj=new LoginPage(driver);
		synchronized(obj) {
			try {
				obj.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		driver.navigate().refresh();
		obj.dataProviderPassword(PassWord);
		obj.clickLogin();
		obj.clearUsername();
		String expectedText=constants.TEXT1;
		String actualText=obj.text1();
		Assert.assertEquals(actualText, expectedText);
	}
	@Test(priority=3)
	public void verifyResetitButton()
	{
		obj=new LoginPage(driver);
		synchronized(obj) {
			try {
				obj.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		obj.resetButton();
		String expectedTitle=constants.RESETTITLE;
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		}
	
	@Test(priority=5)
	public void verifyEmailId_inResetPassword() throws IOException
	{
		obj=new LoginPage(driver);
		obj.clearEmailId();
		synchronized(obj) {
			try {
				obj.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		obj.resetButton();
		String emailreset = ExcelUtility.getCellData(6,0);
		obj.emailId1(emailreset);
		obj.cancelButton1();
		String actualTitle=driver.getTitle();
		String expectedTitle=constants.TITLE;
		Assert.assertEquals(actualTitle,expectedTitle);
		
	}
	@Test(priority=4)
	public void verifyResetPassword_WithInvalidEmailId() throws IOException
	{
		obj=new LoginPage(driver);
		driver.navigate().refresh();
		synchronized(obj) {
			try {
				obj.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		obj.resetButton();
		String emailreset = ExcelUtility.getCellData(6,0);
		obj.emailId1(emailreset);
		obj.sendButton1();
		String actualTitle=driver.getTitle();
		String expectedTitle=constants.RESETTITLE;
		Assert.assertEquals(actualTitle, expectedTitle);
		}
	@Test(priority=16)
	public void verifySettingsButton()
	{
		obj5=new HomePage(driver);
		synchronized(obj5) {
			try {
				obj5.wait(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		obj5.settingsButton();
		String actualSettingsTitle=driver.getTitle();
		String expectedSettingsTitle=constants.TITLE2;
		Assert.assertEquals(actualSettingsTitle, expectedSettingsTitle);
		}
	@Test(priority=17)
	public void verifyCarolThomasButton()
	{
		obj5=new HomePage(driver);
		synchronized(obj5) {
			try {
				obj5.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		obj5.carolThomasButton();
		String actualText =obj5.textInCarol();
		String expectedText=constants.TEXT2;
		Assert.assertEquals(actualText, expectedText);
	}
	@Test(priority=18)
	public void verifyViewProfile_inCarolThomasButton()
	{
		obj5=new HomePage(driver);
		synchronized(obj5) {
			try {
				obj5.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		obj5.carolThomasButton();
		obj5.viewProfileButton();
		String actualTitle =driver.getTitle();;
		String expectedTitle=constants.TITLE2;
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(priority=19)
	public void verifyLogout_inCarolThomasButton()
	{
		obj5=new HomePage(driver);
		synchronized(obj5) {
			try {
				obj5.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		obj5.carolThomasButton();
		obj5.logOut();
		String actualTitle=driver.getTitle();
		String expectedTitle=constants.TITLE;
		Assert.assertEquals(actualTitle, expectedTitle);
	
	}
	@Test(priority=7)
	public void verifyDashBoardButton()
	{
		obj5=new HomePage(driver);
		synchronized(obj5) {
			try {
				obj5.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		obj5.dashBoard1();
		String actualTitle=driver.getTitle();
		String expectedTitle=constants.TITLE3;
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(priority=8)
	public void verifyCompanyButton()
	{
		
		obj5.companyPage();
		String actualCompanyTitle=driver.getTitle();
		String expectedCompanyTitle=constants.TITLE2;
		Assert.assertEquals(actualCompanyTitle, expectedCompanyTitle);
	}
	@Test(priority=9)
	public void verifyClientsButton()
	{
		
		obj5.clientsPage();
		String actualClientHeading=obj5.clientsPageText();
		String expectedClientHeading=constants.CLIENTTEXT;
		Assert.assertEquals(actualClientHeading, expectedClientHeading);
	}
	@Test(priority=10)
	public void verifyWorkersButton()
	{
		obj5=new HomePage(driver);
		obj5.workersPage();
		String expectedworkersHeading=obj5.workersPageText();
		String actualworkersHeading=constants.WORKERTEXT;
		Assert.assertEquals(actualworkersHeading, expectedworkersHeading);
		
	}
	@Test(priority=11)
	public void verifyDeductionButton()
	{
		obj5=new HomePage(driver);
		obj5.deductionPage();
		String expecteddeductionHeading=obj5.deductionText();
		String actualdeductionHeading=constants.DEDUCTIONTEXT;
		Assert.assertEquals(expecteddeductionHeading, actualdeductionHeading);
	}
	@Test(priority=12)
	public void verifyTimeSheetButton()
	{
		obj5=new HomePage(driver);
		obj5.timeSheetPage();
		String actualtimesheetText=obj5.timeSheetPageText();
		String expectedtimesheetText=constants.TIMESHEETTEXT;
		Assert.assertEquals(actualtimesheetText, expectedtimesheetText);
	}
	@Test(priority=13)
	public void verifyPayslipButton()
	{
		obj5=new HomePage(driver);
		obj5.payslipPage();
		String actualpayslipText=obj5.payslipPageText();
		String expectedpayslipText=constants.PAYSLIPTEXT;
		Assert.assertEquals(actualpayslipText, expectedpayslipText);
	}
	@Test(priority=14)
	public void verifyInvoiceButton()
	{
		obj5=new HomePage(driver);
		obj5.invoicePage();
		String expectedinvoiceText=constants.INVOICETEXT;
		String actualinvoiceText=obj5.invoiceText();
		Assert.assertEquals(actualinvoiceText, expectedinvoiceText);
		
	}
	@Test(priority=15)
	public void verifyReportButton()
	{
		obj5=new HomePage(driver);
		obj5.reportPage();
		String actualreportText=obj5.reportPageText();
		String expectedreportText=constants.REPORTTEXT;
		Assert.assertEquals(actualreportText, expectedreportText);
	}
	@Test(priority=20)
	public void verify_search_ValidClient() throws IOException
	{
		obj1=new Home_Clients(driver);
		synchronized(obj1) {
			try {
				obj1.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		String username = ExcelUtility.getCellData(1, 0);
	    String password = ExcelUtility.getCellData(1, 1);
		obj.setUsername(username);
		obj.setPassword(password);
		obj.clickLogin();
		obj1=new Home_Clients(driver);
		synchronized(obj1) {
			try {
				obj1.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		obj1.clientsPage();
		obj1.clearClientName();
		obj1.clearClientID();
		String clientname= ExcelUtility.getCellData(8, 0);
		obj1.searchClientName(clientname);
		String clientId= ExcelUtility.getNumericData(8,1);
		obj1.searchClientId(clientId);
		obj1.searchButton();
		String expectedHeadingText=constants.TEXT;
		String actualHeadingText=obj.textHeading();
		Assert.assertEquals(actualHeadingText, expectedHeadingText);
	}
	@Test(priority=21)
	public void verify_search_ValidClient_UsingValidNameOnly() throws IOException
	{
		obj1=new Home_Clients(driver);
		synchronized(obj1) {
			try {
				obj1.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		obj1.clientsPage();
		String clientname= ExcelUtility.getCellData(8, 0);
		obj1.searchClientName(clientname);
		obj1.searchButton();
		String actualClientTitle=driver.getTitle();
		String expectedClientTitle=constants.CLIENTTEXT;
		Assert.assertEquals(actualClientTitle,expectedClientTitle);
	}
	@Test(priority=22)
	public void verifySearch_ValidClient_UsingValidIDOnly() throws IOException
	{
		obj1=new Home_Clients(driver);
		obj1=new Home_Clients(driver);
		synchronized(obj1) {
			try {
				obj1.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		obj1.clientsPage();
		obj1.clearClientName();
		String clientId= ExcelUtility.getNumericData(8, 1);
		obj1.searchClientId(clientId);
		obj1.searchButton();
		String actualClientTitle=driver.getTitle();
		String expectedClientTitle=constants.CLIENTTITLE;
		Assert.assertEquals(actualClientTitle,expectedClientTitle);
	}
	@Test(priority=23)
	public void verifySearchClient_Using_InValidName_and_ID() throws IOException
	{
		obj1=new Home_Clients(driver);
		obj1=new Home_Clients(driver);
		synchronized(obj1) {
			try {
				obj1.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		obj1.clientsPage();
		obj1.clearClientName();
		String clientname= ExcelUtility.getCellData(9, 0);
		obj1.searchClientName(clientname);
		String clientId= ExcelUtility.getNumericData(9,1);
		obj1.searchClientId(clientId);
		obj1.searchButton();
		String actualClientTitle=driver.getTitle();
		String expectedClientTitle=constants.CLIENTTITLE;
		Assert.assertEquals(actualClientTitle,expectedClientTitle);
	}
	@Test(priority=24)
	public void verify_CreateNewClientButton() throws IOException
	{
		obj1=new Home_Clients(driver);
		synchronized(obj1) {
			try {
				obj1.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		obj1.createClientButton();
		String actualText=obj1.createNewClientText();
		String expectedText=constants.CREATECLIENTTEXT;
		Assert.assertEquals(actualText, expectedText);
	}
	@Test(priority=25)
	public void verify_User_can_CreateNew_Client_with_mandatory_fields() throws IOException
	{
		obj1=new Home_Clients(driver);
		synchronized(obj1) {
			try {
				obj1.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		driver.navigate().refresh();
		obj1.createClientButton();
		obj2=new PageUtility(driver);
		String branch= ExcelUtility.getCellData(11, 0);
		obj2.dropDown1(branch);
		String createref= ExcelUtility.getCellData(12, 0);
		obj1.createRef(createref);
		String division= ExcelUtility.getNumericData(13, 0);
		obj2.dropDown2(division);
		String contact= ExcelUtility.getNumericData(14, 0);
		obj1.invoiceContact(contact);
		String deliverymethod= ExcelUtility.getCellData(15, 0);
		obj2.dropDown3(deliverymethod);
		String clientname1= ExcelUtility.getCellData(16, 0);
		obj1.clientName(clientname1);
		String phoneno= ExcelUtility.getNumericData(17, 0);
		obj1.clientPhone(phoneno);
		String document= ExcelUtility.getCellData(18, 0);
		obj2.dropDown4(document);
		String clientaddress= ExcelUtility.getCellData(19, 0);
		obj1.clientAddress(clientaddress);
		String days= ExcelUtility.getNumericData(20, 0);
		obj1.settlementDays(days);
		String postcode= ExcelUtility.getNumericData(21, 0);
		obj1.postCode(postcode);
		String emailId1= ExcelUtility.getCellData(22, 0);
		obj1.emailId(emailId1);
		String vatrate= ExcelUtility.getCellData(23, 0);
		obj2.dropDown5(vatrate);
		String companyreg= ExcelUtility.getCellData(24, 0);
		obj1.companyReg(companyreg);
		String countryname= ExcelUtility.getCellData(25, 0);
		obj1.countryName(countryname);
		String invoice= ExcelUtility.getCellData(26, 0);
		obj2.dropDown11(invoice);
		obj1.checkBox();
		obj1.saveButton();
		String actualText=obj1.createNewClientText();
		String expectedText=constants.CREATECLIENTTEXT;
		Assert.assertEquals(actualText, expectedText);
		}
	@Test(priority=26)
	public void verify_user_can_search_ValidWorker() throws IOException
	{
		obj3=new Home_Workers(driver);
		synchronized(obj3) {
			try {
				obj3.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		obj3.workersPage();
		String firstname= ExcelUtility.getCellData(28, 0);
		obj3.firstNameField(firstname);
		String lastname= ExcelUtility.getCellData(29, 0);
		obj3.lastNameField(lastname);
		String post= ExcelUtility.getCellData(30, 0);
		obj3.postCode(post);
		String nino= ExcelUtility.getCellData(31, 0);
		obj3.niNumber(nino);
		obj3.searchButton();
		String expectedText=constants.WORKERSTITLE1;
		String actualText=obj3.workerText();
		Assert.assertEquals(actualText, expectedText);
		}
	@Test(priority=27)
	public void verify_CreateNewWorkerButton() throws InterruptedException
	{
		
		obj3=new Home_Workers(driver);
		synchronized(obj3) {
			try {
				obj3.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		obj3.createWorkerbtn();
		String actualTitle=driver.getTitle();
		String expectedTitle=constants.CREATEWORKERTITLE;
		Assert.assertEquals(actualTitle,expectedTitle );
	}
		@Test(priority=28)
		public void verify_user_able_to_CreateNewWorker_with_mandatoryFields() throws InterruptedException, IOException
		{
			
			obj3=new Home_Workers(driver);
			synchronized(obj3) {
				try {
					obj3.wait(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		obj3.createWorkerbtn();
		String dropgender= ExcelUtility.getCellData(34,0);
		obj2.dropDown7(dropgender);
		String workerbranch= ExcelUtility.getCellData(35,0);
		obj2.dropDown8(workerbranch);
		String firstname= ExcelUtility.getCellData(36,0);
		obj3.firstNameWorker(firstname);
		String lastname= ExcelUtility.getCellData(37,0);
		obj3.lastNameWorker(lastname);
		String dropdivision= ExcelUtility.getNumericData(38,0);
		obj2.dropDown9(dropdivision);
		String drop7= ExcelUtility.getNumericData(40,0);
		obj3.dateOBirth(drop7);
		String drop8= ExcelUtility.getCellData(41,0);
		obj3.addressWorker(drop8);
		String dropemptype= ExcelUtility.getCellData(42,0);
		obj2.dropDown10(dropemptype);
		String drop10= ExcelUtility.getNumericData(43,0);
		obj3.workerPhone(drop10);
		String droppayslip= ExcelUtility.getCellData(44,0);
		obj2.dropDown12(droppayslip);
		String dropemail= ExcelUtility.getCellData(45,0);
		obj3.workeremail(dropemail);
		String drop13= ExcelUtility.getNumericData(46,0);
		obj3.postCode1(drop13);
		String drop14= ExcelUtility.getNumericData(47,0);
		obj3.ninumber2(drop14);
		String drop15= ExcelUtility.getCellData(48,0);
		obj3.workercountry1(drop15);
		obj3.workerNextBtn();
		String actualTitle=driver.getTitle();
		String expectedTitle=constants.CREATEWORKERTITLE;
		Assert.assertEquals(actualTitle, expectedTitle);
		}
		@Test(priority=29)
		public void verifyworkerBankDetailsButton() throws IOException
		{
			obj3=new Home_Workers(driver);
			synchronized(obj3) {
				try {
					obj3.wait(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			obj3.BankDetailsBtn();
			String actualTitle=driver.getTitle();
			String expectedTitle=constants.WORKERBANKDETAILSTITLE;
			Assert.assertEquals(actualTitle, expectedTitle);
		}
	@Test(priority=30)
	public void verify_WorkerBankDetails_With_mandatory_fields() throws IOException
	{
		obj3=new Home_Workers(driver);
		synchronized(obj3) {
			try {
				obj3.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		obj3.BankDetailsBtn();
		String drop16= ExcelUtility.getCellData(50,0);
		obj2.dropDown13(drop16);
		String drop17= ExcelUtility.getCellData(51,0);
		obj3.bankStartDate(drop17);
		String drop18= ExcelUtility.getCellData(52,0);
		obj2.dropDown14(drop18);
		String drop19= ExcelUtility.getNumericData(53,0);
		obj3.rollNo(drop19);
		String drop20= ExcelUtility.getCellData(54,0);
		obj3.accountName(drop20);
		String drop21= ExcelUtility.getCellData(55,0);
		obj3.bankName(drop21);
		String drop22= ExcelUtility.getNumericData(56,0);
		obj3.accountNo(drop22);
		String drop23= ExcelUtility.getNumericData(57,0);
		obj3.sortCode(drop23);
		obj3.savebtn12();
		String actualTitle=driver.getTitle();
		String expectedTitle=constants.WORKERBANKDETAILSTITLE;
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}

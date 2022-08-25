package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(name="LoginForm[username]")
	private WebElement username;
	
	@FindBy(name="LoginForm[password]")
	private WebElement password;
	
	@FindBy(name="login-button")
	private WebElement LoginButton;
	
	@FindBy(xpath="//*[text()='Incorrect username or password.']")
	private WebElement errorMsg;
	
	@FindBy(xpath="//h1[text()='Clients']")
	private WebElement headingText;
	
	@FindBy(tagName="a")
	private WebElement resetbutton;
	
	@FindBy(xpath="//*[text()='If you forgot your password you can ']")
	private WebElement textInResetPassword;
	
	@FindBy(xpath="//input[@name='PasswordResetRequestForm[email]']")
	private WebElement Emailid1;
	
	@FindBy(xpath="//button[text()='Send']")
	private WebElement sendbutton1;
	
	@FindBy(xpath="//a[text()='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(tagName="h1")
	private WebElement text;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		public void setUsername(String UserName)
		{
			username.clear();
			username.sendKeys(UserName);
		}
		public void setPassword(String PassWord)
		{
			password.clear();
			password.sendKeys(PassWord);
		}
		public void clickLogin()
		{
			LoginButton.click();
		}
		public String  text1()
		{
			return text.getText();
		}
		
		public String ErrorMsg2()
		{
			errorMsg.clear();
			return errorMsg.getText();
		}
		public void clearPassword()
		{
			password.clear();
		}
		public void clearUsername()
		{
			username.clear();
		}
		public String textHeading()
		{
			return headingText.getText();
		}
		public void resetButton()
		{
			resetbutton.click();
		}
		public String resetText()
		{
			return textInResetPassword.getText();
		}
		public void dataProviderPassword(String PassWord)
	    {
	    	password.sendKeys(PassWord);
	    }
		public void emailId1(String emailId11)
	    {
			Emailid1.sendKeys(emailId11);
	    }
		public void clearEmailId()
	    {
			Emailid1.clear();
	    }
		public void cancelButton1()
	    {
	    	cancelButton.click();
	    }
		public void sendButton1()
	    {
	    	sendbutton1.click();
	    }
		
		
		
	    
	    
}

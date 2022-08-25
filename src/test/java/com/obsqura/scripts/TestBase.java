package com.obsqura.scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import com.obsqura.constants.constants;

public class TestBase 
	{
		WebDriver driver;
		public static Properties prop = null;
		public static void loadConfig() {
	        try {
	        	//Below line creates an object of Properties called 'prop'
	            prop = new Properties();
	          //Below line creates an object of FileInputStream called 'ip'. 
	          //Give the path of the properties file which you have created
	            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources"
	                    + "/configure.properties");
	//Below line of code will load the property file
	            prop.load(ip);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
		
		@BeforeTest
		@Parameters("browser")
			public void setUp(String browser)
				{
					loadConfig();
					if(browser.equalsIgnoreCase("chrome"))
						{
							System.setProperty(prop.getProperty("chromedriver"),prop.getProperty("chromedriverpath"));
							driver=new ChromeDriver();
						}else if(browser.equalsIgnoreCase("firefox"))
						{
							System.setProperty(prop.getProperty("firefox"),prop.getProperty("firefoxpath"));
							driver=new FirefoxDriver();
						}
							driver.get(prop.getProperty("url"));
							driver.manage().window().maximize();


				}
		@AfterMethod
	    public void tearDown(ITestResult iTestResult) throws IOException {
	        if (iTestResult.FAILURE == iTestResult.getStatus()) {
	            takeScreenshot(iTestResult.getName());
	        }
	    }
		public String takeScreenshot(String name) throws IOException {
	    	
	    	
	    	/*Step 1) Convert web driver object to TakesScreenshot
	          Step 2) Call getScreenshotAs method to create image file
	          Step 3) Copy file to Desired Location*/
	    	
	        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

	      //Take the screenshot
	        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String destination =  System.getProperty("user.dir") + "\\target\\" + name + dateName
	                + ".png";
	       
	        File finalDestination = new File(destination);
	     
	        FileHandler.copy(source, finalDestination);//or FileUtils.copyFile import org.apache.commons.io.FileUtils;
	        return destination;   
	    }
			@DataProvider(name ="dataProvider1")
		    public static Object[][] dataPrividerMethod(){
		   return new Object[][] {{"1q2w3e4r"}};
		    	
		    }


}

package testng;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class test {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "D:Driver\\chromedriver.exe";
	   
	public WebDriver driver ; 
	    
	    @AfterTest                            //Jumbled
	      public void terminateBrowser(){
	          //driver.close();
	      }
	    
	    @BeforeTest                            //Jumbled
	      public void launchBrowser() {
	          System.out.println("launching Chrome browser"); 
	          System.setProperty("webdriver.chrome.driver", driverPath);
	          driver = new ChromeDriver();
	          driver.get(baseUrl);
	      }
	     
	    @Test                                //Jumbled
	      public void verifyHomepageTitle() {
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	     }
	      
	}


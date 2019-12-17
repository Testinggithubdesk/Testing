package testng;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Selenium {
	public String baseUrl = "http://testingmasters.com/hrm/symfony/web/index.php/auth/login";
	String driverPath = "D:Driver\\chromedriver.exe";		
	public WebDriver driver ;
	
	@BeforeMethod                            //Jumbled
    public void launchBrowser() {
		  
		System.out.println("launching Chrome browser"); 
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
			
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
    }
	@Test(priority = 0)
	public  void launch()
	{

		if (driver.findElement(By.xpath("//b[text()='Performance']")).isDisplayed())
		{
			System.out.print("pass");
		}
		else 
		{
			Reporter.log("fail");
			System.out.print("fail");
		}
		
		driver.findElement(By.xpath("//b[text()='Performance']")).click();
		driver.close();

	   
			}
	  
  
	@Test(priority = 1)
	public void login()
	{
		
		if (driver.findElement(By.xpath("//b[text()='Leave']")).isDisplayed())
		{
			System.out.print("pass");
		}
		else 
		{
			Reporter.log("fail");
			System.out.print("fail");
		}
		
		driver.findElement(By.xpath("//b[text()='Leave']")).click();
		driver.close();

	}
}

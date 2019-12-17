package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sele {
	
	WebDriver driver;
	public void login()
	{
		System.out.print("Anil");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
	}
}

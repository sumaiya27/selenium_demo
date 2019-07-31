package listenerDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;

@Listeners(listenerDemo.listener.class)	
public class testcases { 
 @Test
 public void Login() {
	 
	 System.setProperty("webdriver.gecko.driver", "/home/sirat/geckodriver");
	 WebDriver driver = new FirefoxDriver();
	 driver.get("http://demo.guru99.com/V4/");
	 driver.findElement(By.name("uid")).sendKeys("mngr34926");
	 driver.findElement(By.name("password")).sendKeys("amUpenu");
	 driver.findElement(By.name("btnLogin")).click();	 
 }
 @Test
 public void TestToFail() {
	 System.out.println("This is a method to test fail");
	 Assert.assertTrue(false); 
 } 
 
}

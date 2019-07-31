import java.sql.Driver;
import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class practicescript {
	@Test(priority = 1)
	public void executionfirst() {
		System.setProperty("webdriver.gecko.driver", "/home/sirat/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://dokan.ajaira.website/my-account/");
		
		WebElement radio2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/article/div/div/div[2]/div[2]/form/p[2]/label[2]"));
		///WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		
		radio2.click();
	    System.out.println("Radio option 1 is selected");
	}
	///@Test(priority = 2)
	///public void executionsecond() {
		///driver.findElement(By.xpath("//*[@id="reg_email"]")).sendKeys("sumaiyasirat@gmail.com");
				///driver.findElement(By.name("password")).sendKeys("sirat12345");
		
		
	///}
	///@AfterTest
	///public void terminatebrowser() {
		///System.setProperty("webdriver.gecko.driver", "/home/sirat/geckodriver");
		///WebDriver driver = new FirefoxDriver();
		///driver.close();	 
	///}

}

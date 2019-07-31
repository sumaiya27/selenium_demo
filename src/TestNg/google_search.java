package TestNg;
import org.openqa.selenium.By;			
import org.openqa.selenium.WebDriver;			
import org.openqa.selenium.firefox.FirefoxDriver;			
import org.testng.Assert;			
import org.testng.annotations.Test;	

public class google_search {
	
	WebDriver driver;
	@Test(priority = 0)
	public void openbrowser() {
		System.setProperty("webdriver.gecko.driver", "/home/sirat/geckodriver");
		driver = new FirefoxDriver();
	}
	@Test(priority = 1)
	public void launchgoogle() {
		driver.get("http://www.google.co.in");
	}
	@Test(priority = 2)
	public void performsearchgoogle() {
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Facebook");
	}
	@Test(priority = 3)
	public void fbtitleverify() throws InterruptedException{
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[3]/center/input[1]")).click();
	
	Thread.sleep(3000);
	Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"),true);
	}

}

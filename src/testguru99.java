import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testguru99 {
	@Test(priority = 1)
	public void executesessionone() {
		System.setProperty("webdriver.gecko.driver", "/home/sirat/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("Driver1");	
	}
	@Test(priority = 2)
	public void executesessiontwo() {
		System.setProperty("webdriver.gecko.driver", "/home/sirat/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("Driver2");	
	}
	@Test(priority = 3)
	public void executesessionthree() {
		System.setProperty("webdriver.gecko.driver", "/home/sirat/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("Driver3");	
	}

}
//but when i run the xmlfile it only executes one session at once

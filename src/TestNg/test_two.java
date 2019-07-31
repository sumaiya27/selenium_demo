package TestNg;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class test_two {
public String baseurl = "http://demo.guru99.com/test/newtours/";
public WebDriver driver;


@Test
public void verifyhomepagetitle() {
	String expectedTitle = "Welcome: Mercury Tours";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);	
}
@BeforeTest

public void launchbrowser() {
	
	System.out.println("launching firefox browser");
	System.setProperty("webdriver.gecko.driver", "/home/sirat/geckodriver");
	driver = new FirefoxDriver();
	driver.get(baseurl);
}

@AfterTest
public void terminatebrowser() {
	driver.close();	
}



}



package firsttestngpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGFile {
	public String baseUrl = "http://newtours.demoaut.com/";
	public WebDriver driver = new FirefoxDriver();
	
  @Test
  public void verifyHomePageTitle() {
	  driver.get(baseUrl);
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	  driver.quit();
  }
}

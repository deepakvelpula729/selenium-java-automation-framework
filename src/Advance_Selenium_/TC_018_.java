package Advance_Selenium_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_018_ extends BaseClass{
	
	String expectedResult = "Your enquiry has been successfully sent to the store owner.";
	
	@Test (groups = "system")
	public void s() {
		
		driver.findElement(By.linkText("Sitemap")).click();
		driver.findElement(By.linkText("Blog")).click();
		driver.findElement(By.linkText("Privacy Notice")).click();
		driver.findElement(By.linkText("Contact us")).click();
		
	    WebElement name = driver.findElement(By.id("FullName"));
	    name.clear();
	    name.sendKeys("AaBbCcDd");
	    
	    WebElement email = driver.findElement(By.id("Email"));
	    email.clear();
	    email.sendKeys("abcdef@gmail.com");
	    
	    driver.findElement(By.id("Enquiry")).sendKeys("Demo Web Shop");
	    
	    driver.findElement(By.name("send-email")).click();
	    
	    String actualResult = driver.findElement(By.xpath("//div[contains(text(),'successfully sent')]")).getText();
	    
	    // Hard Assert
	    Assert.assertEquals(expectedResult, actualResult);
	    Reporter.log("Successfully Navigated to Message sent page", true);
	
	}

}

package Advance_Selenium_;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_011_ extends BaseClass{
	
	String expectedResult = "All product tags";
	
	@Test (groups = "system")
	public void Allproducttags() {
		driver.findElement(By.id("newsletter-email")).sendKeys("selenium@gmail.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		driver.findElement(By.linkText("View all")).click();
		String actualResult = driver.findElement(By.xpath("//h1[text()='All product tags']")).getText();
		
		//hard assert
		Assert.assertEquals(expectedResult, actualResult);
		Reporter.log("Successfully Navigated to All product tags page", true);
	}

}

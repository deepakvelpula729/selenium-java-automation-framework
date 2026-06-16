package Advance_Selenium_;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_019_ extends BaseClass{
	
	String expectedResult = "Customer Service - Client Service";
	
	
	@Test (groups = "system")
	public void Comment() {
		
		driver.findElement(By.linkText("Blog")).click();
		driver.findElement(By.linkText("Customer Service - Client Service")).click();
		driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("Managing online business requires different skills");
		driver.findElement(By.name("add-comment")).click();
		
		String actualResult = driver.findElement(By.xpath("//h1[text()='Customer Service - Client Service']")).getText();
		
		
	    // Hard Assert
	    Assert.assertEquals(expectedResult, actualResult);
	    Reporter.log("Successfully Navigated to Customer Service - Client Service page", true);
	}
	
}

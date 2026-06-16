package Advance_Selenium_;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_016_  extends BaseClass{
	
	String expectedResult = "My account - Change password";
	
	@Test (groups = "system")
	public void aad() {
		
		driver.findElement(By.linkText("seleniumA5@gmail.com")).click();
		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.linkText("seleniumA5@gmail.com")).click();
		driver.findElement(By.linkText("Orders")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.linkText("seleniumA5@gmail.com")).click();
		driver.findElement(By.linkText("Back in stock subscriptions")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.linkText("seleniumA5@gmail.com")).click();
		driver.findElement(By.linkText("Reward points")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.linkText("seleniumA5@gmail.com")).click();
		driver.findElement(By.linkText("Change password")).click();
		
		String actualResult = driver.findElement(By.xpath("//h1[text()='My account - Change password']")).getText();
		
		// Hard Assert
		Assert.assertEquals(expectedResult, actualResult);
		Reporter.log("Successfully Navigated to My account - Change password page", true);	
	}
}

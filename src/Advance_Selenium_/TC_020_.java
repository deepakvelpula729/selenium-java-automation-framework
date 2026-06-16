package Advance_Selenium_;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_020_ extends BaseClass{

	String expectedResult ="Your order has been successfully processed!";
	
	@Test (groups = "system")
	
	public void orders() {
		
		driver.findElement(By.linkText("Orders")).click();
		driver.findElement(By.xpath("(//input[@value='Details'])[1]")).click();
		driver.findElement(By.xpath("//input[@value='Re-order']")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[1]")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[2]")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[3]")).click();
		driver.findElement(By.id("paymentmethod_0")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[4]")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[5]")).click();
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		String actualResult = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']")).getText();
		
		// Hard Assert
		Assert.assertEquals(expectedResult, actualResult);
		Reporter.log("Successfully Navigated to Thank you page", true);
	
	}
	
}

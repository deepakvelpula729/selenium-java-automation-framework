package Advance_Selenium_;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_006_ extends BaseClass {
	
	String expectedResult ="Checkout";
	
	@Test (groups = "system")
	public void checkOut() {
		driver.findElement(By.id("small-searchterms")).sendKeys("14.1-inch Laptop",Keys.ENTER);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		String actualResult = driver.findElement(By.xpath("//h1[text()='Checkout']")).getText();
		
		//hard assert
		Assert.assertEquals(expectedResult, actualResult);
		Reporter.log("Successfully Navigated to Checkout page", true);
		
	}

}

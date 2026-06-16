package Advance_Selenium_;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_007_ extends BaseClass{
	
	String expectedResult = "Wishlist";
	
	@Test (groups = "system")
	public void wishList() {
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		driver.findElement(By.linkText("$5 Virtual Gift Card")).click();
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("Deepak");
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys("Deepak@gmail.com");
		driver.findElement(By.id("add-to-wishlist-button-1")).click();
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		String actualResult = driver.findElement(By.xpath("//h1[contains(text(),'Wishlist')]")).getText();
		
		// hard assert
		Assert.assertEquals(expectedResult, actualResult);
		Reporter.log("Successfully Navigated to Wishlist page", true);
	}

}

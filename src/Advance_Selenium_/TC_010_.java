package Advance_Selenium_;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_010_  extends BaseClass{
	
	String expectedResult = "Compare products";
	
	@Test (groups = "system")
	public void Compareproducts() {
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		driver.findElement(By.linkText("3rd Album")).click();
		driver.findElement(By.id("add-to-cart-button-53")).click();
		driver.findElement(By.id("add-to-wishlist-button-53")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		String actualResult = driver.findElement(By.xpath("//h1[text()='Compare products']")).getText();
		
		// hard assert
		Assert.assertEquals(expectedResult, actualResult);
		Reporter.log("Successfully Navigated to Compare products page", true);
		
	}

}

package Advance_Selenium_;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_004_ extends BaseClass{
	
	String expectedData ="Shopping cart";
	
	@Test (groups = "system")
	public void shoppingCart() {
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.linkText("Computing and Internet")).click();
		driver.findElement(By.id("add-to-cart-button-13")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		String actualData = driver.findElement(By.xpath("//h1[text()='Shopping cart']")).getText();
		
		//hard assert
		Assert.assertEquals(expectedData, actualData);
		Reporter.log("Navigated to Shopping cart Page Successfully", true);
	}

}

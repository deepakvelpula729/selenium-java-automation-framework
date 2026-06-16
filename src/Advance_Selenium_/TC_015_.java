package Advance_Selenium_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_015_ extends BaseClass{
	
	String expectedResult = "Shopping cart";
	
	@Test (groups = "system")
	public void AddtocartMultileItems() {
		
		driver.findElement(By.linkText("New products")).click();
		driver.findElement(By.linkText("TBlue Jeans")).click();
		WebElement Jeans_quantity = driver.findElement(By.id("addtocart_81_EnteredQuantity"));
		Jeans_quantity.clear();
		Jeans_quantity.sendKeys("10");
		
		driver.findElement(By.id("add-to-cart-button-81")).click();
		
		driver.findElement(By.linkText("Casual Golf Belt")).click();
		WebElement Belt_quantity = driver.findElement(By.id("addtocart_40_EnteredQuantity"));
		Belt_quantity.clear();
		Belt_quantity.sendKeys("10");
		
		driver.findElement(By.id("add-to-cart-button-40")).click();
		
		driver.findElement(By.linkText("Phone Cover")).click();
		WebElement Phone_Cover_quantity = driver.findElement(By.id("addtocart_80_EnteredQuantity"));
		Phone_Cover_quantity.clear();
		Phone_Cover_quantity.sendKeys("10");
		
		driver.findElement(By.id("add-to-cart-button-80")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		String actualResult = driver.findElement(By.xpath("//h1[text()='Shopping cart']")).getText();

		// Hard assert
		Assert.assertEquals(expectedResult, actualResult);
		Reporter.log("Successfully Navigated to Shopping cart page", true);
		
	}

}

package Advance_Selenium_;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_003_ extends BaseClass{
	
	String expectedData="Shopping cart";
	
	@Test (groups = "integration")
	public void toCheckShoppingCartPage() {
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		String actualData = driver.findElement(By.xpath("//h1[text()='Shopping cart']")).getText();
	
		//Hard Assert
		Assert.assertEquals(expectedData, actualData);
		Reporter.log("Navigated to Computers Page Successfully", true);
	}

}




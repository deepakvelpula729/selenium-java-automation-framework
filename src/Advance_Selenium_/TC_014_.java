package Advance_Selenium_;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_014_ extends BaseClass{
	
	String expectedResult = "New products";
	
	@Test (groups = "system") 
	public void NewProducts() {
		driver.findElement(By.linkText("Search")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.linkText("News")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.linkText("Blog")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.linkText("Recently viewed products")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.linkText("Compare products list")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.linkText("New products")).click();
		String actualResult = driver.findElement(By.xpath("//h1[text()='New products']")).getText();
		
		//hard asser
		Assert.assertEquals(expectedResult, actualResult);
		Reporter.log("Successfully Navigated to New products page", true);
	}

}

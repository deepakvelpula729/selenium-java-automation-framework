package Advance_Selenium_;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_009_ extends BaseClass{
	
	String expectedResult = "Gift Cards";
	
	@Test (groups = "system")
	public void TopMenu() {
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.partialLinkText("Computers")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.partialLinkText("Electronics")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.partialLinkText("Jewelry")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		String actualResult = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
		
		// hard assert
		Assert.assertEquals(expectedResult, actualResult);
		Reporter.log("Successfully Navigated to Gift Cards page", true);
		
		
	}

}

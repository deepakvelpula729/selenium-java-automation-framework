package Advance_Selenium_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_017_ extends BaseClass {
	
	String expectedResult = "My account - Addresses";

	@Test (groups = "system")
	public void Add_New_Address() {
	
		driver.findElement(By.linkText("seleniumA5@gmail.com")).click();
		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.xpath("//input[@value='Add new']")).click();
		driver.findElement(By.id("Address_FirstName")).sendKeys("ABCD");
		driver.findElement(By.id("Address_LastName")).sendKeys("abcd");
		driver.findElement(By.id("Address_Email")).sendKeys("AaBbCcDc@gmail.com");
		driver.findElement(By.id("Address_Company")).sendKeys("abcd__");
		
		WebElement Country = driver.findElement(By.id("Address_CountryId"));
		Select count = new Select(Country);
		count.selectByContainsVisibleText("India");
		
		driver.findElement(By.id("Address_City")).sendKeys("Bengaluru");
		driver.findElement(By.id("Address_Address1")).sendKeys("Marathalli");
		driver.findElement(By.id("Address_Address2")).sendKeys("Marathalli____");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("560037");
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("7785214125");
		driver.findElement(By.id("Address_FaxNumber")).sendKeys("1478523690");
		
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
		String actualResult = driver.findElement(By.xpath("//h1[text()='My account - Addresses']")).getText();
		
		// Hard Assert
		Assert.assertEquals(expectedResult, actualResult);
		Reporter.log("Successfully Navigated to My account - Addresses page", true);
		
	}
}

package Advance_Selenium_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_013_ extends BaseClass {
	
	String expectedResult = "Copy of Computing and Internet EX";
	
	@Test (groups = "system")
	public void Search() {
		driver.findElement(By.linkText("Search")).click();
		driver.findElement(By.id("Q")).sendKeys("Computing and Internet");
		driver.findElement(By.id("As")).click();
		
		WebElement Category = driver.findElement(By.id("Cid"));
		Select select = new Select(Category);
		select.selectByValue("1");
		
		driver.findElement(By.id("Isc")).click();
		
		WebElement Manufacturer = driver.findElement(By.id("Mid"));
		Select select1 = new Select(Manufacturer);
		select1.selectByContainsVisibleText("All");
		
		driver.findElement(By.id("Pf")).sendKeys("1");
		driver.findElement(By.id("Pt")).sendKeys("10");
		driver.findElement(By.id("Sid")).click();
		driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();
		
		driver.findElement(By.linkText("Copy of Computing and Internet EX")).click();
		
		String actualResult = driver.findElement(By.xpath("//h1[contains(text(),'Copy of Computing and Internet EX')]")).getText();
		
		//hard assert
		Assert.assertEquals(expectedResult, actualResult);
		Reporter.log("Successfully Navigated to Copy of Computing and Internet EX page", true);
		
		
	}

}

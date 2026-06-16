package Advance_Selenium_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_008_ extends BaseClass {
	
	String expectedResult = "Computing and Internet";
	
	@Test (groups = "system")
	public void ComputerAndInternet() {
		driver.findElement(By.partialLinkText("Books")).click();
		
     	WebElement sortBy = driver.findElement(By.id("products-orderby"));
		Select select = new Select(sortBy);
		select.selectByIndex(1);
		
		WebElement Display = driver.findElement(By.id("products-pagesize"));
		Select select1 = new Select(Display);
		select1.selectByContainsVisibleText("4");
		
		WebElement ViewAs = driver.findElement(By.id("products-viewmode"));
		Select select2 = new Select(ViewAs);
		select2.selectByContainsVisibleText("List");
		
		driver.findElement(By.linkText("Computing and Internet")).click();
		
		String actualResult = driver.findElement(By.xpath("//h1[contains(text(),'Computing and Internet')]")).getText();
		
		
		// hard assert
		Assert.assertEquals(expectedResult, actualResult);
		Reporter.log("Successfully Navigated to Computing and Internet page", true);
		
	}

}

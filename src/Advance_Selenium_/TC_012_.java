package Advance_Selenium_;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_012_  extends BaseClass{
	
	String expectedResult ="Contact Us";
	
	@Test (groups = "system")
	public void ContactUs() {
		driver.findElement(By.linkText("Sitemap")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.linkText("Shipping & Returns")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.linkText("Privacy Notice")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.linkText("Conditions of Use")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.linkText("About us")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		driver.findElement(By.linkText("Contact us")).click();
		
		String actualResult = driver.findElement(By.xpath("//h1[text()='Contact Us']")).getText();
		
		//hard assert
		Assert.assertEquals(expectedResult, actualResult);
		Reporter.log("Successfully Navigated to Contact Us page", true);
		
	}
	

}

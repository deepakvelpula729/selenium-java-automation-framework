package Advance_Selenium_;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_005_ extends BaseClass {
	
	String expectedResult ="Your message has been sent.";
	@Test (groups = "system")
	public void sendMail() {
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.linkText("Computing and Internet")).click();
		driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
		driver.findElement(By.id("FriendEmail")).sendKeys("qwert@gmail.com");
		driver.findElement(By.name("send-email")).click();
		String actualResult = driver.findElement(By.xpath("//div[contains(text(),'Your message has been sent')]")).getText();
		
		//Hard Assert
		Assert.assertEquals(expectedResult, actualResult);
		Reporter.log("Succesfully Your message has been sent", true);
		
	}

}

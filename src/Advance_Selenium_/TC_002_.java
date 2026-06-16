package Advance_Selenium_;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_002_ extends BaseClass{
	
	String expecteddata ="Computers";
	
	@Test (groups = "integration")
	public void tocheckComputersPage () {
		driver.findElement(By.partialLinkText("Computers")).click();
		String actualdata = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
		
		//Hard Assert 
		Assert.assertEquals(expecteddata, actualdata);
		Reporter.log("Navigated to Computers Page Successfully", true);
	}

}

package Advance_Selenium_;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_001_ extends BaseClass {
	String expecteddata ="Books";
	
	@Test (groups = "integration")
	public void tocheckbookspage() {
		driver.findElement(By.partialLinkText("Books")).click();
		String actualdata = driver.findElement(By.xpath("//h1[text()='Books']")).getText();

		// hard assert in assertion
		Assert.assertEquals(expecteddata, actualdata);
		Reporter.log("Navigated succesfully to Books Page ", true);
		
		
		// soft Assert
//		SoftAssert sa = new SoftAssert();
//		sa.assertEquals(actualdata, expecteddata);
//		Reporter.log("Navigated succesfully to Books Page", true);
//		sa.assertAll();
	}

}
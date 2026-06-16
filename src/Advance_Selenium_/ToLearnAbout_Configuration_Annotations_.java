package Advance_Selenium_;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToLearnAbout_Configuration_Annotations_ {

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Before suite got executed ", true);
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("After suite got executed", true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before test got executed", true);
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("After test got executed", true);
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Before class got executed", true);
	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("After class got executed", true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Before method got executed", true);
	}
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("After method got executed", true);
	}
	
	@Test
	public void testcase() {
		Reporter.log("Test case got executed", true);
	}	
}

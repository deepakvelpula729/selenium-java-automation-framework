package Advance_Selenium_;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnAbout_TestNG_with_dependsOnMethods_ {
	
	@Test 
	public void createAccount() {
		Reporter.log("Account got Created", true);
	}

	@Test (dependsOnMethods ="createAccount")
	public void editAccount() {
		Reporter.log("Account got Edited", true);
	}
	
	@Test (dependsOnMethods = "editAccount")
	public void deleteAccount() {
		Reporter.log("Account got Deleted", true);
	}

}

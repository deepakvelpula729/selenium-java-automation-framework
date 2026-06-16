package Advance_Selenium_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnAbout_TestNG_Priority_and_invocationCount_ {   // testNG class

	@Test (priority = 1, invocationCount = 3)
	public void cricbuzz() { // Test case
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("Cricbuzz got Executed", true); 
		driver.quit();   // Test steps
	}
	
	@Test (priority = -12, invocationCount = 1)
	public void baskinRobbins() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("baskinRobbins got Executed", true);
		driver.quit();
	}
	
	@Test (priority = 3, invocationCount = 2)
	public void amazon() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon got Executed", true);
		driver.quit();
	}
	
	
}

package Advance_Selenium_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class ToLearnAbout_TestNG_with_enabled_ {
	  
		@Test (enabled = true)
		public void cricbuzz() { // Test case
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.cricbuzz.com/");
			Reporter.log("Cricbuzz got Executed", true); 
			driver.quit();   // Test steps
		}
		
		@Test (enabled = false)
		public void baskinRobbins() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://baskinrobbinsindia.com/");
			Reporter.log("baskinRobbins got Executed", true);
			driver.quit();
		}
		
		@Test (enabled = false)
		public void amazon() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Reporter.log("amazon got Executed", true);
			driver.quit();
		}
		
		
	}

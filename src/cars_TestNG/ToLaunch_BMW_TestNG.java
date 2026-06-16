package cars_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunch_BMW_TestNG {

	
	@Test (groups = "smoke")
	public void BMW() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bmw.com/en/index.html");
		Reporter.log("BMW got Launched", true);
		driver.quit();
		
	}
}

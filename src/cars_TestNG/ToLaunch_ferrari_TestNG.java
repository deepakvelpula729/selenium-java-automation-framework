package cars_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunch_ferrari_TestNG {

	

	@Test(groups = "smoke")
	public void Ferrari() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ferrari.com/en-IN");
		Reporter.log("Ferrari got Launched", true);
		driver.quit();
		
	}
}

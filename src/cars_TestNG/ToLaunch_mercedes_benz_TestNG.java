package cars_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunch_mercedes_benz_TestNG {
	
	@Test (groups = "integration")
	public void benz() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mercedes-benz.co.in/passengercars.html?");
		Reporter.log("Benz got Launched", true);
		driver.quit();
		
	}

}

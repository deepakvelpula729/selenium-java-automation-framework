package cars_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunch_rolls_royce_TestNG {
	
	@Test (groups = "system")
	public void rolls_royce() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rolls-roycemotorcars.com/en_GB/home.html");
		Reporter.log("Rolls_Royce got Launched", true);
		driver.quit();
		
	}

}

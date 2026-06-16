package cars_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunch_porsche_TestNG {

	@Test (groups = "integration")
	public void porsche() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.porsche.com/international/");
		Reporter.log("Porsche got Launched", true);
		driver.quit();
		
	}
}

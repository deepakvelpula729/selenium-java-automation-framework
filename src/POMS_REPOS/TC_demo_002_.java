package POMS_REPOS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_demo_002_ {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		// click on shopping cart link
		HomePage hp = new HomePage(driver);
		hp.getShoppingCartLink().click();
		
		driver.quit();
	}

}

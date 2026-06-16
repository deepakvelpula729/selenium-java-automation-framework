package POMS_REPOS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_demo_003_ {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		// login link in homepage class
		
		HomePage hp = new HomePage(driver);
		hp.getLoginLink().click();
		
		//enter details in login page class
		logInPage lp = new logInPage(driver);
		lp.getEmailTextfield().sendKeys("seleniumA5@gmail.com");
		lp.getPasswordTextfield().sendKeys("selenium@123");
		lp.getLoginButton().click();
		
		driver.quit();
		
	}

}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutBY_NAME_locators {

	public static void main(String[] args) throws InterruptedException {

		// open chrome
		ChromeDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//open orange hrm
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		// enter username
		driver.findElement(By.name("username")).sendKeys("deepak");
		
		Thread.sleep(3000);
		
		// enter password
		driver.findElement(By.name("password")).sendKeys("deepak@123456");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}

}

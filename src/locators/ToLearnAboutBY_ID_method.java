package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutBY_ID_method {

	public static void main(String[] args) throws InterruptedException {
     
		// launch chrome
		ChromeDriver driver = new ChromeDriver();
		
		// maximum
		driver.manage().window().maximize();
		
		// open facebook
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		// enter username
		driver.findElement(By.id("email")).sendKeys("deepak@gmail.com");
		
		Thread.sleep(3000);
		
		// enter password
		driver.findElement(By.id("pass")).sendKeys("deepak@0987654321");
		
	}

}

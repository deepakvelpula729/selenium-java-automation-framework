package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tolearnaboutby_ID_locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		// open chrome
		ChromeDriver driver = new ChromeDriver();
		
		// maximize
		driver.manage().window().maximize();
		
		// open chrome
		driver.get("https://www.actitime.com/free-online-trial");
		
		Thread.sleep(3000);
		
		// enter name
		driver.findElement(By.id("FirstName")).sendKeys("deepak");
		
		Thread.sleep(3000);
		
		// enter last name
		driver.findElement(By.id("LastName")).sendKeys("deepu");
		
		Thread.sleep(3000);
		
		// enter email
		driver.findElement(By.id("Email")).sendKeys("deepak@gmail.com");
		
		Thread.sleep(3000);
		
		// enter Company
		driver.findElement(By.id("Company")).sendKeys("12344");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}
}	
	

	
	
	
	
	
	
	
	



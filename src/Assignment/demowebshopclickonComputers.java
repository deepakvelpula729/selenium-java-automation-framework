package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshopclickonComputers {

	public static void main(String[] args) throws InterruptedException {

		//open chromr
		ChromeDriver driver = new ChromeDriver();
		
		
		//maximize
		driver.manage().window().maximize();
		
		// open demo wed shop
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		// click on downloads
		driver.findElement(By.linkText("Log in")).click();
		
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}

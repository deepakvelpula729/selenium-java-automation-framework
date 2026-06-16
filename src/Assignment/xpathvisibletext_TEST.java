package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathvisibletext_TEST {

	public static void main(String[] args) throws InterruptedException {

		// open chrome
		ChromeDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		// open demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		// click on wishlist
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		
		
		
	}

}

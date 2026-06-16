package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutBY_XTPATHWITHVISIBLETEXT_Locator {

	public static void main(String[] args) throws InterruptedException {

		// open chrome
		ChromeDriver driver = new ChromeDriver();
		
		// maximize
		driver.manage().window().maximize();
		
		// open demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		// click on shopping cart  with xpath visible text
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		
		
		
		
		
	}

}

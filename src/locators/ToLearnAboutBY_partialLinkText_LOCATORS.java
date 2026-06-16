package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutBY_partialLinkText_LOCATORS {

	public static void main(String[] args) throws InterruptedException {

		// open chrome
		ChromeDriver driver = new ChromeDriver();
		
		// maximize
		driver.manage().window().maximize();
		
		//open demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		// click on books button
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}

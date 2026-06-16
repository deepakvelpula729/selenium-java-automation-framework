package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutBY_cssSelector_LOCARTOR {

	public static void main(String[] args) throws InterruptedException {

		// open chrome
		ChromeDriver driver = new ChromeDriver();
		
		// maximize
		driver.manage().window().maximize();
		
		// open demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		// click on search
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
	}

}

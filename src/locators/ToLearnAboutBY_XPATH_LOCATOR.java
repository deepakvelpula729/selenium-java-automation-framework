package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutBY_XPATH_LOCATOR {

	public static void main(String[] args) throws InterruptedException {

		// open chrome
		ChromeDriver driver = new ChromeDriver();
		
		// maximize
		driver.manage().window().maximize();
		
		// open demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		// click on loging link
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(3000);
		
		// click on login button without filling details with xpath
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		
		
	}

}

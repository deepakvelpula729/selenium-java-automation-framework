package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutBY_XPATH_MULTIPLE_ATTRIBUTE_Locator {

	public static void main(String[] args) throws InterruptedException {

		// open chrome
		ChromeDriver driver = new ChromeDriver();
		
		// maximize
		driver.manage().window().maximize();
		
		// open demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		// click on login link
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(3000);

		
		// click on search bar
		driver.findElement(By.xpath("//input[@type='submit' and @value='Search']")).click();
		
		Thread.sleep(3000);

		
		driver.quit();
	
	}

}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutBY_CLASSNAME_LOCATOR {

	public static void main(String[] args) throws InterruptedException {
		
		// open chrome
		ChromeDriver driver = new ChromeDriver();
		
		// maximize
		driver.manage().window().maximize();
		
//		 open instagram
//		driver.get("https://www.instagram.com/");
		
//		
//		// enter class name class
//		driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys("deepak");
		
		// open demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		
//		// click on loging 
//		driver.findElement(By.linkText("Log in")).click();
//		
//		Thread.sleep(3000);
//		
//		// enter email id with class name
//		driver.findElement(By.className("email")).sendKeys("deepak@gmail.com");
//		
		Thread.sleep(3000);
		
		// click on loging 
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		
		Thread.sleep(3000);
		
		// enter email id with class name
		 WebElement enteremail = driver.findElement(By.className("email"));
		 enteremail.sendKeys("deepak@gmail.com");
		
		 Thread.sleep(3000);
		
		
		
		driver.quit();
		
		
		
		
		

	}

}

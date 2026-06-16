package WebElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutCLEAR_Method {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// open demo vtiger website
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		Thread.sleep(3000);
		
		// to clear the data which is already present
		 WebElement username = driver.findElement(By.id("username"));
		 username.clear();
		 username.sendKeys("deepak@gmail.com");
		 
		 Thread.sleep(3000);
		 
		 // to clear password
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("deepu@123");
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {

		// open chrome
		ChromeDriver driver = new ChromeDriver();
		
		// maximize
		driver.manage().window().maximize();
		
		// open demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		
		// click on register
		driver.findElement(By.partialLinkText("Register")).click();
		
		// 
		driver.findElement(By.id("gender-male")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("deepak");
		
		driver.findElement(By.id("LastName")).sendKeys("velpula");
		
		driver.findElement(By.id("Email")).sendKeys("deepakvelpula2002@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("Vdkdeepu@1");
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Vdkdeepu@1");
		
		driver.findElement(By.id("register-button")).click();
		
		
		
		
		
		
	}

}

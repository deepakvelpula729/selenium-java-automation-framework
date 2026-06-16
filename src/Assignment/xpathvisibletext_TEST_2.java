package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathvisibletext_TEST_2 {

	public static void main(String[] args) throws InterruptedException {

		// open chrom
		ChromeDriver driver = new ChromeDriver();
		
		// maximize
		driver.manage().window().maximize();
		
		// open demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		// click on register
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("deepak");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("velpula");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("deepak@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123vdk@456");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123vdk@456");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
	}

}

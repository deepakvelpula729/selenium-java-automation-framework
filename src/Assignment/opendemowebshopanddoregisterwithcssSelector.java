package Assignment;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class opendemowebshopanddoregisterwithcssSelector {

	public static void main(String[] args) throws InterruptedException {

		//open chrome
		ChromeDriver driver = new ChromeDriver();
		
		// maximize
		driver.manage().window().maximize();
		
		// open demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		// click on register
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		
		Thread.sleep(3000);
		
		// click on male radio button
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		
		Thread.sleep(3000);
		
		//click on first name text field and pass value
		driver.findElement(By.cssSelector("input[data-val-required='First name is required.']")).sendKeys("deepak");
		
		Thread.sleep(3000);
		
		//click on last name text field and pass value
		driver.findElement(By.cssSelector("input[data-val-required='Last name is required.']")).sendKeys("velpula");
		
		Thread.sleep(3000);
		
		//click on email text field and pass value
		driver.findElement(By.cssSelector("input[data-val-required='Email is required.']")).sendKeys("123@gmail.com");
		
		Thread.sleep(3000);
		
		//click on password text field and pass value
		driver.findElement(By.cssSelector("input[data-val-length='The password should have at least 6 characters.']")).sendKeys("qwe@qwe");
		
		Thread.sleep(3000);
		
		// click on confirm password text field and pass value
		driver.findElement(By.cssSelector("input[data-val-equalto='The password and confirmation password do not match.']")).sendKeys("qwe@qwe");
		
		Thread.sleep(3000);
		
		// click on register
		driver.findElement(By.cssSelector("input[value='Register']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}

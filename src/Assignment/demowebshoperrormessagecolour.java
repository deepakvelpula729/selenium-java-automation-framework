package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshoperrormessagecolour {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		
		// click on login
		driver.findElement(By.linkText("Log in")).click();
		
		//click on login button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//get colour of error message
		WebElement colouroferrormessage = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
		
		System.out.println(colouroferrormessage.getCssValue("color"));
		
		driver.quit();
	}

}

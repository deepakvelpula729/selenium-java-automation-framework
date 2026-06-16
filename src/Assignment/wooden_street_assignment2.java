package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wooden_street_assignment2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// open wooden street
		driver.get("https://www.woodenstreet.com/");
		
		driver.findElement(By.xpath("//span[text()='close']")).click();
	}

}

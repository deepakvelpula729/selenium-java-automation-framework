package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shoppers_stack_implicit_wait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// to wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://shoppersstack.com/products_page/31");
		
		driver.findElement(By.id("Check Delivery")).sendKeys("560037");
		
		driver.findElement(By.xpath("//button[@id='Check' and @ name='Check']")).click();
		
		driver.quit();
		
	}

}

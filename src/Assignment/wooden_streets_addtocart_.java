package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class wooden_streets_addtocart_ {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.woodenstreet.com/");
		
		WebElement diningtable = driver.findElement(By.xpath("(//span[text()='Dining'])[2]"));
		
		//  to click on dining table
		Actions action = new Actions(driver);
		action.click(diningtable).perform();
		
		WebElement addtocart = driver.findElement(By.xpath("(//button[text()='Add To Cart'])[1]"));
		Actions action1 = new Actions(driver);
		action.click(addtocart).perform();
		
		
		 WebElement cart = driver.findElement(By.xpath("(//a[@target='_self'])[9]"));
		 Actions action2 = new Actions(driver);
			action.click(cart).perform();
		
		
		
		//Thread.sleep(3000);
		
		driver.quit();
		
	}

}

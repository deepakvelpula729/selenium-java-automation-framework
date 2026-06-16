package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class to_perform_moveToElement_ {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.qvc.com/");
		
		// find id for shop
		WebElement shopElement = driver.findElement(By.id("shopByCategory"));
		
		//to use Action class (mouse action)  (moveToElement)
		Actions action = new Actions(driver);
		action.moveToElement(shopElement).perform();
	}

}

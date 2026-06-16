package Action_Class;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class to_perform_click_action {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// open demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		
		// identify search button
		WebElement searchbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		
		// to use action class
		Actions action = new Actions(driver);
		action.click(searchbutton).perform();
		
		//driver.quit();
		
	}

}

package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sbi_yono_close_popup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://yonobusiness.sbi.bank.in/");
		
		WebElement close = driver.findElement(By.xpath("//span[contains(@class,'icon-cancel')]"));
		
		Actions action = new Actions(driver);
		action.click(close).perform();
	}

}

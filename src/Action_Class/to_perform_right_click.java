package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class to_perform_right_click {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com/");
		
		//WebElement gmailbutton = driver.findElement(By.linkText("Gmail"));
		
		// to perform right click (contextClick)
		Actions action = new Actions(driver);
		action.contextClick().perform();
		
		//action.contextClick(gmailbutton).perform();
	}

}

package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Learn_about_Hidden_Elements_ {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		// Identify Hidden Element
		WebElement HiddenElement = driver.findElement(By.id("custom_gender"));
		
		// to use java script executer     // by using hidden element
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='others'", HiddenElement);
		}

}

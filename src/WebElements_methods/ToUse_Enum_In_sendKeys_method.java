package WebElements_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUse_Enum_In_sendKeys_method {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		
		// to use enum in sendkeys
		driver.findElement(By.name("q")).sendKeys("mobiles",Keys.ENTER);
		
		driver.quit();
		
	}

}

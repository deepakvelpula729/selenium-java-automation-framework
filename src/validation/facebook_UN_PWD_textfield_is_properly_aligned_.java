package validation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_UN_PWD_textfield_is_properly_aligned_ {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		// username textfield
		int usernametextfield = driver.findElement(By.id("email")).getLocation().getX();
		System.out.println(usernametextfield);
		
		// password text field
		int passwordtextfield = driver.findElement(By.id("pass")).getLocation().getX();
		System.out.println(passwordtextfield);
		
		if(usernametextfield==passwordtextfield) {
			System.out.println("username textfield and passwoed textfield are properly aligned");
		}
		else {
			System.out.println("username textfield and passwoed textfield are not aligned properly");
		}
		driver.quit();
		
		
	}

}

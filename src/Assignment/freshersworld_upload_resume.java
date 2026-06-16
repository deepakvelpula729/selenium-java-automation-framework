package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class freshersworld_upload_resume {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.freshersworld.com/user/register");
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Deepak\\OneDrive\\文档\\resume\\Deepak_Velpula_Selenium_Tester_Resume.pdf");
	}

}

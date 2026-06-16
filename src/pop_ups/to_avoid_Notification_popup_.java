package pop_ups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class to_avoid_Notification_popup_ {

	public static void main(String[] args) {

		// to avoid notification pop up
		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--disable-notifications");
		               //or
		//settings.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.hyundai.com/in/");
		
		
	}

}

package pop_ups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_avoid_Authentication_popup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		// to avoid Authentication popup // we shouls pass id and pass in url and end with @
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}

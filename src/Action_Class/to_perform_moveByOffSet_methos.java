package Action_Class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class to_perform_moveByOffSet_methos {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.qvc.com/");
		
		// to perform actions class
		Actions action = new Actions(driver);
		action.moveByOffset(224, 71).perform();
	}

}

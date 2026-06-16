package pop_ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class to_Handel_prompt_popups_ {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		// to handel frame
		driver.switchTo().frame("iframeResult");
		
		// to click on try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		// to handel popup
		Alert conformationpopup = driver.switchTo().alert();
		conformationpopup.sendKeys("qwertyuiop"); // to pass some data
		conformationpopup.accept(); // to click on ok button
	}
}

package pop_ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class to_Handel_alert_popus {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		// to handel frame
		driver.switchTo().frame("login_page");
		
		// to click on countinue button
		driver.findElement(By.linkText("CONTINUE")).click();
		
		// to handel the popup
		Alert alertpopup = driver.switchTo().alert();
		System.out.println(alertpopup.getText()); // to capture the text present in the popup
		
		
		//alertpopup.accept(); // to click on OK button
		         //or
		alertpopup.dismiss();// this will also click on ok only in alert popup
		
		
		driver.quit();
	}

}

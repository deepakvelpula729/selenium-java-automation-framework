package pop_ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class to_handel_confirmation_popup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://licindia.in/home");
		
		// to click on english button
		driver.findElement(By.id("englishBtn")).click();
		
		// to click on login
		driver.findElement(By.partialLinkText("Login")).click();
		
		// to handel confermation popup 
		Alert confermationpopup = driver.switchTo().alert();
		System.out.println(confermationpopup.getText());
		confermationpopup.accept(); // to click on ok button
		
		           // or
		//confermationpopup.dismiss(); // to click on cancle button
		
		 driver.quit();
		
		
		
	}

}

package Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_demo_webshop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://demowebshop.tricentis.com/");
		
		// to click on search
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		// to handel the popup
		Alert alertpopup = driver.switchTo().alert();
		
		System.out.println(alertpopup.getText());
		alertpopup.accept();
		
		driver.quit();
		
	}

}

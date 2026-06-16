package pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class to_avoid_File_upload_popup_ {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");
		
		// to click of I'm Experience
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		
		// to avoid file upload pop-up  along wwith(.pdf)
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Deepak\\OneDrive\\文档\\resume\\Deepak_Velpula_Selenium_Tester_Resume.pdf");
	}

}

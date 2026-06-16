package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class yono_sbi_pop_up {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		
		 driver.findElement(By.xpath("//span[contains(@class,'icon-cancel')]")).click();
		 
		 driver.findElement(By.id("password")).sendKeys("12345678");
		 
		WebElement eyeIcon = driver.findElement(By.xpath("//img[@src='assets/img/Revamp/icon_eye_close.svg']"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(eyeIcon).perform();
		
		
	}

}

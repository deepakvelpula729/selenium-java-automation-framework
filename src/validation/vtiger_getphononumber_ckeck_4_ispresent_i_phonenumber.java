package validation;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class vtiger_getphononumber_ckeck_4_ispresent_i_phonenumber {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.vtiger.com/");
		
		
		WebElement company = driver.findElement(By.partialLinkText("Company"));
		Actions action = new Actions(driver);
		action.moveToElement(company).perform();
		
		driver.findElement(By.linkText("Contact Us")).click();
		
		String phonenumber = driver.findElement(By.xpath("//p[contains(text(),'+91 9243602352')]")).getText();
		
		if(phonenumber.contains("4")) {
			System.out.println(phonenumber+"----- 4 is present");
		}
		else {
			System.out.println(phonenumber+"------ 4 is not present");
		}
		
		driver.quit();
	}

}

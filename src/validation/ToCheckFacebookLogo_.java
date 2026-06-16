package validation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckFacebookLogo_ {

	public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.facebook.com/");
			
		    boolean facebooklogo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		    
		    if(facebooklogo==true) {
		    	System.out.println("facebook logo is displayed");
		    }else {
		    	System.out.println("facebook logo is not displayed");
		    }
			 
			 driver.quit();
		

	}

}

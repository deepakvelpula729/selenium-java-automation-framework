package iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff_enter_value_in_search_click_on_sigin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://www.rediff.com/");
		
		// to handel frame  using index and switch
		 driver.switchTo().frame(0);
		 
		// to enter the data in the search field
		 driver.findElement(By.id("query")).sendKeys("ibm");
		 
//		 // to switch back to parent window
//		 //driver.switchTo().parentFrame(); // imm parent
		 driver.switchTo().defaultContent();  // main webpage (default parent)
		 
		 // click sign in
		 driver.findElement(By.linkText("Sign in")).click();
	}

}

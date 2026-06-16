package WebElements_methods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAbout_getAttribute_Method {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// open actitime 
		driver.get("https://www.actitime.com/");
		
		Thread.sleep(3000);
		
		// to get attribute value
	      @Nullable
		String value = driver.findElement(By.linkText("Try actiTIME for Free")).getAttribute("class");
	      System.out.println(value);
	      
	      Thread.sleep(3000);
	      driver.quit();
	  
		
	}

}

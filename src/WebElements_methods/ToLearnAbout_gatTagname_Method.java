package WebElements_methods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAbout_gatTagname_Method {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// open actitime 
		driver.get("https://www.actitime.com/");
				
		Thread.sleep(3000);
				
		// to get attribute value
			      	
		String tagname = driver.findElement(By.linkText("Try actiTIME for Free")).getTagName();
		System.out.println(tagname);
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}

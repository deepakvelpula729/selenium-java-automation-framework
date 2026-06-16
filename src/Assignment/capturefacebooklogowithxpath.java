package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class capturefacebooklogowithxpath {

	public static void main(String[] args) throws InterruptedException {

		// open chrome
		ChromeDriver driver = new ChromeDriver();
		
		// maximize
		driver.manage().window().maximize();
		
		// open facebook
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		//capture facebook text
		String facebooklogo = driver.findElement(By.xpath("//img[@alt='Facebook']")).getText();
		System.out.println(facebooklogo);
		
		driver.quit();
		
		
	}

}

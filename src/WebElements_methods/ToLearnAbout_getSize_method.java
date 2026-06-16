package WebElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAbout_getSize_method {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// open instagram
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		// capture the size of login button in instagram
		Dimension sizeofloginbutton = driver.findElement(By.xpath("//button[@type='submit']")).getSize();
		
		System.out.println(sizeofloginbutton);
		System.out.println(sizeofloginbutton.getWidth());
		System.out.println(sizeofloginbutton.getHeight());
		
		driver.quit();
		
		
		
	}

}

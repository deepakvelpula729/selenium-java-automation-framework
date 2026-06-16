package WebElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAbout_getLocation_method {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// open instagram
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		//to capture the x and y coordinates of login button
		Point position = driver.findElement(By.xpath("//button[@type='submit']")).getLocation();
		
		System.out.println(position);
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		driver.quit();
	}

}

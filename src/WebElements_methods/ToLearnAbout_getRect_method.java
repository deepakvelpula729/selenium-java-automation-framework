package WebElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAbout_getRect_method {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// open instagram
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		//to capture the size and location  of login button
		Rectangle sizeandlocation = driver.findElement(By.xpath("//button[@type='submit']")).getRect();
		
		System.out.println(sizeandlocation);
		System.out.println(sizeandlocation.getWidth());
		System.out.println(sizeandlocation.getWidth());
		System.out.println(sizeandlocation.getX());
		System.out.println(sizeandlocation.getY());
		
		driver.quit();

	}

}

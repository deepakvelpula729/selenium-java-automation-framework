package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutGetPosition {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		// to capture position of webpage
//		Point togetposition = driver.manage().window().getPosition();
//		System.out.println(togetposition);
		
		// to set position of the webpage
		Point p = new Point(200, 200);
		driver.manage().window().setPosition(p);
		   
		    // or 
		//driver.manage().window().setPosition(new Point(190, 340));
		
		
		driver.quit();
	}

}

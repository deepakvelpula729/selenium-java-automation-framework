package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutBY_TAGNAME_LOCATOR {

	public static void main(String[] args) throws InterruptedException {

		// open chrome
		ChromeDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		// open flipkart
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		// by using tagname we can get count total no of images or divs etc...
		List<WebElement> imagescount = driver.findElements(By.tagName("img"));
		System.out.println(imagescount);
		
		// exact count
		System.out.println(imagescount.size());
		
		// by using tagname we can get count total no of links a
		List<WebElement> linkscount = driver.findElements(By.tagName("a"));
		System.out.println(linkscount);
		
		
		// exact count
		System.out.println(linkscount.size());
		Thread.sleep(3000);
		
	}

}

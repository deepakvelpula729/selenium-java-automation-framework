package webdriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutNavigate {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// to launch chrome
		ChromeDriver driver = new ChromeDriver();
		
		// to maximize
		driver.manage().window().maximize();
		// to open facebook with navigate to string url 
		//driver.navigate().to("https://www.facebook.com/");
		
		// to open facebook with navigate to url url
		//driver.navigate().to(new URL("https://www.facebook.com/"));
		
		// open facebook
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		// open flipkart
		driver.get("https://www.flipkart.com/");
		
		
//		//Thread.sleep(3000);
		// to use navigate method back forard refresh
//		 Navigation nav = driver.navigate();
		 
//		 nav.back();// comeback to facebook
//		 Thread.sleep(3000);
//		 nav.forward();// come to flipkart again
//		 Thread.sleep(3000);
//		 nav.refresh(); // to refresh flipkart
//		 Thread.sleep(3000);
		 
		// or 
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}

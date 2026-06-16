package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Learn_about_window_scrolling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	//	driver.get("https://www.selenium.dev/");
		
		// to use JavaScriptExecutor   // type casting
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//	      	// by using scrollBy
//		js.executeScript("window.scrollBy(0,1000)");
//		
//		Thread.sleep(3000);
//		
//		js.executeScript("window.scrollBy(0,1000)");
		
		
//		     // by using scrollTo   // it is fixed position
//		js.executeScript("window.scrollTo(0,1000)");
//		
//		Thread.sleep(3000);
//		
//		js.executeScript("window.scrollTo(0,1500)");
		
		
		
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		// to identify Indian Flag xpath
	    WebElement indianFlag = driver.findElement(By.xpath("//img[@alt='India']"));
	    
		// using javascriptexecutor   // scrollIntoView(boolean)
		js.executeScript("arguments[0].scrollIntoView(true)", indianFlag);   // true means top of the webpage
		
	    Thread.sleep(3000);
	    
		js.executeScript("arguments[0].scrollIntoView(false)", indianFlag);   // false means bottom of the webpage
		
		driver.quit();
	}

}

package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Zomato_Logo_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// open zomato
		driver.get("https://www.zomato.com/");
		
		Thread.sleep(3000);
		
		File temp = driver.findElement(By.xpath("//div[@class='mb-6 2xl:mb-8']")).getScreenshotAs(OutputType.FILE);
		
		//take screenshot of zomato logo
		//TakesScreenshot ts = (TakesScreenshot) driver;
		//create temp file and it stores screenshot temporary
		//File temp = ts.getScreenshotAs(OutputType.FILE);
		//create a folder and name the image with image extension
      File src = new File("./errorShots/logo_of_zomato.png");
	  // copy the image from temp to src using filehandler class in selenium
     FileHandler.copy(temp,src);
	    
	    Thread.sleep(3000);
	    
	    driver.quit();
		
		
	}

}

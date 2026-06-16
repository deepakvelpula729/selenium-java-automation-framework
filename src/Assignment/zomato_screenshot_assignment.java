package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class zomato_screenshot_assignment {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// open zomato
		driver.get("https://www.zomato.com/");
		
		Thread.sleep(3000);
		
		// to take screenshot of zomato home page
		TakesScreenshot ts =(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/Zomato.png");
		FileHandler.copy(temp, src);
		
		driver.quit();
		
	}

}

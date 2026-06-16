package Screenshot;

import java.awt.desktop.OpenFilesHandler;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenshot_webelements {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		// to take screenshot of an entire webpage with webdriver
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/Flipkart.png");
		FileHandler.copy(temp, src);
		
		driver.quit();
	}

}

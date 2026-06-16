package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class flipkart_search_product_and_take_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		
		// search for a product
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
		
		// click of search icon
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String parentid = driver.getWindowHandle();
		// click of product
		driver.findElement(By.id("productRating_LSTMOBHEXHRFA2Z5TD7ZNVQFO_MOBHEXHRFA2Z5TD7_")).click();
		
		// get all the section ids
		Set<String> sectionIDS = driver.getWindowHandles();
		System.out.println(sectionIDS);
		
		// remove parent id
		sectionIDS.remove(parentid);
		
		for (String window : sectionIDS) {
            if (!window.equals(parentid)) {
                driver.switchTo().window(window);
            }
        }
		
		// to take screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src = new File("./errorshots/flipkart_product.png");
		FileHandler.copy(temp, src);
		
		Thread.sleep(3000);
		driver.quit();
	}

}

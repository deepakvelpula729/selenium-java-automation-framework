package WebElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutSumbit_Method {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// open demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		// click on search
		//driver.findElement(By.xpath("//input[@value='Search']")).submit();
		                //or
		
		 WebElement webelement = driver.findElement(By.xpath("//input[@value='Search']"));
		 webelement.submit();
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}

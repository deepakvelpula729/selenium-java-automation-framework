package WebElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAbout_getCssvalue_method {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// open actitime
		driver.get("https://www.actitime.com/");
		
		Thread.sleep(3000);
		
		// identify try free element
		WebElement tryFreeElement = driver.findElement(By.linkText("Try actiTIME for Free"));
		
		// capture css property
		System.out.println(tryFreeElement.getCssValue("border-radius"));
		
		System.out.println(tryFreeElement.getCssValue("font-size"));
		
		System.out.println(tryFreeElement.getCssValue("font-family"));
		
		System.out.println(tryFreeElement.getCssValue("background-color"));
		
		
		
		
	}

}

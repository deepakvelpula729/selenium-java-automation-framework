package WebElements_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUse_Multiple_Elements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// open demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		// capture the top navagitaion element
		List<WebElement> nagigationelements = driver.findElements(By.xpath("//ul[@class='top-menu']/li"));
		
		for(WebElement element : nagigationelements) {
			System.out.println(element.getText());
		
		}
	}

}

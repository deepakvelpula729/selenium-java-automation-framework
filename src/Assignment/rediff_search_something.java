package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff_search_something {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.rediff.com/");
		
		// to handel frame  using index and switch
		driver.switchTo().frame(0);
		
		// to enter the data in the search field
		driver.findElement(By.id("query")).sendKeys("ibm");
		
		driver.findElement(By.xpath("//input[@type='submit' and @class='getqbtn']")).click();
	}
}
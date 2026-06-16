package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class to_perforn_double_click_action_ {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver(); // upcasting
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		// xpath for double click button
		WebElement element = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		// action class_ double click action
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();

	}

}

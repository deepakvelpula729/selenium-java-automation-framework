package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_learn_about_DisableElement_ {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		
		// to click on locked element
		driver.findElement(By.linkText("jdk-17.0.17_linux-aarch64_bin.tar.gz")).click();
		
		// identify disable element
		WebElement disableElement = driver.findElement(By.linkText("Download jdk-17.0.17_linux-aarch64_bin.tar.gz"));
		
		// to use javascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", disableElement);
		
		
		driver.quit();
	}

}

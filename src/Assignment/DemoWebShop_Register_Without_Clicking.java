package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_Register_Without_Clicking {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		WebElement maleRadioButton = driver.findElement(By.id("gender-male"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", maleRadioButton);
		
		WebElement firstname = driver.findElement(By.id("FirstName"));
		js.executeScript("arguments[0].value='Deepak'", firstname );
		
		WebElement lastname = driver.findElement(By.id("LastName"));
		js.executeScript("arguments[0].value='Velpula'", lastname);
		
		WebElement email = driver.findElement(By.id("Email"));
		js.executeScript("arguments[0].value='deepak@gmail.com'", email);
		
		WebElement password = driver.findElement(By.id("Password"));
		js.executeScript("arguments[0].value='deepak@123456'", password );
		
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		js.executeScript("arguments[0].value='deepak@123456'", confirmPassword );
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}

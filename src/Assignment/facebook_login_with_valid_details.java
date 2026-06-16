package Assignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class facebook_login_with_valid_details {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Deepak");
		driver.findElement(By.id("pass")).sendKeys("deepak@123");
		driver.findElement(By.name("login")).click();	
	}
}

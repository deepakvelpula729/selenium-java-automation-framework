package iframes;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	 public class To_Learn_About_iframe_and_frame_ {
     public static void main(String[] args) {
				 
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.rediff.com/");
			
//			// to handel frame  using index and switch
//			// driver.switchTo().frame(0);
			
			// or
			
//			// to handel frame using id or name
//			//driver.switchTo().frame("moneyiframe");
			
			// or
			
//			// to handel frame using web element like xpath
			 WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Rediff Money Widget']"));
			 driver.switchTo().frame(iframe);
			
			// to enter the data in the search field
			driver.findElement(By.id("query")).sendKeys("ibm");
			
	//		driver.findElement(By.xpath("//input[@type='submit' and @class='getqbtn']")).click();
			
			driver.quit();
		}
	}



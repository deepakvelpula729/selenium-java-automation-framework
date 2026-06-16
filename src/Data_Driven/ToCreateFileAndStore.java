package Data_Driven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCreateFileAndStore {

	public static void main(String[] args) throws IOException {
			// step 1 :
			FileInputStream fis = new FileInputStream("./testData/testData.properties");

			// step 2 :
			Properties prop = new Properties();

			// step 3 :
			prop.load(fis);

			// step 4 – read a property value
			String a = prop.getProperty("url");
			
			String b = prop.getProperty("username");
			
			String c = prop.getProperty("password");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			
			driver.get(a);   // url
			driver.findElement(By.id("email")).sendKeys(b); // username
			driver.findElement(By.id("pass")).sendKeys(c); // password
			
			driver.quit();
			
		}
	}



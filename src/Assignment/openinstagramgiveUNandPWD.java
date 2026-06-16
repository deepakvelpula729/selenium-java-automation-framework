package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class openinstagramgiveUNandPWD {

	public static void main(String[] args) throws InterruptedException {

		//open chrome
		ChromeDriver driver = new ChromeDriver();
		
		// maximize
		driver.manage().window().maximize();
		
		//open instagram
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		// give username
		driver.findElement(By.name("username")).sendKeys("vdkdeepu");
		
		Thread.sleep(3000);
		
		//giver password
		driver.findElement(By.name("password")).sendKeys("deepu@123@vdk************");
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}

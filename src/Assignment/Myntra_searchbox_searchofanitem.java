package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_searchbox_searchofanitem {

	public static void main(String[] args) throws InterruptedException {

		//open chrome
		ChromeDriver driver = new ChromeDriver();
		
		// maximize
		driver.manage().window().maximize();
		
		// open myntra
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=dms_searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gad_campaignid=20443628324&gbraid=0AAAAADoxBh7S0y6jEX9gK3v6LKZYqtjKy&gclid=CjwKCAiAlfvIBhA6EiwAcErpydEv6dbkhCiabkKAKeFDWDng3UxKPKY9y2T5YwsKDx3eOUflV1k71RoCM2sQAvD_BwE");
		
		Thread.sleep(3000);
		
		// click on search bar
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("T-shirts");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
			
		
	}

}

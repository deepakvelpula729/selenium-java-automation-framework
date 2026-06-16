package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_assignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// open myntra 
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=dms_searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gad_campaignid=20443628324&gbraid=0AAAAADoxBh7sMu2GscWKvAqpJoZ1YzhTT&gclid=Cj0KCQiAiqDJBhCXARIsABk2kSnASTHDqTNDjsDEUtQsIfekcxcdIBjQ48k7ICQ0jEH9ska3EyDcBIEaAiClEALw_wcB");
		
		Thread.sleep(3000);
		
		// capture the top navagitaion element
		List<WebElement> myntranavigationbutton = driver.findElements(By.xpath("//div[@class='desktop-navLinks']"));
		
		for(WebElement elements :myntranavigationbutton) {
			System.out.println(elements.getText());
			
			Thread.sleep(3000);
			
			driver.quit();
			
		}
	}

}

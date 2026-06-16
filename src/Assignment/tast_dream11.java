package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tast_dream11 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.dream11.com/fantasy-sports");
		
		// to click on about us
		driver.findElement(By.linkText("About Us")).click();
		
		// to capture parent id 
		String patentid = driver.getWindowHandle();
		
		// to capture chaild id
		Set<String> sectionIDS = driver.getWindowHandles();
		
		// to remove parent id from all id's
		sectionIDS.remove(patentid);
		
		// for loop to switch the controler to the child tab
		for (String window : sectionIDS) {
            if (!window.equals(patentid)) {
                driver.switchTo().window(window);
            }
            
            // to 
        driver.findElement(By.linkText("Dream Responsibly")).click();
        
        driver.quit();
		
	
	  	    }	
	   }
	}

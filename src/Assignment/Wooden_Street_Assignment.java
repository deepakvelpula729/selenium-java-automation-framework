package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wooden_Street_Assignment {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// open wooden street
		driver.get("https://www.woodenstreet.com/?tw_source=google&tw_adid=776566670827&tw_campaign=14220867988&tw_kwdid=kwd-343527387996&ad_source=google&ad_id=776566670827&campaign_id=14220867988&adgroup_id=125331114403&keyword=wooden%20street&placement=s%3e&gad_source=1&gad_campaignid=14220867988&gbraid=0AAAAAC-R-9s5V-ejPQtjOaUr3MNj1hr_K&gclid=CjwKCAiA55rJBhByEiwAFkY1QBjqnf2cMbrv3ZKR9blNxLu49Rm8y6vKYJ9wo8ELwt4VzSCJbkXStRoC9P8QAvD_BwE");

		//Thread.sleep(3000);
		
		//Click on "Sofas"
        driver.findElement(By.xpath("//p[text()='Sofas']")).click();
		
		Thread.sleep(10000);
		
		driver.quit();
	
	}

}

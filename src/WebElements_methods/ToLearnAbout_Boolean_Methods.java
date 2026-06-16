package WebElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAbout_Boolean_Methods// is methods like isdisplayed() isenabled() isselected()
{

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		// open instagram
//		driver.get("https://www.instagram.com/");
//		
//		Thread.sleep(3000);
//		
//		// login button xpath 
//		// befor entering data in text filds
//		System.out.println("------brfore entering data-----");
//		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
//		System.out.println(loginbutton.isDisplayed());
//		System.out.println(loginbutton.isEnabled());
//		System.out.println("____________________________________");
//		
//		System.out.println("----after entering data--------");
//		
//		//after entering data
//		
//		driver.findElement(By.name("username")).sendKeys("deepak@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("1234567890");
//		System.out.println(loginbutton.isDisplayed());
//		System.out.println(loginbutton.isEnabled());
		
		
		
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement excelentElement = driver.findElement(By.id("pollanswers-1"));
		System.out.println(excelentElement.isSelected());//  befor selecting
		
		
		//after selecting
		
		excelentElement.click();
		System.out.println(excelentElement.isSelected());
		
		
		
		Thread.sleep(3000);
		
		
		
		driver.quit();
	}

}

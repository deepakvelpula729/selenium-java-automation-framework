package Advance_Selenium_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnAbout_DataProvider {
	
	@DataProvider(name="credentials")
	public String[][] toSendData() {
		
		String [] [] data = {
				                 {"Deepak@gmail.com" , "Deepak@123"},
				                 {"Dheeraj@gmail.com" , "Dheeraj@123"},
			                     {"likhith@gmail.com" , "likhith@123"}		
	                      	};
		return data;
	}

	@Test(dataProvider = "credentials")
	public void testCase(String username, String password) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		driver.quit();
		
	}		
}

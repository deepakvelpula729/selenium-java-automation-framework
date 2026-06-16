package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLernGetStringMethod {
	public static void main(String[] args) {
		// Launch browser
		ChromeDriver driver = new ChromeDriver();
		
		//open instagram
		driver.get("https://www.instagram.com/");
		
		// open facebook
		driver.get("https://www.facebook.com/");
	}

}

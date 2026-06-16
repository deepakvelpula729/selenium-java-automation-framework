package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutCloseMethod {
	public static void main(String[] args) throws InterruptedException {
		//launch chrome
		ChromeDriver driver = new ChromeDriver();
		
		//open facebook
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000); // 3seconds //pause execution
		
		// close chrome by using close method
		driver.close();
		
	}

}

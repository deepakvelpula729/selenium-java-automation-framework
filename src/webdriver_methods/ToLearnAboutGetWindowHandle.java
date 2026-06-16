package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutGetWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		// open chrome
		ChromeDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		// to open facebook
		driver.get("https://www.facebook.com/");
		
		// to get window handle
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}

package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutQuitMethod {
	public static void main(String[] args) throws InterruptedException {
		
		// launch chrome
		ChromeDriver driver = new ChromeDriver();
		
		// open facebook
		driver.get("https://www.facebook.com/");
		
		// get title of facebook
		String togettitle = driver.getTitle();
		System.out.println(togettitle);
		
		// to get the source code
		String togetthesourcecode = driver.getPageSource();
		System.out.println(togetthesourcecode);
		
		Thread.sleep(3000);
		
		//to quit
		driver.quit();
		//driver.close();
   }
	    }

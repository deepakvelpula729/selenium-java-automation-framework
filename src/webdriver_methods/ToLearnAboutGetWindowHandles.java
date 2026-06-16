package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutGetWindowHandles {

	public static void main(String[] args) {
 
		//open chrome
		ChromeDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		// open food sites ****
		driver.get("file:///c:/user/GANGA/Desktop/selinium_kiran/multiplewindow%20(1).html");/////////
	}

}

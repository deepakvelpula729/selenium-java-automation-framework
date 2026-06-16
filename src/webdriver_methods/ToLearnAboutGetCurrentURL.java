package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutGetCurrentURL {

	public static void main(String[] args) {
		// launch chrome
		ChromeDriver driver = new ChromeDriver();
		
		// open zomato
		driver.get("https://www.zomato.com/");
		
		// current url of the webpage
		String urlOfTheWebpage = driver.getCurrentUrl();
		System.out.println(urlOfTheWebpage);
		}

}

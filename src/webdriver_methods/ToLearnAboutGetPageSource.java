package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutGetPageSource {

	public static void main(String[] args) {
		// launch chrome
		ChromeDriver driver = new ChromeDriver();
		
		//open zomato
		driver.get("https://www.zomato.com/");
		
		// capture the source code of the webpage
		String sourcecodeofthewebpage = driver.getPageSource();
		System.out.println(sourcecodeofthewebpage);
  

	}

}

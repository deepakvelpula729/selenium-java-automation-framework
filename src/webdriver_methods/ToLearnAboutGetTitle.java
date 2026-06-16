package webdriver_methods;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutGetTitle {
	public static void main(String[] args) {
		// Launch Browser
		ChromeDriver driver = new ChromeDriver();
		
		// to open facebook
		driver.get("https://www.facebook.com/");
		
		// to capture title
		String titleOfwebpage = driver.getTitle();
		System.out.println(titleOfwebpage);
		
	}
	

}

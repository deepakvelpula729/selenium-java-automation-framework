package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_fav_song {

	public static void main(String[] args) throws InterruptedException {

		// open chrome
		ChromeDriver driver = new ChromeDriver();

		// maximize
		driver.manage().window().maximize();

		// open youtube
		driver.get("https://www.youtube.com/");

		Thread.sleep(3000);

		// click on search bar
		driver.findElement(By.name("search_query")).sendKeys("Chikiri Chikiri Video Song telugu");

		Thread.sleep(3000);

		// to click on search icon
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();

		Thread.sleep(3000);

		// to click on video
		driver.findElement(By.xpath(
				"//yt-formatted-string[@aria-label='Chikiri Chikiri Video Song | Peddi | Ram Charan | Janhvi | Buchi Babu Sana | AR Rahman|Mohit Chauhan 4 minutes, 33 seconds']"))
				.click();

		Thread.sleep(30000);

		System.out.println("finesh");
		driver.quit();

	}

}

package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drage_and_drop_action {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		// to handel frame
		WebElement iframe = driver.findElement(By.xpath("//iframe[@src='../../demoSite/practice/droppable/photo-manager.html']"));
		driver.switchTo().frame(iframe);
		
		// identify all images
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		
		// identify trashbox
		WebElement trashbox = driver.findElement(By.id("trash"));
		
		// to use actions class
		Actions action = new Actions(driver);
		
		// drag and drop action
		action.dragAndDrop(image1, trashbox).perform();
		Thread.sleep(2000);
		//action.dragAndDrop(image2, trashbox).perform();
		action.dragAndDropBy(image2, 400, 0);
		Thread.sleep(2000);
		//action.dragAndDrop(image3, trashbox).perform();
		action.clickAndHold(image3).moveToElement(trashbox).release().perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, trashbox).perform();
		Thread.sleep(5000);
		
		// identify galary 
		WebElement gallery = driver.findElement(By.id("gallery"));
		
		// to use action class
		action.dragAndDrop(image1, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image2, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image3, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, gallery).perform();
	}
}

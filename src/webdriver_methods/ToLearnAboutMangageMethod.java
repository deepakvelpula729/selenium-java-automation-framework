package webdriver_methods;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAboutMangageMethod {
	public static void main(String[] args) throws InterruptedException {
		// launch
		ChromeDriver driver = new ChromeDriver();
		
		// to maximize
		driver.manage().window().maximize();
		
		//open flipkart
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);

		// to minimize
		//driver.manage().window().minimize();
		
		// to do fullscreen
		//driver.manage().window().fullscreen();
		
		//to capture the size of window
//		Dimension sizeofwindow = driver.manage().window().getSize();
//		System.out.println(sizeofwindow);
//		System.out.println(sizeofwindow.getWidth());
//		System.out.println(sizeofwindow.getHeight());
		
		//to set size of the window
		
//		Dimension d = new Dimension(100, 100);
//		driver.manage().window().setSize(d);
		   // or
		driver.manage().window().setSize(new Dimension(100, 100));
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}

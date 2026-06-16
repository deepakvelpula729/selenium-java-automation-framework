package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenKFCandCaptureTitle {
	public static void main(String[] args) {
		// launch browser
		ChromeDriver driver = new ChromeDriver();
		// to open kfc
		driver.get("https://online.kfc.co.in/");
		// to capture title
		String tocapturetitle = driver.getTitle();
		System.out.println(tocapturetitle);
	}

}

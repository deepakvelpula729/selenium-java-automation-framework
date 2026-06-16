package validation;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FB_001_ {

	public static void main(String[] args) {

		String expectedusername = "deepak@gmail.com";
		String expectedpassword = "deepak@123";
		String expectedLoginPageTitle ="Facebook – log in or sign up";
		
		// step 1 :- Open Browser
		WebDriver driver = new ChromeDriver(); 
		System.out.println("Browser got opened");
		driver.manage().window().maximize();
		System.out.println("Browser got maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// step 2:- Enter URL
		driver.get("https://www.facebook.com/");
		@Nullable
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Sucessfully Navigated to Facebook Login Page");
		}else {
			System.out.println("Failed to Navigate to Facebook Login Page");
		}
		
		// step 3:- enter username
		WebElement usernameTextField = driver.findElement(By.id("email"));
		usernameTextField.clear();
		usernameTextField.sendKeys(expectedusername);
		@Nullable
		String actualUsername = usernameTextField.getAttribute("value");
		
		if(actualUsername.equals(expectedusername)) {
			System.out.println("usernameTextField sucessfully accepted the data");
		}else {
			System.out.println("usernameTextField Failed to accept the data ");
		}
		
		// step 4:- enter password
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.clear();
		passwordTextField.sendKeys(expectedpassword);
		@Nullable
		String actualPassword = passwordTextField.getAttribute("value");
		if(actualPassword.equals(expectedpassword)) {
			System.out.println("passwordTextField Sucessfully accepted the data ");
		}else {
			System.out.println("passwordTextField Failed to accept the data");
		}
		
		// step 5:- click on login button
		 WebElement loginButton = driver.findElement(By.name("login"));
		 loginButton.click();
		 
		 System.out.println("home page of the appliction sucessfully displayed");
		 
		 // step 6 :- close the Browser
		 System.out.println("Browser sucessfully closed");
		 driver.quit();	
	} 

}

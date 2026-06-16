package project_for_own;

import java.time.Duration;

import javax.management.NotificationBroadcasterSupport;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class basic_class {
	
	public WebDriver driver;

	@BeforeClass
	public void toLaunch() {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--incognito");
		
		driver = new ChromeDriver(options);
		Reporter.log("Browser got Launched", true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@BeforeMethod
	public void toLogin() {
		driver.get("https://www.saucedemo.com/");
		@Nullable
		String homepagetitle = driver.getTitle();
		Reporter.log(homepagetitle, true);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Reporter.log("login successfuly" , true);
	}
	
	@AfterMethod
	public void toLogout() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		Reporter.log("logout successfully" , true);
	}
	@AfterClass
	public void toClose() {
		Reporter.log("browser got closed" , true);
		driver.quit();
	}

}

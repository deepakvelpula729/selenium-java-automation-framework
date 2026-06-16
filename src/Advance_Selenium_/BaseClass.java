package Advance_Selenium_;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	String expectedHomePageTitle = "Demo Web Shop";
	
	@Parameters("browser")
	@BeforeClass
	public void toLaunch(@Optional("chrome") String bname) {
		
		if(bname.equals("chrome")) {
		driver = new ChromeDriver();
		}else if(bname.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if (bname.equals("edge")) {
			driver= new EdgeDriver();
		}
		
		Reporter.log("Browser got Launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got Maximized", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@BeforeMethod
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		@Nullable
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equals(expectedHomePageTitle)) {
			Reporter.log("Navigated Successfully to Demowebshop", true);
		}else {
			Reporter.log("Failed to navigate to Demowebshop", true);
		}
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("seleniumA5@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("selenium@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Reporter.log("Logged in successfuly to Demowebshop", true);
	}
	
	@AfterMethod
	public void toLogout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Logged out successfully from Demowebshop", true);
	}
	
	@AfterClass
	public void toClose() {
		Reporter.log("Browser got Closed", true);
		driver.quit();
	}	
}

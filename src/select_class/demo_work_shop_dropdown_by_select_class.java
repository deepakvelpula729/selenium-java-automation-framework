package select_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo_work_shop_dropdown_by_select_class {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://demowebshop.tricentis.com/");
	
	// to click on books
	driver.findElement(By.partialLinkText("Books")).click();
	
	// to click on dropdown
	 WebElement drop = driver.findElement(By.id("products-orderby"));
	 
	 // create object of select class
	 Select dropdown = new Select(drop);
	 dropdown.selectByContainsVisibleText("Price: High to Low"); //to select price high to low by using visible text
	          //or
	 //dropdown.selectByIndex(3);// to select price high to low by using index value
	          // or
	// dropdown.selectByValue("https://demowebshop.tricentis.com/books?orderby=11"); //to select price high to low by using value
}
}

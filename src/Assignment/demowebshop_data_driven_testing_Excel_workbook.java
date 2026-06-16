package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop_data_driven_testing_Excel_workbook {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//step 1:- Create an Object of FileInputStream
		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");
				
		// step 2:- Create an object of Respctive file type
		Workbook wb = WorkbookFactory.create(fis);
		
		// step 3:- call methods
		String url = wb.getSheet("Sheet2").getRow(0).getCell(0).toString();
		String firstname = wb.getSheet("Sheet2").getRow(1).getCell(0).toString();
		String lastname = wb.getSheet("Sheet2").getRow(2).getCell(0).toString();
		String email = wb.getSheet("Sheet2").getRow(3).getCell(0).toString();
		String password = wb.getSheet("Sheet2").getRow(4).getCell(0).toString();
		String confirmpassword = wb.getSheet("Sheet2").getRow(5).getCell(0).toString();
		 
		
		// script starting
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get(url);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
		
				
	}

}

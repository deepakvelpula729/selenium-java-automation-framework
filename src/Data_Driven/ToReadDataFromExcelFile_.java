package Data_Driven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromExcelFile_ {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		//step 1:- Create an Object of FileInputStream
		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");
		
		// step 2:- Create an object of Respective file type
		Workbook wb = WorkbookFactory.create(fis);
		
		// step 3:- Call methods
		 String a = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();  // variable a as  URL
		 String b = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();  // variable b as UN
		String c = wb.getSheet("Sheet1").getRow(2).getCell(0).toString();  // variable c as PWD
		
		// test script
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get(a); //  url
		
		driver.findElement(By.id("email")).sendKeys(b);  //username
		driver.findElement(By.id("pass")).sendKeys(c);   //password
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}

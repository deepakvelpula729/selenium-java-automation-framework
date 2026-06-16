package project_for_own;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class p_tc_001 extends basic_class{
	@Test
	public void toclickonitem1() {
		
		driver.findElement(By.id("item_4_title_link")).click();
		driver.findElement(By.id("add-to-cart")).click();
		driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']")).click();
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		
	}

}

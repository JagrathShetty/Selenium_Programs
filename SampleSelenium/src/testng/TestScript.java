package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass{

	@Test
	public void click() {
		driver.findElement(By.partialLinkText("BOOKS")).click();
		Reporter.log("User clicked on books and books page is displayed",true);
	}
}

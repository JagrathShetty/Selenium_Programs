package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG {// TestNG class

	@Test(priority = -2,invocationCount=4, threadPoolSize = 4)
	public void login() {//test case
		//test steps
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Login testcase executed",true);
		
	}
	
	@Test(priority = -1,enabled=false)
	public void register() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("Register testcase executed",true);
		
	}
}

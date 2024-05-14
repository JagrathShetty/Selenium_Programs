package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnDependsOnMethods {
	@Test(dependsOnMethods="register")
	public void login() {//test case
		//test steps
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Login testcase executed",true);
		
	}
	
	@Test
	public void register() {
		WebDriver driver=new ChromeDriver();
		Assert.fail();
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("Register testcase executed",true);
		
	}

}

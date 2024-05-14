package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ford {

	@Test(groups="system")

	public void launchFord()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.india.ford.com/");
		Reporter.log("Ford Launched Successfully",true);
		
	}
}

package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearnHardAssert {

	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Login", "Login page is not dispalyed");
		
		driver.findElement(By.id("Email")).sendKeys("jagrathshetty123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("jaggu@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Demo Web Shop","Home page is not displayed");
		Reporter.log("Home page is displayed",true);
		
		
		
		
	}
	
	
}

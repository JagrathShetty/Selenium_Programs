package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		//wp.getRegistration().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys("jagrathshetty123@gmail.com");
		lp.getPassword().sendKeys("jaggu@1234");
		lp.getLoginButton().click();
		
		

	}

}

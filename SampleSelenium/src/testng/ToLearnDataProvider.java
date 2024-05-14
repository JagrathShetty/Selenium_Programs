package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {

	@DataProvider
	public String[][] dataSender(){
		String[][] data= {
				{"admin","admin"},
				{"user","user"},
				{"jagrath","jaggu@1234"}
				
		};
		
		return data;
		
	}
	
	@Test(dataProvider ="dataSender")
	public void login(String[] cred) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.name("email")).sendKeys(cred[0]);
		driver.findElement(By.id("password")).sendKeys(cred[1]);
		driver.findElement(By.name("login")).click();
		
	}
}

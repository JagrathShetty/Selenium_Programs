package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillaryTestScript {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		SkillaryWelcomePage wp=new SkillaryWelcomePage(driver);
		wp.getskillaryloginLink().click();
		
		FileInputStream fis=new FileInputStream("./Testdata/SkillarydemoData.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		String a = prop.getProperty("email");
		String b = prop.getProperty("pwd");
		
		LoginSkillary lp=new LoginSkillary(driver);
		lp.getEmail().sendKeys(a);
		lp.getPassword().sendKeys(b);	
		lp.getLoginButton().click();
	}

}

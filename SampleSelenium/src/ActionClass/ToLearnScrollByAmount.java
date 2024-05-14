package ActionClass;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScrollByAmount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://demowebshop.tricentis.com/");
		//WebElement searchLink = driver.findElement(By.linkText("News"));
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 300).perform();
		act.scrollByAmount(0, 300).perform();
		Thread.sleep(2000);
		act.scrollByAmount(0, -100).perform();
		
	}

}

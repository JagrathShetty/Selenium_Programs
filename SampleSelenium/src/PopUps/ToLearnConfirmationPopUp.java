package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		Alert confPopup=driver.switchTo().alert();
		System.out.println(confPopup.getText());
		confPopup.accept();
		Thread.sleep(2000);
		confPopup.accept();
		
	}

}

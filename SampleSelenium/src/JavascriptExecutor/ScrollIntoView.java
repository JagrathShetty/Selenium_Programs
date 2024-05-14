package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.naukri.com/registration/createAccount");
		//WebElement whatsapp = driver.findElement(By.xpath("//span[text()='WhatsApp']"));
		WebElement emailid = driver.findElement(By.id("email"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeAsyncScript("arguments[0].scrollIntoView(true)", whatsapp);
		js.executeScript("arguments[0].scrollIntoView(true)", emailid);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("history.go()");
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		

	}

}

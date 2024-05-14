package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenInstagramXpathByContains {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[contains(@aria-label,'email')]")).sendKeys("Jagrath@gmail.com");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("Jagrath");
		driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}

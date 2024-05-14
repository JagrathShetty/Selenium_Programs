package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/products_page/5");
		Thread.sleep(15000);
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowIDs =driver.getWindowHandles();
		System.out.println(allWindowIDs);
		for(String id:allWindowIDs) {
			System.out.println(id);
		}
		driver.quit();
	}

}

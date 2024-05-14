package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnChildWindowPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.shoppersstack.com/products_page/7");
		String parentid = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentid);
		
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.contains("ebay")) {
				driver.close();
			}
			else if(url.contains("amazon")) {
				driver.manage().window().maximize();
			}
			
		}
	}

}

package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenStackerstackEx {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://shoppersstack.com/products_page/11");
		  Thread.sleep(30000);
		  String parentid=driver.getWindowHandle();
		  driver.findElement(By.id("compare")).click();
		  
		  Set<String> allWindowsIds= driver.getWindowHandles();
		  allWindowsIds.remove(parentid);
		  for(String wid:allWindowsIds) {
			  driver.switchTo().window(wid);
			  driver.close();
		
		  }
	}

}

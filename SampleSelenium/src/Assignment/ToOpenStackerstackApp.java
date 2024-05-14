package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenStackerstackApp {

	public static void main(String[] args) throws InterruptedException {
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://shoppersstack.com/products_page/5");
	  Thread.sleep(30000);
	  driver.findElement(By.id("compare")).click();
	  
	  Set<String> allWindowsIds= driver.getWindowHandles();
	  for(String wid:allWindowsIds) {
		  driver.switchTo().window(wid);
		  String url=driver.getCurrentUrl();
		  if(url.contains("flipkart")||url.contains("amazon")) {
			  Thread.sleep(30000);
			  driver.close();
		  }
		 
		  //System.out.println(url);
		  //driver.close();
	  }
	  
	  

	}

}

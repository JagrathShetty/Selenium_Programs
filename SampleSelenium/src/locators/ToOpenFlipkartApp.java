package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenFlipkartApp {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		List<WebElement> allLinks=driver.findElements(By.tagName("img"));
		System.out.println(allLinks.size());
		driver.quit();



	}

}

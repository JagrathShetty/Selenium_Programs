package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentURL {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}

}

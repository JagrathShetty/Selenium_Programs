package QSP;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class DemoChrome {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.get("https://www.flipkart.com/");
		
	}
}

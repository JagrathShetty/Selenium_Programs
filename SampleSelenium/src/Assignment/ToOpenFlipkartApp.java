package Assignment;

import org.openqa.selenium.edge.EdgeDriver;

public class ToOpenFlipkartApp {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

	}

}

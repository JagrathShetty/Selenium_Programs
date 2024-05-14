package Assignment;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToOpenNaukariApp {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

	}

}

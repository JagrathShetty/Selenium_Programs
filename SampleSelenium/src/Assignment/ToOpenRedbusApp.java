package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenRedbusApp {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.com/");
		//driver.manage().window().fullscreen();
		//Thread.sleep(3000);
		Dimension size=driver.manage().window().getSize(); 
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		driver.manage().window().setSize(new Dimension(300,500));
		//Thread.sleep(3000);
		//driver.quit();
		

	}

}

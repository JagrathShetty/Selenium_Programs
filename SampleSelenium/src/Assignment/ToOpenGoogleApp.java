package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenGoogleApp {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		
		Point position=driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		Dimension size=driver.manage().window().getSize(); 
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		
		
		driver.manage().window().setSize(new Dimension(900,900));
		driver.quit();

	}

}

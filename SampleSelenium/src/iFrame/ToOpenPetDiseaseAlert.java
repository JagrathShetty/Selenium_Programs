package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenPetDiseaseAlert {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://petdiseasealerts.org/alerts-map/#/");
		driver.findElement(By.id("north-datoka")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("button compact yellow")).click();
		
		
		//driver.switchTo().parentFrame();
		//driver.findElement(By.id("hamburger")).click();
		

	}

}

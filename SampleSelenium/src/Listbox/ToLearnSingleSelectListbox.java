package Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelectListbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.facebook.com/signup");
		WebElement daydropdown = driver.findElement(By.id("day"));
		Select dayselect=new Select(daydropdown);
		dayselect.selectByIndex(14);
		
		WebElement monthdropdown = driver.findElement(By.id("month"));
		Select monthselect=new Select(monthdropdown);
		monthselect.selectByValue("11");
		
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select yearselect=new Select(yeardropdown);
		yearselect.selectByVisibleText("2000");
		System.out.println( yearselect.isMultiple());
		
		
	}

}

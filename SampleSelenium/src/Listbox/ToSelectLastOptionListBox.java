package Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectLastOptionListBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select yearselect=new Select(yeardropdown);
		int year=yearselect.getOptions().size();
		yearselect.selectByIndex(year-1);
		

	}

}

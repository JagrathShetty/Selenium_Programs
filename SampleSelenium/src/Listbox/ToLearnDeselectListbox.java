package Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnDeselectListbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement prices = driver.findElement(By.id("cars"));
		Select priceSelect=new Select(prices);
		priceSelect.selectByIndex(0);
		priceSelect.selectByValue("99");
		priceSelect.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		
		//priceSelect.deselectByIndex(0);
		//priceSelect.deselectByValue("99");
		//priceSelect.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
		priceSelect.deselectAll();

	}

}

package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QspiderMens {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	     
	     driver.get("https://demoapps.qspiders.com/ui/mouseHover/tab?sublist=3");
	     WebElement mensTab = driver.findElement(By.xpath("//li[@class='Men p-4 relative']"));
	     Actions act=new Actions(driver);
	     act.moveToElement(mensTab).perform();
	     WebElement menDd = driver.findElement(By.xpath("//li[@class='Men_1']"));
	     act.moveToElement(menDd);
	     WebElement menTshirtDd = driver.findElement(By.xpath("//li[@class='Men_2']"));
	     act.moveToElement(menTshirtDd).perform();
	     WebElement discount70 = driver.findElement(By.xpath("//section[@class='Men_List_2']/.//li[text()='70% or more']"));
	     act.moveToElement(discount70).perform();
	     act.click(discount70).perform();

	}

}

package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenYatraAPP {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.yatra.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
		

	}

}

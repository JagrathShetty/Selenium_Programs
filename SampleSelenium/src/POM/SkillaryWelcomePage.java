package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryWelcomePage {
	
	//initialization
		public SkillaryWelcomePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		

	//declare
	@FindBy(linkText = "LOGIN")
	private WebElement skillaryloginLink;

	public WebElement getskillaryloginLink() {
		return skillaryloginLink;
	}
	
	
	
	
}

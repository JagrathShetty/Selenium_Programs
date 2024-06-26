package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSkillary {

	public LoginSkillary(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "last")
	private WebElement loginButton;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
}

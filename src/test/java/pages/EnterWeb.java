package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterWeb {

	public EnterWeb(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ctl00_MainContent_username")
	public WebElement userName;
	
	@FindBy(id = "ctl00_MainContent_password")
	public WebElement password;
	
	@FindBy(id = "ctl00_MainContent_login_button")
	public WebElement button;

	public void log(String un, String psw) {
		userName.sendKeys(un);
		password.sendKeys(psw);
		button.click();
	}
	
	
}

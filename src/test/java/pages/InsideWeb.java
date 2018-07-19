package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsideWeb {
	
	public InsideWeb(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h1[.='Web Orders']")
	public WebElement WebOrder;
	
	@FindBy(xpath="//div[@class='login_info']")
	public WebElement WelcomeTester;
	
	@FindBy(xpath="//ul[@id='ctl00_menu']/li[1]/a")
	public WebElement ViewAllOrders;
	
	@FindBy(xpath="//ul[@id='ctl00_menu']/li[2]/a")
	public WebElement ViewAllProducts;
	
	@FindBy(xpath="//ul[@id='ctl00_menu']/li[3]/a")
	public WebElement Order;
	
	
	
	
	
}

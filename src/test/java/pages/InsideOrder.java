package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsideOrder {

	public InsideOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
	public WebElement oQuantity;

	@FindBy(id = "ctl00_MainContent_fmwOrder_txtUnitPrice")
	public WebElement oPricePerUnit;

	@FindBy(id = "ctl00_MainContent_fmwOrder_txtDiscount")
	public WebElement oDiscount;

	@FindBy(id = "ctl00_MainContent_fmwOrder_txtTotal")
	public WebElement oTotal;

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement oCalc;

	@FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
	public WebElement oCustomerName;

	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
	public WebElement oStreet;

	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
	public WebElement oCity;

	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
	public WebElement oState;

	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
	public WebElement oZip;

	@FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_cardList_0']")
	public WebElement oCard;

	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
	public WebElement oCardNr;

	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
	public WebElement oDate;

	@FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
	public WebElement oProcessBtn;

	@FindBy(xpath="//strong")
	public WebElement orderPlaced;
	
}

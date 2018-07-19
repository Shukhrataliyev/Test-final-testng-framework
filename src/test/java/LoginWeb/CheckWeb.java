package LoginWeb;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EnterWeb;
import pages.InsideOrder;
import pages.InsideWeb;

public class CheckWeb {
	WebDriver driver;
	InsideWeb insideWeb;
	EnterWeb enterWeb;
	InsideOrder insideOrder;
	
	@BeforeClass
	public void setUp() {
		System.out.println("Setting up WebDriver in BeforeClass...");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().window();
	}

	@BeforeMethod
	public void setUpApplication() {
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		insideWeb = new InsideWeb(driver);
		enterWeb = new EnterWeb(driver);
		insideOrder = new InsideOrder(driver);
	}
	
	@Ignore
	@Test
	public void testInsideWeb() {
		enterWeb.log("Tester", "test");
		
		assertTrue(insideWeb.WebOrder.isDisplayed());
		assertTrue(insideWeb.WelcomeTester.isDisplayed());
		assertTrue(insideWeb.ViewAllOrders.isDisplayed());
		assertTrue(insideWeb.Order.isDisplayed());
		
	}
	
	@Test
	public void getOrder() {
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		enterWeb.log("Tester", "test");
		insideWeb.Order.click();
		
		insideOrder.oQuantity.sendKeys("4");
		insideOrder.oPricePerUnit.sendKeys("50");
		insideOrder.oDiscount.sendKeys("0");
		insideOrder.oCalc.click();

		insideOrder.oCustomerName.sendKeys("Malcom X");
		insideOrder.oStreet.sendKeys("8100 Anderson Mill");
		insideOrder.oCity.sendKeys("Austin");
		insideOrder.oState.sendKeys("Tx");
		insideOrder.oZip.sendKeys("78729");
			
		insideOrder.oCard.click();
		insideOrder.oCardNr.sendKeys("1234567897893214");
		insideOrder.oDate.sendKeys("02/18");
		insideOrder.oProcessBtn.click();
		
		assertEquals(insideOrder.orderPlaced.getText(),"New order has been successfully added.");
				
		
	}
}

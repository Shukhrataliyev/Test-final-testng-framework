package LoginWeb;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EnterWeb;

public class LoginToWeb {
	
	WebDriver driver;
	EnterWeb enterWeb;
	
	
	@BeforeClass
	public void setUp() {
		System.out.println("Setting up WebDriver in BeforeClass...");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().window();
	}
	
	@Test
	public void positiveLogin() {
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		enterWeb = new EnterWeb(driver);
		assertEquals(driver.getTitle(), "Web Orders Login");
		
//		enterWeb.userName.sendKeys("Tester");
//		enterWeb.password.sendKeys("test");
//		enterWeb.button.click();
		
		enterWeb.log("Tester", "test");
		
	
	}
	
	
	
	
	

}

package qa.opencart.base;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import qa.opencart.DriverFactory.Driverfactory;
import qa.opencart.pages.Accountspage;
import qa.opencart.pages.Loginpage;

public class BaseTest {
	public Driverfactory df;
	public WebDriver driver;
	public Loginpage loginpage;
	public Properties prop;
	public Accountspage acc;
	
	@BeforeTest
	public void setup() throws IOException
	{
		df= new Driverfactory();	
		driver = df.init_driver(prop);
		prop=df.init_prop();
		loginpage = new Loginpage(driver);
		acc = new Accountspage(driver);
	}
	
	@AfterTest
	public void quitbrowser()
	{
		driver.quit();
	}
}

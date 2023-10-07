package qa.opencart.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import qa.opencart.base.BaseTest;
import qa.opencart.constants.Constants;
import qa.opencart.pages.Loginpage;

public class LoginPageTest extends BaseTest{
	
	
	public WebDriver driver;
	public Properties prop;

	@Test(priority=1)
	public void LoginPagetitletest()
	{
		String acttile = loginpage.getloginpageTitle();
		System.out.println("page title is " +acttile);
		Assert.assertEquals(acttile, Constants.Login_Page_title);
		
		
	}

	@Test(priority=2)
	public void urltest()
	{
		String urlTest = loginpage.getpageurl();
		System.out.println("page title is " +urlTest);	
		Assert.assertEquals(urlTest, Constants.Current_url);
	}
	
	@Test(priority=3)
	public void passwordpageurl()
	{
		Boolean urlTest = loginpage.isforgetPwdlink();
		System.out.println("page title is " +urlTest);
		Assert.assertTrue(urlTest, Constants.password_present);
	}
	
	
	
	@Test
	public void logintest()
	{
		loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void loginurltest()
	{
		Assert.assertEquals(loginpage.isloginpageexist(),true );
	}
	
	
	
	
	
	
}

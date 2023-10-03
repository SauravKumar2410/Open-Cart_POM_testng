package qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import qa.opencart.Utlitles.ElementUtil;
import qa.opencart.constants.Constants;

public class Loginpage {

	private WebDriver driver;

	private ElementUtil eleutil;
	// page class is always a classic example of encapuslation
	private By emailid = By.id("input-email");
	private By password = By.id("input-password");
	private By login = By.xpath("//input[@type='submit']");

	private By registerlink = By.xpath("//*[text()='Register']/parent::div");
	private By loginlink = By.xpath("//*[text()='Login']/parent::div");

	// page constructor
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
	}

	// page actions
	public String getloginpageTitle() {
		eleutil.waitforUrlcontains(Constants.Login_Page_title, Constants.timeout);
		return driver.getTitle();
	}

	public String getpageurl() {
		return driver.getCurrentUrl();
	}

	public Accountspage doLogin(String username, String pass) {
		System.out.println("login cred are " + username + " " + pass);
		eleutil.dosendkeys(emailid, username);

		eleutil.dosendkeys(password, pass);

		eleutil.doclick(login);
		return new Accountspage(driver);
	}

	public boolean isforgetPwdlink() {
		return eleutil.doisdisplay(password);

	}

	public boolean isloginpageexist() {
		return eleutil.doisdisplay(loginlink);

	}

}

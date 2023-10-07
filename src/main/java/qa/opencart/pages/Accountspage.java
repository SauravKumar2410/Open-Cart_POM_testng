package qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import qa.opencart.Utlitles.ElementUtil;
import qa.opencart.constants.Constants;

public class Accountspage {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	private By header = By.id("logo");
	private By logoutlink = By.xpath("//*[text()='Logout']/parent::div");
	private By sectionheaders = By.cssSelector("div#content h2");
	private By name = By.name("search");
	
	public Accountspage(WebDriver driver)
	{
		this.driver= driver;
		eleutil = new ElementUtil(this.driver);
	}
	
	public String getAccountspagetitle()
	{
		return eleutil.waitfortitlecontains(Constants.ACCOUNTS_PAGE_TITLE, Constants.Default_Timeout);
	}
	
	public String Accountsheader()
	{
		return eleutil.dogetext(header);
	}
	
	public List<String> getAccountspagesectionlist()
	{
		List<WebElement> sectionlist = eleutil.getElements(sectionheaders);
		List<String> text =new ArrayList<String>();
		for(WebElement sectiontext :sectionlist)
		{
			String texte = sectiontext.getText();
			text.add(texte);
		}
		return text;
	}
	
	
	public Boolean islogoutExist()
	{
		return eleutil.doisdisplay(logoutlink);
	}

	public void getsearch() {
	
		eleutil.dosendkeys(name, Constants.Macbook);
		
	}
	

}

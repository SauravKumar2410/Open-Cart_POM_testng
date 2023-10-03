package qa.opencart.Utlitles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.opencart.constants.Constants;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public By getBy(String locatortype, String locatorValue) {
		By locator = null;
		switch (locatortype.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;
		case "classname":
			locator = By.className(locatorValue);
			break;
		case "cssselector":
			locator = By.cssSelector(locatorValue);
			break;
		}

		return locator;
	}

	public String waitforUrlcontains(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.titleIs(title))) {
			return driver.getTitle();
		}
		return null;
	}

	public Boolean doisdisplay(By locator) {
		return getElement(locator).isDisplayed();

	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
	public void dosendkeys(By locator,String value) {
	 getElement(locator).sendKeys(value);
	}

	public void doclick(By locator) {
		getElement(locator).click();	
	}

	public String waitfortitlecontains(String accountsPageTitle, int defaultTimeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(defaultTimeout));
		if(wait.until(ExpectedConditions.titleContains(accountsPageTitle)))
		{
			return driver.getTitle();
		}
		
		return null;
	}

	public String dogetext(By locator) {
		
		return getElement(locator).getText();
	}

	public List<WebElement> getElements(By locator) {
		
		return driver.findElements(locator);
	}
	
	
	
	
	
}
package qa.opencart.DriverFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driverfactory {
	 WebDriver driver;
	 Properties prop;
	/*
	 * this method is used to initalise on the basis of browsername
	 * 
	 * @param browser
	 * 
	 * @return it return browser
	 */

	public WebDriver init_driver(Properties prop) {
		
		//String browsername = prop.getProperty("browser").trim();
		String browsername ="chrome";
		//System.out.println("your browser name is " + browsername);
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

		} else {
			System.out.println("please pass the right browser ");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		return driver;
	}
	/*
	 *this method is used to initialse properties 
	*/
	
	public Properties init_prop() throws IOException {
		FileInputStream ip = new FileInputStream("./src/test/resources/config/qa.Config.properties");
		try {
			Properties prop = new Properties();
			prop.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return prop;
	}

}

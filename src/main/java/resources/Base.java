package resources;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import interfaceImplementation.ActionMethodsImplementation;
import interfaceImplementation.DriverMethodsImplementation;
import interfaceImplementation.WebElementMethodsImplementation;
import interfaces.ActionMethods;
import interfaces.DriverMethods;
import interfaces.WebElementMethods;
import webPages.HomePage;

public class Base {
	private static WebDriver driver;
	public HomePage homepageobj;
	public WebElementMethods webelementobj;
	public DriverMethods driverobj;
	public ActionMethods actionobj;

	public void initializeDriver() {

		try {
			Properties prop = new Properties();
			FileInputStream file = new FileInputStream(
					"C:\\Users\\Ankita\\git\\MyStore\\MyStore\\src\\main\\java\\resources\\Data.properties");
			prop.load(file);
			String browsername = prop.getProperty("browser");
			if (browsername.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browsername.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browsername.equals("IE")) {

			} else {
				throw new Exception("Invalid browser name" + browsername);
			}
			String url = prop.getProperty("url");
			url = url.trim();
			if (url.isEmpty()) {
				url = "about:Blank";
			}
			driver.get(url);
			homepageobj = new HomePage(driver);
			webelementobj = new WebElementMethodsImplementation();
			driverobj = new DriverMethodsImplementation(driver);
			actionobj = new ActionMethodsImplementation(driver);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

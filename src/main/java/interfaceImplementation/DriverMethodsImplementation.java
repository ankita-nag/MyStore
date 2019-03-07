package interfaceImplementation;

import org.openqa.selenium.WebDriver;

import interfaces.DriverMethods;

public class DriverMethodsImplementation implements DriverMethods {
private WebDriver driver;
public DriverMethodsImplementation(WebDriver driver)
{
	this.driver = driver;
}
	@Override
	public void closeWindow() {
		
		driver.close();
	}

	@Override
	public void closeAllWindow() {
		driver.quit();
		
	}

	@Override
	public void navigateTo(String url) {
		driver.navigate().to(url);
		
	}

	@Override
	public void navigateBack() {
		driver.navigate().back();
		
	}

	@Override
	public void navigateForward() {
		driver.navigate().forward();
		
	}

	@Override
	public void refresh() {
		driver.navigate().refresh();
		
	}

	@Override
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
		
	}

	@Override
	public String getPageSource() {
		String pagesource = driver.getPageSource();
		return pagesource;
		
	}

	@Override
	public String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
		
	}

}

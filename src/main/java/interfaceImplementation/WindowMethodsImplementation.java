package interfaceImplementation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import interfaces.WindowMethods;

public class WindowMethodsImplementation implements WindowMethods {
private WebDriver driver;
public WindowMethodsImplementation(WebDriver driver)
{
	this.driver=driver;
}
	@Override
	public void switchToChildWindow() {
		
	Set<String> windowids = getWindowHandles();
		Iterator<String> it = windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
		}
		
	}

	@Override
	public void switchToParentWindow(WebElement element) {
		String parentwindow = getWindowHandle();
		driver.switchTo().window(parentwindow);
		
	}

	@Override
	public String getWindowHandle() {
		return driver.getWindowHandle();
	}

	@Override
	public Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}

	@Override
	public void switchToAnyWindow(String windowhandle) {
		driver.switchTo().window(windowhandle);
		
	}

	

}

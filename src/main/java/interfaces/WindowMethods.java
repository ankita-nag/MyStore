package interfaces;

import java.util.Set;

import org.openqa.selenium.WebElement;

public interface WindowMethods {
	public void switchToChildWindow();

	public void switchToParentWindow(WebElement element);

	public String getWindowHandle();

	public Set<String> getWindowHandles();

	public void switchToAnyWindow(String windowhandle);

	

}

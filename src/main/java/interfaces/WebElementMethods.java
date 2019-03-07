package interfaces;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface WebElementMethods {
	public int getCssValue(WebElement element, String propertyname);

	public void click(WebElement element);

	public String getText(WebElement element);

	public boolean isElementDisplayed(WebElement element);

	public boolean isElementEnabled(WebElement element);

	public boolean isElementSelected(WebElement element);
	
	public List<String> getList(List<WebElement> element);
}

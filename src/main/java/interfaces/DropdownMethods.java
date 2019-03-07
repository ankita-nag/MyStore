package interfaces;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface DropdownMethods {
public void selectByValue(WebElement element,String value);
public void selectByIndex(WebElement element,int index);
public void deselectByVisibleText(WebElement element, String text);
public void deselectByValue(WebElement element, String value);
public void deselectByIndex(WebElement element,int index);
public List<WebElement> getlist(WebElement element);
public void selectByVisibleText(WebElement element, String text);

}

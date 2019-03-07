package interfaces;

import org.openqa.selenium.WebElement;

public interface ActionMethods {
public void mouseHover(WebElement element);
public void doubleClick(WebElement element);
public void rightClick(WebElement element);
public void moveToElementAndClick(WebElement element);
public void dragAndDrop(WebElement element1, WebElement element2);
}

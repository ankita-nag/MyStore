package interfaces;

import org.openqa.selenium.WebElement;

public interface FrameMethods {
public void switchToFrameById(String id);
public void switchToFrameByElement(WebElement element);
public void switchToFrameByIndex(int index);
public void switchToDefault();
}

package interfaceImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import interfaces.FrameMethods;

public class FrameMethodsImplementation implements FrameMethods {
private WebDriver driver;
public FrameMethodsImplementation(WebDriver driver)
{
	this.driver = driver;
}
	@Override
	public void switchToFrameById(String id) {
		
		driver.switchTo().frame(id);
	}

	@Override
	public void switchToFrameByElement(WebElement element) {
		driver.switchTo().frame(element);
		
	}

	@Override
	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
		
	}
	@Override
	public void switchToDefault() {
		driver.switchTo().defaultContent();
		
	}

}

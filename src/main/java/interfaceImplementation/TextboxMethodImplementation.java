package interfaceImplementation;

import org.openqa.selenium.WebElement;

import interfaces.TextboxMethods;

public class TextboxMethodImplementation implements TextboxMethods {

	@Override
	public void clear(WebElement element) {
		
		element.clear();
	}

	@Override
	public void setvalue(WebElement element, String text) {
		
		element.sendKeys(text);
	}

}

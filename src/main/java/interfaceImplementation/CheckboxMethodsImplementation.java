package interfaceImplementation;

import org.openqa.selenium.WebElement;

import interfaces.CheckboxMethods;

public class CheckboxMethodsImplementation implements  CheckboxMethods {

	@Override
	public void changeCheckBoxStatus(WebElement element, boolean status) {
		if (((!element.isSelected() && status)) || (element.isSelected() && !status)) {
			element.click();
		}
		
	}

}

package interfaceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import interfaces.WebElementMethods;

public class WebElementMethodsImplementation implements WebElementMethods {

	@Override
	public int getCssValue(WebElement element, String propertyname) {
		element.getCssValue(propertyname);
		return 0;
	}

	@Override
	public void click(WebElement element) {
		element.click();
		
	}

	@Override
	public String getText(WebElement element) {
		return element.getText();
		
	}

	@Override
	public boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	@Override
	public boolean isElementEnabled(WebElement element) {
		return element.isEnabled();
	}

	@Override
	public boolean isElementSelected(WebElement element) {
		return element.isSelected();
	}

	@Override
	public List<String> getList(List<WebElement> element) {
		List<String> textList = new ArrayList<String>();
		for (WebElement elem:element){
			if(null!=elem.getText() && !"".equals(elem.getText().trim())){
				textList.add(elem.getText());
			}		
		}
		return textList;
	}

}

package interfaceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import interfaces.DropdownMethods;

public class DropdownMethodsImplementation implements DropdownMethods {

	@Override
	public void selectByVisibleText(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
		
	}

	@Override
	public void selectByValue(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
		
	}

	@Override
	public void selectByIndex(WebElement element,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
		
	}

	@Override
	public void deselectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);		
		
	}

	@Override
	public void deselectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);	
		
	}

	@Override
	public void deselectByIndex(WebElement element,int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
		
	}

	@Override
	public List<WebElement> getlist(WebElement element) {
		Select select = new Select(element);
		List<WebElement> dropdownvalues = new ArrayList<WebElement>();
		dropdownvalues = select.getOptions();
		return dropdownvalues;
	}



}

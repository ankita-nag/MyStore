package interfaceImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import interfaces.ActionMethods;

public class ActionMethodsImplementation implements ActionMethods {
private WebDriver driver;
	public ActionMethodsImplementation(WebDriver driver)
	{
		this.driver = driver;
	}

	@Override
	public void mouseHover(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		
	}

	@Override
	public void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
	}

	@Override
	public void rightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
		
	}

	@Override
	public void moveToElementAndClick(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		
	}

	@Override
	public void dragAndDrop(WebElement element1, WebElement element2) {
		Actions action = new Actions(driver);
		action.dragAndDrop(element1, element2).build().perform();
		
	}

}

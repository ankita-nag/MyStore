package interfaceImplementation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import interfaces.AlertMethods;

public class AlertMethodsImplementation implements AlertMethods {

	private WebDriver driver;
	public AlertMethodsImplementation(WebDriver driver)
	{
		this.driver = driver;
	}
	@Override
	public Alert switchToAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	@Override
	public void acceptAlert() {
		
		switchToAlert().accept();
	}

	@Override
	public void rejectAlert() {
		switchToAlert().dismiss();
		
	}

	@Override
	public String getMessageFromAlert() {
		String alerttext=switchToAlert().getText();
		return alerttext;
	}


}

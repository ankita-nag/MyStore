package interfaces;

import org.openqa.selenium.Alert;

public interface AlertMethods {
public Alert switchToAlert();
public void acceptAlert();

public void rejectAlert();

public String getMessageFromAlert();



}

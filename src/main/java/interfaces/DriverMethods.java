package interfaces;

public interface DriverMethods {
public void closeWindow();
public void closeAllWindow();
public void navigateTo(String url);
public void navigateBack();
public void navigateForward();
public void refresh();
public String getPageTitle();
public String getPageSource();
public String getCurrentUrl();
}

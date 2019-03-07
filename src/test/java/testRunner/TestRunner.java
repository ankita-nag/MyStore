package testRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

//import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "C:\\Users\\Ankita\\git\\MyStore\\MyStore\\src\\test\\java\\featureFiles" }, 
glue = {"stepDefination" }, 
strict = true,
monochrome = true,
plugin= {"html:C:\\Users\\Ankita\\git\\MyStore\\MyStore\\Reports\\HTML",
		"json:C:\\Users\\Ankita\\git\\MyStore\\MyStore\\Reports\\json\\cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\Ankita\\git\\MyStore\\MyStore\\Reports\\Extent Report\\report.html"}
)
public class TestRunner {
	@AfterClass
	public static void reportSetup()
	{
		Reporter.loadXMLConfig(new File("src/main/java/resources/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));

	
	}
}

package stepDefination;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resources.Base;

 
public class HomePageTest extends Base {
	
	@Given("^user navigates to new look website$")
	public void user_navigates_to_new_look_website() {
		super.initializeDriver();
	}

	@Then("^user should be able to view womens, mens, girls, home and gifts, inspiration menu$")
	public void user_should_be_able_to_view_womens_mens_girls_home_and_gifts_inspiration_menu() {
		boolean checkMenus;
		checkMenus = homepageobj.menuAll();
		assertTrue(checkMenus);
	}

	@When("^user mouse hover on \"([^\"]*)\"$") 
	public void user_mouse_hover_on(String menu) throws InterruptedException {
		homepageobj.menumousehover(menu);

	}

	@Then("^\"([^\"]*)\" submenus should display$")
	public void submenus_should_display(String menu) {
		List<String> actList = homepageobj.submenu(menu);
		List<String> expList = new ArrayList<String>();
		expList.add("Clothing");
		expList.add("Going Out");
		expList.add("Shoes & Boots");
		expList.add("Accessories & Bags");
		expList.add("Curves & Plus Size");
		expList.add("Maternity");
		expList.add("Petite");
		expList.add("Tall");
		expList.add("Brands");
		assertTrue(actList.size()==expList.size());
	}

	@After
	public void tearDown(Scenario scenario) throws IOException {
		if(scenario.isFailed())
		{
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
			scenario.write("scenario failed");
		}
		else
		{
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
			scenario.write("scenario passed");
		}
		driver.quit();
	}

}

package webPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import interfaceImplementation.ActionMethodsImplementation;
import interfaceImplementation.WebElementMethodsImplementation;
import interfaces.ActionMethods;
import interfaces.WebElementMethods;

public class HomePage {
	@FindBy(xpath = "//a[@href='/uk/womens' and @data-uid='uk-womens']")
	WebElement womens;

	@FindBy(xpath = "//a[@href='/uk/mens' and @data-uid='uk-mens']")
	WebElement men;

	@FindBy(xpath = "//a[@href='/uk/teens' and @data-uid='uk-teens']")
	WebElement girls;

	@FindBy(xpath = "//a[@href='/uk/homeware' and @data-uid='uk-home-gifts']")
	WebElement homegifts;

	@FindBy(xpath = "//a[@href='/uk/sale' and @data-uid='uk-Sale']")
	WebElement sale;

	@FindAll({
			@FindBy(xpath = "//div[@class='main-navigation__secondary-menu-container start']/ul/li//a[@data-parent-name='uk-womens']") })
	List<WebElement> womensubmenu;

	@FindAll({
			@FindBy(xpath = "//div[@class='main-navigation__secondary-menu-container start']/ul/li//a[@data-parent-name='uk-mens']") })
	List<WebElement> mensubmenu;

	@FindAll({
			@FindBy(xpath = "//div[@class='main-navigation__secondary-menu-container start']/ul/li//a[@data-parent-name='uk-teens']") })
	List<WebElement> girlssubmenu;

	@FindAll({
			@FindBy(xpath = "//div[@class='main-navigation__secondary-menu-container start']/ul/li//a[@data-parent-name='uk-home-gifts']") })
	List<WebElement> homegiftssubmenu;

	@FindAll({
			@FindBy(xpath = "//div[@class='main-navigation__secondary-menu-container start']/ul/li//a[@data-parent-name='uk-Sale']") })
	List<WebElement> salesubmenu;

	@FindAll({
			@FindBy(xpath = "//div[@class='main-navigation__secondary-menu-container start']/ul/li//a[@data-parent-name='uk-trends']") })
	List<WebElement> inspirationsubmenu;
	@FindBy(xpath = "//a[@href='/uk/get-inspired' and @data-uid='uk-trends']")
	WebElement inspiration;

	/*
	 * @FindBy(xpath =
	 * "//div[@class='main-navigation__secondary-menu-container start']/ul/li//a[text()='Clothing' and @href='/uk/womens/clothing/c/uk-womens-clothing']"
	 * ) WebElement clothing;
	 * 
	 * @FindBy(xpath =
	 * "//div[@class='main-navigation__secondary-menu-container start']/ul/li//a[text()='Going Out' and @href='/uk/womens/clothing-collections/going-out/c/uk-collections-womens-clothing-going-out']"
	 * ) WebElement goingout;
	 * 
	 * @FindBy(xpath =
	 * "//div[@class='main-navigation__secondary-menu-container start']/ul/li//a[text()='Shoes & Boots' and @href='/uk/womens/footwear/c/uk-womens-footwear']"
	 * ) WebElement shoes;
	 * 
	 * @FindBy(xpath =
	 * "//div[@class='main-navigation__secondary-menu-container start']/ul/li//a[text()='Accessories & Bags']"
	 * ) WebElement accessorize;
	 * 
	 * @FindBy(xpath =
	 * "//div[@class='main-navigation__secondary-menu-container start']/ul/li//a[text()='Accessories & Bags']"
	 * ) WebElement basics;// a[text()='Curves & Plus Size']") WebElement
	 * plussize;
	 * 
	 * @FindBy(xpath =
	 * "//div[@class='main-navigation__secondary-menu-container start']/ul/li//a[text()='Maternity']"
	 * ) WebElement maternity;
	 * 
	 * @FindBy(xpath =
	 * "//div[@class='main-navigation__secondary-menu-container start']/ul/li//a[text()='Petite']"
	 * ) WebElement petite;
	 * 
	 * @FindBy(xpath =
	 * "//div[@class='main-navigation__secondary-menu-container start']/ul/li//a[text()='Tall']"
	 * ) WebElement tall;
	 * 
	 * @FindBy(xpath =
	 * "//div[@class='main-navigation__secondary-menu-container start']/ul/li//a[text()='Brands']"
	 * ) WebElement brands;
	 * 
	 * @FindBy(xpath =
	 * "//div[@class='main-navigation__secondary-menu-container start']/ul/li//a[text()='Clothing' and @href='/uk/mens/clothing/c/uk-mens-clothing']"
	 * ) WebElement menclothing;
	 */
	/*
	 * @FindBy(xpath = "") WebElement menbasics;
	 * 
	 * @FindBy(xpath = "") WebElement menshoes;
	 * 
	 * @FindBy(xpath = "") WebElement menaccessorize;
	 * 
	 * @FindBy(xpath = "") WebElement girlsclothing;
	 * 
	 * @FindBy(xpath = "") WebElement girlshoes;
	 * 
	 * @FindBy(xpath = "") WebElement girlsaccessorize;
	 * 
	 * @FindBy(xpath = "") WebElement schoolshop;
	 * 
	 * @FindBy(xpath = "") WebElement homeware;
	 * 
	 * @FindBy(xpath = "") WebElement gifting;
	 * 
	 * @FindBy(xpath = "") WebElement living;
	 * 
	 * @FindBy(xpath = "") WebElement beauty;
	 * 
	 * @FindBy(xpath = "") WebElement womensale;
	 * 
	 * @FindBy(xpath = "") WebElement menssale;
	 * 
	 * @FindBy(xpath = "") WebElement girlssale;
	 * 
	 * @FindBy(xpath = "") WebElement womenstrends;
	 * 
	 * @FindBy(xpath = "") WebElement menstrends;
	 */

	private WebDriver driver;
	private WebElementMethods webelementobj;
	private ActionMethods actionobj1;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		webelementobj = new WebElementMethodsImplementation();
		actionobj1 = new ActionMethodsImplementation(driver);
	}

	public void menumousehover(String menu1) throws InterruptedException {
		// Thread.sleep(5000l);
		if ("Womens".equals(menu1)) {
			actionobj1.mouseHover(womens);
		} else if ("Mens".equals(menu1)) {
			actionobj1.mouseHover(men);

		} else if ("Girls".equals(menu1)) {
			actionobj1.mouseHover(girls);
		} else if ("Homes & Gifts".equals(menu1)) {
			actionobj1.mouseHover(homegifts);
		} else if ("Inspiration".equals(menu1)) {
			actionobj1.mouseHover(inspiration);
		}

	}

	public boolean menuAll() {
		try {
			if (webelementobj.isElementDisplayed(womens) && webelementobj.isElementDisplayed(men)
					&& webelementobj.isElementDisplayed(girls) && webelementobj.isElementDisplayed(homegifts)
					&& webelementobj.isElementDisplayed(inspiration)) {
				return true;
			} else
				return false;
		} catch (Exception e) {
			System.out.println("Missing menu:" + e.getMessage());
			return false;
		}

	}

	public List<String> submenu(String menu) {
		if ("Womens".equals(menu)) {
			List<String> womensubmenulist = webelementobj.getList(womensubmenu);
			for(String str:womensubmenulist){
				System.out.println(str);
			}
			return womensubmenulist;
		} else if ("Mens".equals(menu)) {
			List<String> mensubmenulist = webelementobj.getList(mensubmenu);
			return mensubmenulist;
			}
		else if ("Girls".equals(menu)) {
			List<String> girlsubmenulist = webelementobj.getList(girlssubmenu);
			return girlsubmenulist;
			}
		 else if ("Home & Gifts".equals(menu)) {
			List<String> homegiftssubmenulist = webelementobj.getList(homegiftssubmenu);
			return homegiftssubmenulist;
		} else if ("Sale".equals(menu)) {
			List<String> salesubmenulist = webelementobj.getList(salesubmenu);
			return salesubmenulist;
		} else if ("Inspiration".equals(menu)) {
			List<String> inspirationsubmenulist = webelementobj.getList(inspirationsubmenu);
			return inspirationsubmenulist;
		}
		return null;
		
	}
}

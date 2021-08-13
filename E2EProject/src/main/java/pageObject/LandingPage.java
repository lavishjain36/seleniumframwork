package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	private By signin = By.cssSelector("a[href*='sign_in']");
	private By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	private By NavBar = By.cssSelector(".nav");
	private By header = By.cssSelector("div[class*='video-banner'] h3");
	private By subheader=By.cssSelector("div[class*='video-banner'] p");

	// we need to assign alife to it by calling chrome driver here.

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	// pull the locator and feed into the method getLogin
	public LoginPage getLogin() {

		driver.findElement(signin).click();
		LoginPage lp = new LoginPage(driver);
		return lp;

	}

	public WebElement getNavigationBar() {
		return driver.findElement(NavBar);

	}

	public WebElement getTitle() {
		return driver.findElement(title);

	}
	//page object is ready
	public WebElement getHeader() {
		return driver.findElement(header);

	}
	//page object is ready
		public WebElement getSubHeader() {
			return driver.findElement(subheader);

		}
}

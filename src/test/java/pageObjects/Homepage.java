package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {

	public Homepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='What do you want to learn?']")
	private WebElement SearchInput;
	
	@FindBy(xpath = "//div[@class='css-19qryfx']")
	public WebElement title;
	
	@FindBy(xpath = "(//div[@class='magnifier-wrapper'])[2]")
	private WebElement SearchButton;

	@FindBy(xpath = "(//div[@role='navigation']/descendant::a)[2]")
	private WebElement ForBuisness;

	public void clickSearchWebDev() {
		SearchInput.sendKeys("Web dev");
	}
	
	public void clickSearchLanguage() {
		SearchInput.sendKeys("Language Learning");
	}
	
	public void clickSearchButton() {
		SearchButton.click();
	}

	public void clickForBuisness() {
		ForBuisness.click();
	}

}

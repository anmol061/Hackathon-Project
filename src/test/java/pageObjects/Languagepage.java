package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Languagepage extends BasePage {
	
	public Languagepage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='css-1vfysn6']")
	List<WebElement>languagecount;
	
	@FindBy(xpath = "(//span[text()='Show more'])[2]")
	private WebElement showmore;
	
	@FindBy(xpath = "(//div[@class='cds-246 cds-formGroup-groupWrapper'])[4]//child::div[@class='css-zf4w52']")
	List<WebElement> levelcount;
	
	
	public void clickshowmore() {
		showmore.click();
	}
	
	public int countlanguage() {
		int count =languagecount.size();
		return count;
	}
	
	public void extractlanguage() {
		for(WebElement lang : languagecount) {
			String languages = lang.getText();
			System.out.println(languages);
		}
	}
		
		
		public int countlevel(){
			int count =levelcount.size();
			return count;
		}
		
		public void extractlevel(){
			for(WebElement lev : levelcount) {
				String level = lev.getText();
				System.out.println(level);
			}
		}
		
	
	
	
	
	
}

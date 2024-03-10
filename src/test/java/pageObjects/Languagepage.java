package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Languagepage extends BasePage {
	
	public Languagepage(WebDriver driver) {
		super(driver);
	}
	
	
	
	public List<String>language;
	public List<String>level;
	
	@FindBy(xpath = "//div[@class='css-zweepb']//div")
	List<WebElement>languagecount;
	
	@FindBy(xpath = "(//span[text()='Show more'])[2]")
	private WebElement showmore;
	
	@FindBy(xpath = "//div[@data-testid=\"search-filter-group-Level\"]/div/div//label/div/span")
	List<WebElement> levelcount;
	
	@FindBy(xpath="(//span[@class='cds-button-endIcon'])[2]")
	WebElement close;
	
	
	public void clickshowmore() {
		showmore.click();
	}
	
	public List<String> returnlanguage(){
		language = ElementToString.convertData(languagecount,language);
		System.out.println("---------------------------------------------------");
		close.click();
		return language;
	}
	
	public List<String> returnlevel() {
		level =ElementToString.convertData(levelcount,level);
		return level;
	}
	
	public int countlanguage() {
		int count =languagecount.size();
		return count;
	}
	
//	public void extractlanguage() throws InterruptedException {
//		for(WebElement lang : languagecount) {
//			String languages = lang.getText();
//			System.out.println(languages);
//			
//		}
		
	
		
		
		public int countlevel(){
			int count =levelcount.size();
			return count;
		}
		
//		public void extractlevel(){
//			for(WebElement lev : levelcount) {
//				String level = lev.getText();
//				System.out.println(level);
//			}
		}	
	


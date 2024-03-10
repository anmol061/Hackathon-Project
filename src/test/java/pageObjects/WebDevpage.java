package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebDevpage extends BasePage {

	public WebDevpage(WebDriver driver) {
		super(driver);
	}
	
	public List<String>course;
	public List<String>rating;
	List<String> duration = new ArrayList<>();

	@FindBy(xpath = "//span[text()='English']")
	private WebElement LanguageFilter;

	@FindBy(xpath = "//span[text()='Beginner']")
	private WebElement LevelFilter;

	@FindBy(xpath = "//h3[@class='cds-CommonCard-title css-6ecy9b']")
	public List<WebElement> courses;

	@FindBy(xpath = "//div[@class='cds-CommonCard-ratings']")
	public List<WebElement> ratings;
	
	@FindBy(xpath = "(//div[@role='navigation']//a)[1]")
	public WebElement WebdevPageTitle;
	
	@FindBy(xpath="//div[@class='cds-CommonCard-metadata']/p")
	public List<WebElement> courseperiod;
	
	public void clickLanguageFilterButton() {
		LanguageFilter.click();
	}

	public void clickLevelFilterButton() {
		LevelFilter.click();		
	}
	
	public List<String> returncourse() {
		course =ElementToString.convertData(courses,course);
		return course;
	}
	
	public List<String> returnrating() {
		rating =ElementToString.convertData(ratings,rating);
		return rating;
	}
	
	public List<String> getDuration(){
		duration.clear();
		for(int i=0; i<courseperiod.size(); i++) {
			String details = courseperiod.get(i).getText();
			String[] dur = details.split("·");
			duration.add(dur[2]);
		}
		return duration;
	}
	
	public void printDuration() {
		List<String> duration = getDuration();
		for(String data: duration) {
			System.out.println(data);
		}
	}
	
    

}

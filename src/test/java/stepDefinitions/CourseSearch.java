package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Homepage;
import pageObjects.WebDevpage;
import utilities.Excelutilities;

public class CourseSearch {

	WebDriver driver;

	Homepage hp = new Homepage(BaseClass.getDriver());

	WebDevpage wb = new WebDevpage(BaseClass.getDriver());
	
	Excelutilities eu = new Excelutilities();

	@Given("the user is on coursera homepage")
	public void the_user_is_on_coursera_homepage() {

	}

	@When("the user searches for web developement courses")
	public void the_user_searches_for_web_developement_courses() {
		
		hp.clickSearchWebDev();
		BaseClass.getLogger().info("Clicked on search button and entered webdev");

		hp.clickSearchButton();
		BaseClass.getLogger().info("Clicked on enter");
	}

	@When("apply filter for language and level")
	public void apply_filter_for_language_and_level() throws InterruptedException {

		wb.clickLanguageFilterButton();
		BaseClass.getLogger().info("Applied language filter");

		wb.clickLevelFilterButton();
		BaseClass.getLogger().info("Applied level filter");
		Thread.sleep(2000);

	}

	@Then("user should see courses  name, total learning hours and rating")
	public void user_should_see_courses_name_total_learning_hours_and_rating() throws IOException {

		    wb.returncourse();
			BaseClass.getLogger().info("Printed course name");
		
            wb.returnrating();
			BaseClass.getLogger().info("Printed course rating");
			
			wb.printDuration();
			
			eu.writeData(wb.course, wb.rating,"Webdev Course");
		
	}

}

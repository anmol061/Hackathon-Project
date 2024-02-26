package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Homepage;
import pageObjects.Languagepage;

public class LanguageLearning {
	
    WebDriver driver ;
	
	Languagepage lu = new Languagepage(BaseClass.getDriver());
	
	Homepage hp = new Homepage(BaseClass.getDriver());
    

@When("the user searches for language learning")
public void the_user_searches_for_language_learning() {
  
	hp.clickSearchButton();
	BaseClass.getLogger().info("Clicked search button");
	
	hp.clickSearchLanguage();
	BaseClass.getLogger().info("Entered language Learning and pressed enter");
}

@Then("user should store contents of  levels and languages")
public void user_should_store_contents_of_levels_and_languages() {
   
	lu.clickshowmore();
	
	int count = lu.countlanguage();
	
	System.out.println("Count of languages is :" + count);
	BaseClass.getLogger().info("printed count of languages");
	
	lu.extractlanguage();
	BaseClass.getLogger().info("printed languages");
	
	int counts = lu.countlevel();
	
	System.out.println("Count of level is :" + counts);
	BaseClass.getLogger().info("printed count of levels ");
	
	lu.extractlevel();
	BaseClass.getLogger().info("printed levels");
}

}

package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Enterprisepage;
import pageObjects.Homepage;

public class ForEnterprise {

	WebDriver driver ;
	
	Enterprisepage eu = new Enterprisepage(BaseClass.getDriver());
	
	Homepage hp = new Homepage(BaseClass.getDriver());
	
	@When("the user clicks on For Enterprise")
	public void the_user_clicks_on_for_enterprise() {
      
		hp.clickForBuisness();
		BaseClass.getLogger().info("Clicked on Buisness");
	}

	@Then("enter the invalid credentials and click on submit")
	public void enter_the_invalid_credentials_and_click_on_submit() throws InterruptedException {
       
		eu.sendfirstname();
		BaseClass.getLogger().info("Entered first name");
		eu.sendlastname();
		BaseClass.getLogger().info("Entered last name");
		eu.sendemail();
		BaseClass.getLogger().info("Entered email ");
		eu.sendphone();
		BaseClass.getLogger().info("Entered phone no ");
		eu.sendtitle();
		BaseClass.getLogger().info("Entered title");
		eu.expectedlearner();
		BaseClass.getLogger().info("Entered expected learner");
		eu.selectcountry();
		BaseClass.getLogger().info("Entered country");
		eu.selectstate();
		BaseClass.getLogger().info("Entered state");
		eu.selectneeds();
		BaseClass.getLogger().info("Entered needs");
		eu.clickSubmit();
		BaseClass.getLogger().info("submitted the form");
		//eu.sendcompany();
		//eu.sendcompanysize();
		//eu.clickSubmit();
		Thread.sleep(3000);
	}

	@Then("then capture the error message")
	public void then_capture_the_error_message() {
		
       
		String expresult = "Please enter your work email address";
		String actresult = eu.getErrorMessage();
		
		if(expresult.equals(actresult)) {
			System.out.println(actresult);
			BaseClass.getLogger().info("Got the warning message");
		}
	}
}

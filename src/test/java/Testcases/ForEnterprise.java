package Testcases;


import org.junit.Assert;
import org.testng.annotations.Test;

import factory.BaseClass;
import factory.BaseClassTestNG;
import pageObjects.Enterprisepage;
import pageObjects.Homepage;

public class ForEnterprise extends BaseClassTestNG{
	
	Enterprisepage eu;
	
	Homepage hp ;
	
	@Test (groups= {"master","regression"},priority=1)
	public void FillForm() throws InterruptedException{
		
		
		eu = new Enterprisepage(driver);
		
		hp = new Homepage(driver);
		
		hp.clickForBuisness();
		BaseClass.getLogger().info("Clicked on Buisness");
		 
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
		takescreenshot("ednterprise.png");
		eu.clickSubmit();
		BaseClass.getLogger().info("submitted the form");
		//eu.sendcompany();
		//eu.sendcompanysize();
		//eu.clickSubmit();
		Thread.sleep(3000);
		
		String expresult = "Please enter your work email addressssss";
		String actresult = eu.getErrorMessage();
		
		if(expresult.equals(actresult)) {
			System.out.println(actresult);
			BaseClass.getLogger().info("Got the warning message");
	
			
	}
		else {
			Assert.fail();
		}

	}
}

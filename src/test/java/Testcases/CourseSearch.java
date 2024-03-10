package Testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import factory.BaseClass;
import factory.BaseClassTestNG;
import pageObjects.Homepage;
import pageObjects.WebDevpage;

public class CourseSearch extends BaseClassTestNG {

	//WebDriver driver;
	Homepage hp;
	WebDevpage wb ;
	
	@Test (groups= {"master","regression"},priority=1)
	public void checksite(){
		hp = new Homepage(driver);
		Assert.assertTrue(hp.title.isDisplayed());
		BaseClass.getLogger().info("HomePage Title is verified");
	}
	@Test (groups= {"master","regression"},priority=2)
	public void checkCorrectTitle(){
		
		hp = new Homepage(driver);
		wb = new WebDevpage(driver);
		hp.clickSearchWebDev();
		BaseClass.getLogger().info("Clicked on search button and entered webdev");
		hp.clickSearchButton();
		BaseClass.getLogger().info("Clicked on enter");
		Assert.assertEquals("Title incorrect","For Individuals",wb.WebdevPageTitle.getText());
		BaseClass.getLogger().info("WebDev page Title is verified");
	}
	
	@Test (groups= {"master","regression"},priority=3)
	public void getCourse() throws InterruptedException{
		
		hp = new Homepage(driver);
		wb = new WebDevpage(driver);

		wb.clickLanguageFilterButton();
		BaseClass.getLogger().info("Applied language filter");

		wb.clickLevelFilterButton();
		Thread.sleep(2000);
		BaseClass.getLogger().info("Applied level filter");
		
		wb.returncourse();
		BaseClass.getLogger().info("Printed course name");
		
		takescreenshot("Web.png");
		
	}	
	

	@Test (groups= {"master","regression"},priority=4)
	public void getRating() throws InterruptedException{
		
		wb = new WebDevpage(driver);	
		wb.returnrating();
		BaseClass.getLogger().info("Printed course rating");
	
	}
}


package Testcases;

import org.testng.annotations.Test;

import factory.BaseClass;
import factory.BaseClassTestNG;
import pageObjects.Homepage;
import pageObjects.Languagepage;

public class LanguageLearning extends BaseClassTestNG {
  
	Languagepage lu ;
	Homepage hp;
	@Test (groups= {"master","regression"},priority=1)
	public void LanguageLearnings() throws InterruptedException{
		
		lu= new Languagepage(driver);
		
		hp = new Homepage(driver);
		
		hp.clickSearchButton();
		BaseClass.getLogger().info("Clicked search button");
		
		hp.clickSearchLanguage();
		BaseClass.getLogger().info("Entered language Learning and pressed enter");
		
 
		lu.clickshowmore();
		
		int count = lu.countlanguage();
		
		System.out.println("Count of languages is :" + count);
		BaseClass.getLogger().info("printed count of languages");
		
		//lu.extractlanguage();
		lu.returnlanguage();
		BaseClass.getLogger().info("printed languages");
		
		takescreenshot("Language.png");
		
		int counts = lu.countlevel();
		
		System.out.println("Count of level is :" + counts);
		BaseClass.getLogger().info("printed count of levels ");
		
		
		//lu.extractlevel();
		lu.returnlevel();
		BaseClass.getLogger().info("printed levels");
		
		
		
	}
	}


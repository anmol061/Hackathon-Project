package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Enterprisepage extends BasePage {

	public Enterprisepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id ='FirstName']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@id ='LastName']")
	private WebElement lastname;

	@FindBy(xpath = "//input[@id ='Email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id ='Phone']")
	private WebElement phone;

	@FindBy(xpath = "//input[@id ='Title']")
	private WebElement title;

	@FindBy(xpath = "//select[@id ='Self_reported_employees_to_buy_for__c']")
	private WebElement expectedlearner;

	@FindBy(xpath = "//select[@id ='Country']")
	private WebElement country;

	@FindBy(xpath = "//select[@id ='State']")
	private WebElement state;

	@FindBy(xpath = "//select[@id ='What_the_lead_asked_for_on_the_website__c']")
	private WebElement needs;

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//input[@id='Company']")
	private WebElement company;
	
	@FindBy(xpath = "//select[@id='Employee_Range__c']")
	private WebElement companysize;
	
	@FindBy(xpath = "//div[@id='ValidMsgEmail']")
    private WebElement message;
	
	public void sendfirstname() {
		firstname.sendKeys("anmol");
	}

	public void sendlastname() {
		lastname.sendKeys("agarwal");
	}

	public void sendemail() {
		email.sendKeys("abc@gmail.com");
	}

	public void sendphone() {
		phone.sendKeys("7878787878");
	}

	public void sendtitle() {
		title.sendKeys("coder");
	}

	public void expectedlearner() {
		Select s = new Select(expectedlearner);
		s.selectByVisibleText("26-100");

	}

	public void selectcountry() {
		Select s = new Select(country);
		s.selectByVisibleText("India");

	}

	public void selectneeds() {
		Select s = new Select(needs);
		s.selectByVisibleText("Courses for myself");

	}

	public void selectstate() {
		Select s = new Select(state);
		s.selectByVisibleText("Uttar Pradesh");

	}

	public void sendcompany()  {
		company.sendKeys("anster");
	}
	
	public void sendcompanysize() {
		Select s = new Select(companysize);
		s.selectByVisibleText("1-500");
	}
	
	public void clickSubmit() throws InterruptedException {
		submit.click();
	}
	
	
   
	public String getErrorMessage() {
		String mess=message.getText();
		return mess;
		
	}
}

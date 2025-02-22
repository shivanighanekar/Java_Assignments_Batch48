package project_maven_ecommerce.EcommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//step1
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement accountandlists_hoverover;
	
	@FindBy(xpath="(//div[@id='nav-flyout-ya-newCust'])//a")
	WebElement start_here;
	
	@FindBy(xpath="//input[@placeholder='First and last name']")
	WebElement name;
	
	@FindBy(xpath="//input[@placeholder='Mobile number']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@placeholder='At least 6 characters']")
	WebElement password;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement verify_mobile_number;
	
	//step2
	public void hoverover(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlists_hoverover).perform();
	}
	public void start_here_click()
	{
		start_here.click();
	}
	public void name()
	{
		name.sendKeys("Shivani Ghanekar");
	}
	public void mobile()
	{
		mobile.sendKeys("8329732344");
	}
	public void password()
	{
		password.sendKeys("Shivani9090*");
	}
	public void verifyMobileNumber()
	{
		verify_mobile_number.click();
	}
	
	
	//step3
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}



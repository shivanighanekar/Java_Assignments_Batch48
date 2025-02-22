package project_maven_ecommerce.EcommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
	//step1
		@FindBy(xpath="//a[@id='nav-link-accountList']")
		WebElement accountandlists_hoverover;
		@FindBy(xpath="//a[@data-nav-role=\"signin\"]")
		WebElement signin;
		@FindBy(xpath="//input[@aria-label=\"Enter your mobile number or email\"]")
		WebElement username;
		@FindBy(xpath="//input[@aria-labelledby=\"continue-announce\"]")
		WebElement continueButton;
		@FindBy(xpath="//input[@id=\"ap_password\"]")
		WebElement password;
		@FindBy(xpath="//span[@id=\"auth-signin-button\"]")
		WebElement signinButton;
		@FindBy(xpath="//input[@placeholder='Search Amazon.in']")
		WebElement searchBar;
		@FindBy(xpath="//input[@id='nav-search-submit-button']")
		WebElement searchButton;
		
		//step2
		public void hoverover(WebDriver driver)
		{
			Actions a1=new Actions(driver);
			a1.moveToElement(accountandlists_hoverover).perform();
		}
		public void signin()
		{
			signin.click();
		}
		public void username()
		{
			username.sendKeys("8329732344");
		}
		public void continueButton()
		{
			continueButton.click();
		}
		public void password()
		{
			password.sendKeys("Shivani9090*");
		}
		public void signIn()
		{
			signinButton.click();
		}
		public void searchBar()
		{
			searchBar.sendKeys("shoes");
		}
		public void searchButton()
		{
			searchButton.click();
		}
		
		
		//step3
		public SearchProduct(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
}

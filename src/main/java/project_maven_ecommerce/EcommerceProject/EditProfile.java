package project_maven_ecommerce.EcommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class EditProfile 
{
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
		@FindBy(xpath="//button[@data-testid='manage-profiles-button']")
		WebElement manageProfiles;
		@FindBy(xpath="//a[@data-testid='profile-view-button']")
		WebElement viewAccountShivaniGhanekar;
		@FindBy(xpath="//button[@class='edit-pencil-icon-button']")
		WebElement editPencilButton;
		@FindBy(xpath="//input[@id='editProfileNameInputId']")
		WebElement editProfileNameInputId;
		@FindBy(xpath="//input[@aria-labelledby='editProfileContinueButton-announce']")
		WebElement editProfileContinueButton;
		@FindBy(xpath="//div[@class='profile-name desktop']")
		WebElement profile_name;

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
		public void manageProfiles()
		{
			manageProfiles.click();
		}
		public void viewAccountShivaniGhanekar()
		{
			viewAccountShivaniGhanekar.click();
		}
		public void editPencilButton()
		{
			editPencilButton.click();
		}
		public void editProfileNameInputId()
		{
			editProfileNameInputId.clear();
			editProfileNameInputId.sendKeys("Dhammu");
		}
		public void editProfileContinueButton()
		{
			editProfileContinueButton.click();
		}
		public void profileNameText()
		{
			String Actual_text = profile_name.getText();
			String expected_text="Dhammu";
			 Assert.assertEquals("Text does not match!", expected_text, Actual_text);
		}
		
		
//step3
	public EditProfile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}

package project_maven_ecommerce.EcommerceProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase4 {
	@Test
	public void loginPass() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.navigate().refresh();
	    Thread.sleep(2000);
	    EditProfile lp = new EditProfile(driver);
	    lp.hoverover(driver);
		Thread.sleep(2000);
		lp.signin();
		Thread.sleep(5000);
		lp.username();
		Thread.sleep(2000);
		lp.continueButton();
		Thread.sleep(5000);
		lp.password();
		Thread.sleep(5000);
		lp.signIn();
		Thread.sleep(5000);
		lp.hoverover(driver);
		Thread.sleep(5000);
		lp.manageProfiles();
		Thread.sleep(5000);
		lp.viewAccountShivaniGhanekar();
		Thread.sleep(5000);
		lp.editPencilButton();
		Thread.sleep(5000);
		lp.editProfileNameInputId();
		Thread.sleep(5000);
		lp.editProfileContinueButton();
		Thread.sleep(10000);
		lp.profileNameText();
		
		
}
}

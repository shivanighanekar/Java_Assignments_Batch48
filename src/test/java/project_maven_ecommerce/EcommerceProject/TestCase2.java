package project_maven_ecommerce.EcommerceProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test
	public void loginPass() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.navigate().refresh();
	    Thread.sleep(2000);
	    LoginPass lp = new LoginPass(driver);
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
		
}
}

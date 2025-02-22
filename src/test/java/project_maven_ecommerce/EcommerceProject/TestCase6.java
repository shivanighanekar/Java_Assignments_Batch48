package project_maven_ecommerce.EcommerceProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase6 {
	@Test
	public void SearchProduct() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.navigate().refresh();
	    Thread.sleep(2000);
	    AddItemToCart AITC = new AddItemToCart(driver);
	    AITC.hoverover(driver);
		Thread.sleep(2000);
		AITC.signin();
		Thread.sleep(5000);
		AITC.username();
		Thread.sleep(2000);
		AITC.continueButton();
		Thread.sleep(5000);
		AITC.password();
		Thread.sleep(5000);
		AITC.signIn();
		Thread.sleep(5000);
		AITC.searchBar();
		Thread.sleep(5000);
		AITC.searchButton();
		Thread.sleep(5000);

		
}
}

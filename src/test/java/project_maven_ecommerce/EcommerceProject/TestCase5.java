package project_maven_ecommerce.EcommerceProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestCase5 {
	@Test
	public void SearchProduct() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.navigate().refresh();
	    Thread.sleep(2000);
	    SearchProduct sp = new SearchProduct(driver);
	    sp.hoverover(driver);
		Thread.sleep(2000);
		sp.signin();
		Thread.sleep(5000);
		sp.username();
		Thread.sleep(2000);
		sp.continueButton();
		Thread.sleep(5000);
		sp.password();
		Thread.sleep(5000);
		sp.signIn();
		Thread.sleep(5000);
		sp.searchBar();
		Thread.sleep(5000);
		sp.searchButton();
		
}
}

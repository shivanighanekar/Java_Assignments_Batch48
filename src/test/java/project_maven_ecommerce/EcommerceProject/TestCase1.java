package project_maven_ecommerce.EcommerceProject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 
{
		@Test
		public void registration() throws InterruptedException
		{
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			driver.navigate().refresh();
			driver.navigate().refresh();
		    Thread.sleep(2000);
			HomePage hp = new HomePage(driver);
			hp.hoverover(driver);
			Thread.sleep(2000);
			hp.start_here_click();
			Thread.sleep(2000);
			hp.name();	
			Thread.sleep(2000);
			hp.mobile();
			Thread.sleep(2000);
			hp.password();
			Thread.sleep(2000);
			hp.verifyMobileNumber();	
		}
}



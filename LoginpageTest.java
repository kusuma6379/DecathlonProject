package DecathlonProjectTestRunner;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import DecathlonProjectTest.LoginPage;
public class LoginpageTest {
	
	WebDriver driver;
	@BeforeClass
	public void Setup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.decathlon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test	 
    public void LoginPhoneNumber() throws InterruptedException  {
		LoginPage Phone=new LoginPage(driver);
        
        
        
       // Phone.loginWithEmail("kusumababu6370@gmail.com");  
		Phone.loginWithPhoneNumber();
		Phone.handlePopup("nothanks");
	    Thread.sleep(5000);
		 
	}
	@AfterClass
	public void teardown() {
		driver.quit();
		
	}

}

	
	


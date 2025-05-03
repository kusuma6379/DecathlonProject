package Decathlonproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginpageTest {
	WebDriver driver;
	@BeforeClass
	void Setup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.decathlon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test	 
    void LoginPhoneNumber() throws InterruptedException {
    	 LoginPage Phone=new LoginPage();
		 Phone.Siginin();
		 Phone.PhoneNumberSelect();
		 Phone.PhoneNumberEnter("7989292662");
		 Phone.Next();
		 Phone.OTP("344145");
		 Phone.BUTTON();
		 Thread.sleep(5000);
		 
	}
	@AfterClass
	void teardown() {
		driver.quit();
		
	}

}

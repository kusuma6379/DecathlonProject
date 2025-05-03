package Decathlonproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckoutPageTest {
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
	void test() {
		CheckoutPage Check=new CheckoutPage(driver);
		Check. AddToCart();
		Check. SelectCart();
		Check.CheckOut();
		
	}
	@AfterClass
	void Teardown() {
		driver.quit();
	}

}


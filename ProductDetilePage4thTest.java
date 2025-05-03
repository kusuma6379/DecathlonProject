package Decathlonproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductDetilePage4thTest {
	WebDriver driver;
	
	@BeforeClass
	void setup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.decathlon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	@Test
	void test() {
		ProductDetailsPage4th Product =new ProductDetailsPage4th(driver);
		Product.searchbar("Watch");
		Product.LocateWatch();
		Product.Reviews();
		Product.TypeReviews(); 
		Product.Starts();
		Product.ReviewTitle("Excellent");
		Product.TextReviews();
		Product.YES();
		Product.Dropdown();
		Product.Next();
		Product.Email("kusumababu017@gmail.com");
		Product.FirstName("Madavali");
		Product.LastName("Kusuma");
		Product.RadioButton();
		Product.AgeDropdown();
		Product.CheckBox();
		Product.PublishReview();
		
	}
	@AfterClass
	void Teardown() {
		driver.quit();
	}
	
	
	
}

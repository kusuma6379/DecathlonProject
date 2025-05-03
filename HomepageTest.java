package Decathlonproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomepageTest {
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
	void ProjectTest() {
		Homepage test=new Homepage(driver);
		test.Logo();
		test.Searchbar("Tshirts");
		test.Productitems();
		test.Account();
		test.Mystorebutton();
		test.Supportsection();
		test.Wishlistsection();
		test.cartbutton();
		test.WomenProducts();
		test.Bannerspage();
		test.Footersection();
		test.Countries();
		
	}
	@AfterClass
	void teardown() {
		driver.quit();
	}

}

package Decathlonproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ProductpageTest {
	WebDriver driver;
	@BeforeClass
	void Setup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.decathlon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@org.testng.annotations.Test
	public void Test() {
		ProductListingPage page=new ProductListingPage(driver);
		page.Search("Shirts");
		page.Shirt();
		page.SearchBrand("NYAMBA");
		page.BtwinProducts();
		page.SortingSearch("500 To 1000");
		page.Sorting();
	}
	@AfterClass
	void Teardown() {
		driver.quit();
	}

}

package DecathlonProjectTestRunner;

import DecathlonProjectTest.ProductListingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class ProductListingPageTest {

    WebDriver driver;

    @BeforeClass
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.decathlon.in/");
        Thread.sleep(5000);
    }

    @Test
    public void testProductListingWithFilterSort() throws InterruptedException {
        ProductListingPage listing = new ProductListingPage(driver);

        listing.searchProduct("cycle");
        Thread.sleep(3000);

        listing.closePopupIfPresent();
        Thread.sleep(4000);
        
        listing.applyBrandFilter();  
        Thread.sleep(3000);

        listing.sortByLowToHigh();
        Thread.sleep(3000);

        listing.printProductTitlesAndPrices();
        Thread.sleep(3000);

        listing.clickFirstProduct();
        Thread.sleep(4000);

        listing.goBackToListing(); 
        Thread.sleep(4000);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}


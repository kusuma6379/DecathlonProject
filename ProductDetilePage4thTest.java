package DecathlonProjectTestRunner;

import DecathlonProjectTest.ProductDetailsPage4th;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ProductDetilePage4thTest {

    WebDriver driver;
    ProductDetailsPage4th productPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.decathlon.in/");
        productPage = new ProductDetailsPage4th(driver);
    }

    @Test
    public void testCompleteProductFlow() throws InterruptedException {
        // Step 1: Handle popup
        productPage.closePopupIfVisible();
        Thread.sleep(2000);
        
    	 // Step 2: Search product
        productPage.searchProduct("tshirt");
        Thread.sleep(2000);
        
    	// Step 3: Select first product
        productPage.openFirstProduct();
        Thread.sleep(2000);
        
        
    	 // Step 4: Get product details    
      	productPage.getProductTitle();
      	 Thread.sleep(2000);
      	
      	//step5: Price
        productPage.getPrice();
    	 Thread.sleep(2000);
    	
    	// Step 6: Size selection
    	 productPage.selectSizeIfAvailable();
    	 Thread.sleep(2000);
    	
        //Step 6: Add to cart and go to cart
        productPage.addToCart();
        Thread.sleep(2000);

       // Step7: goto cart
      productPage.goToCart();
      Thread.sleep(2000); 

    	//step8:Back to previous page 
    	productPage.goBackToPreviousPage(); 
     	Thread.sleep(2000);
       
       // Step9: OpenReview
      productPage.openReviewTabAndWriteReview("Very good quality. Totally satisfied!");
      Thread.sleep(2000);
                    

        //Step10: Last step
    	productPage.goToCart();
    	productPage.verifyCartPageLoaded();
    	 Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

package DecathlonProjectTestRunner;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import DecathlonProjectTest.CartPage;

public class CartPageTest {

    WebDriver driver;
    CartPage cartPage;

    @BeforeClass
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.decathlon.in/");
        Thread.sleep(3000); // Wait for initial page load
        cartPage = new CartPage(driver);
    }

    @Test
    public void testCartActions() {
        cartPage.closePopupIfPresent();
        cartPage.addToCart();
        cartPage.openCart();
      cartPage.deleteItem();
        cartPage.confirmDeletePopup();
        cartPage.adjustQuantity();
        cartPage.checkPrice();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}



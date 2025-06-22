package DecathlonProjectTestRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import DecathlonProjectTest.Homepage;

import java.time.Duration;

public class HomepageTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.decathlon.in/");
        driver.manage().window().maximize();
    }

    @Test
    public void homepageFunctionalityTest() {
        Homepage page = new Homepage(driver);
          page.closePopupIfVisible();
          page.clickProducts();
         
          page.TriblebarClick();
          page.Logo();  
          page.clickMyStore();   
         page.clickWishlist();
          page.clickCart(); 

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}

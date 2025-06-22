package DecathlonProjectTest;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public class ProductListingPage {
    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public ProductListingPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    
    
    
    
    // Locators
    By popupClose = By.cssSelector("button[aria-label='Close']"); 
    By sortBy = By.cssSelector("button[data-testid='sortDropdown']"); 
    By lowToHigh = By.xpath("//li[contains(text(),'Price: Low to High')]"); 
    By searchInput = By.xpath("//input[@placeholder='Search for products, brands and more']");
    By firstProduct = By.xpath("(//div[contains(@class,'product-card')])[1]");
    By brandFilter = By.xpath("//span[text()='Brand']");
    By btwinBrand = By.xpath("//label[contains(.,'BTWIN')]");
   
    By priceList = By.xpath("//span[@class='selling-price omniture-field']");
    By productTitles = By.xpath("//div[@class='product-title']");

    // Actions
    public void closePopupIfPresent() {
        List<WebElement> popups = driver.findElements(By.cssSelector("button[aria-label='Close']"));
        if (!popups.isEmpty() && popups.get(0).isDisplayed()) {
            popups.get(0).click();
            System.out.println("Popup closed successfully.");
        } else {
            System.out.println("Popup not present.");
        }
    }


    public void searchProduct(String keyword) {
        //closePopupIfPresent();

        List<WebElement> searchBars = driver.findElements(searchInput);

        if (!searchBars.isEmpty()) {
            WebElement search = searchBars.get(0);
            search.clear();
            search.sendKeys(keyword);
            search.sendKeys(Keys.ENTER);
            System.out.println("Searched: " + keyword);
        } else {
            System.out.println("Search bar not found.");
        }
    }


    public void applyBrandFilter() {
       

        if (!driver.findElements(brandFilter).isEmpty()) {
            driver.findElement(brandFilter).click();
            System.out.println("Brand filter opened.");
        }

        if (!driver.findElements(btwinBrand).isEmpty()) {
            driver.findElement(btwinBrand).click();
            System.out.println("BTWIN brand selected.");
        }
    }


    public void sortByLowToHigh() {
        closePopupIfPresent();

        if (!driver.findElements(sortBy).isEmpty()) {
            driver.findElement(sortBy).click();
            System.out.println("Sort clicked");
        }

        if (!driver.findElements(lowToHigh).isEmpty()) {
            driver.findElement(lowToHigh).click();
            System.out.println("Low to High selected");
        }
    }


    public void printProductTitlesAndPrices() {
        closePopupIfPresent();

        List<WebElement> titles = driver.findElements(productTitles);
        List<WebElement> prices = driver.findElements(priceList);

        for (int i = 0; i < titles.size(); i++) {
            System.out.println("Product: " + titles.get(i).getText() + ", Price: Rs " + prices.get(i).getText());
        }
    }


    public void clickFirstProduct() {
        closePopupIfPresent();

        if (!driver.findElements(firstProduct).isEmpty()) {
            driver.findElement(firstProduct).click();
            System.out.println("First product clicked.");
        } else {
            System.out.println("First product not found.");
        }
    }

    public void goBackToListing() {
        driver.navigate().back();
    }
}

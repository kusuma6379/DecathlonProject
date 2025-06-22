package DecathlonProjectTest;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class ProductDetailsPage4th {
    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public ProductDetailsPage4th(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Locators
    By popupClose = By.xpath("//button[@id='wzrk-confirm']");
    By searchBar = By.xpath("//input[@aria-label='Search']");
    By searchButton = By.xpath("//button[contains(@aria-label,'Search')]");
    By firstProduct = By.xpath("(//a[contains(@class,'product')])[1]");
    By productTitle = By.xpath("//h1");
    By price = By.xpath("//span[contains(@class,'selling-price') or contains(@class,'price')]");
    By sizeOption = By.xpath("(//div[contains(@class,'size-selector')]//button)[1]");
    By addToCart = By.xpath("//button[contains(text(),'Add to Cart')]");
    By goToCart = By.xpath("//a[contains(@href,'/cart')]");
    By reviewTab = By.xpath("//a[contains(text(),'Reviews')]");
    By writeReviewButton = By.xpath("//button[contains(text(),'Write a review')]");
    By reviewTextarea = By.xpath("//textarea[@name='review']");
    By ratingStar = By.xpath("(//span[contains(@class,'star')])[5]"); // 5-star
    By submitReviewButton = By.xpath("//button[contains(text(),'Submit')]");
    
    
    
    public void closePopupIfVisible() {
        List<WebElement> popups = driver.findElements(popupClose);
        if (!popups.isEmpty() && popups.get(0).isDisplayed()) {
            popups.get(0).click();
            System.out.println("Popup closed.");
        } else {
            System.out.println("No popup found.");
        }
    }


    public void searchProduct(String productName) {
        closePopupIfVisible(); // Make sure popup doesn't block

        List<WebElement> bars = driver.findElements(searchBar);
        if (!bars.isEmpty()) {
            WebElement bar = bars.get(0);
            bar.clear();
            bar.sendKeys(productName);
            driver.findElement(searchButton).click();
            System.out.println("Search executed for: " + productName);
        } else {
            System.out.println("Search bar not found.");
        }
    }


    public void openFirstProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(firstProduct)).click();
    }

    public String getProductTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle)).getText();
    }

    public String getPrice() {
        List<WebElement> prices = driver.findElements(price);
        if (!prices.isEmpty()) {
            return prices.get(0).getText();
        } else {
            return "Price not found";
        }
    }


    public void selectSizeIfAvailable() {
        List<WebElement> sizes = driver.findElements(sizeOption);
        if (!sizes.isEmpty()) {
            sizes.get(0).click();
            System.out.println("Size selected.");
        } else {
            System.out.println("Size not available.");
        }
    }


    public void addToCart() {
        List<WebElement> buttons = driver.findElements(addToCart);
        if (!buttons.isEmpty()) {
            buttons.get(0).click();
            System.out.println("Add to Cart clicked.");
        } else {
            System.out.println("Add to Cart button not found.");
        }
    }


    public void goToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(goToCart)).click();
    }
    
    
    public void goBackToPreviousPage() {
        driver.navigate().back();
        System.out.println("Navigated back to previous page.");
    }

    public void openReviewTabAndWriteReview(String reviewText) {
        if (!driver.findElements(reviewTab).isEmpty()) {
            driver.findElement(reviewTab).click();
            driver.findElement(writeReviewButton).click();
            driver.findElement(ratingStar).click();
            driver.findElement(reviewTextarea).sendKeys(reviewText);
            driver.findElement(submitReviewButton).click();
            System.out.println("Review submitted successfully.");
        } else {
            System.out.println("Review tab not found.");
        }
    }
    public void verifyCartPageLoaded() {
        if (driver.getCurrentUrl().contains("/cart")) {
            System.out.println("Cart page loaded successfully.");
        } else {
            System.out.println("Cart page not loaded.");
        }
    }


  
}







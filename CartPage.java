package DecathlonProjectTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    WebDriver driver;
    WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    By popup = By.xpath("//button[@id='wzrk-confirm']");
    By addToCartBtn = By.xpath("(//button[text()='ADD TO CART'])[1]");
    By cartIcon = By.xpath("//div[@class='relative']");
    By deleteBtn = By.xpath("//button[contains(@aria-label,'remove item') or contains(@class,'rounded-full')]");
    By popupDeleteConfirm = By.xpath("//button[contains(@class,'border-black') and text()='Delete items']");
    By quantityBox = By.xpath("//div[contains(@class,'border-grey-200')]");
    By price = By.xpath("//p[contains(@class,'text-14')]");

    public void closePopupIfPresent() {
        List<WebElement> popups = driver.findElements(popup);
        if (!popups.isEmpty() && popups.get(0).isDisplayed()) {
            popups.get(0).click();
            System.out.println("Popup closed.");
        } else {
            System.out.println("No popup to close.");
        }
    }


    public void addToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
        System.out.println("Add to cart button clicked.");
    }

    public void openCart() {
        wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
        System.out.println("Cart opened.");
    }

    public void deleteItem() {
        List<WebElement> buttons = driver.findElements(deleteBtn);

        if (!buttons.isEmpty()) {
            buttons.get(0).click();
            System.out.println("Delete button clicked.");
        } else {
            System.out.println("Delete button not found.");
        }
    }



    public void confirmDeletePopup() {
        List<WebElement> confirmButtons = driver.findElements(popupDeleteConfirm);

        if (!confirmButtons.isEmpty()) {
            confirmButtons.get(0).click();
            System.out.println("Clicked delete confirmation.");
        } else {
            System.out.println("No delete confirmation popup found.");
        }
    }


    public void checkPrice() {
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(price));
        if (ele.isDisplayed()) {
            System.out.println("Price is displayed: " + ele.getText());
        } else {
            System.out.println("Price is not displayed.");
        }
    }

    public void adjustQuantity() {
        try {
            WebElement qty = wait.until(ExpectedConditions.elementToBeClickable(quantityBox));
            qty.click();
            System.out.println("Quantity box clicked.");
        } catch (TimeoutException e) {
            System.out.println("Quantity box not found.");
        }
    }
}



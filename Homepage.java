package DecathlonProjectTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

public class Homepage {
    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public Homepage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // ----------- LOCATORS --------------
  
    //By searchBox = By.xpath("//div[@class=\"bg-grey-50 rounded-full\"]");
    By searchBox = By.xpath("//div[@class='bg-grey-50 rounded-full']//input[@type='search']");

    By Bar =By.xpath("//button[@class=\"flex items-center\"]");
    By popupClose = By.xpath("//button[@id='wzrk-confirm']");
    By products = By.xpath("//button[@class='flex items-center']");    
    By logo=By.xpath("//a[@class=\"ml-3 cursor-default md:ml-6 lg:ml-12\"]");
    
    By signIn = By.xpath("//p[text()='Sign In']");
    By myStore = By.xpath("//p[text()='My Store']");
    By support = By.xpath("(//div[@class='relative flex flex-col group'])[3]");
    By wishlist = By.xpath("(//div[@class='relative'])[2]");
    By cart = By.xpath("(//div[@class='relative'])[3]");
    By addToCart = By.xpath("(//button[text()='ADD TO CART'])[3]");




   

    // ----------- MAIN FUNCTIONALITIES ------------
    
   
     
    
    public void closePopupIfVisible() {
        List<WebElement> popups = driver.findElements(popupClose);
        if (!popups.isEmpty() && popups.get(0).isDisplayed()) {
            popups.get(0).click();
            System.out.println("Popup closed.");
        } else {
            System.out.println("No popup found.");
        }
    }
  
    public void clickProducts() {
        wait.until(ExpectedConditions.elementToBeClickable(products)).click();
    }
    public void TriblebarClick() {
    	driver.findElement(Bar).click();
    }
    
    public void Logo() {
    	
    	    WebElement logoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(logo));
    	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", logoElement);
    	    wait.until(ExpectedConditions.elementToBeClickable(logo)).click();
    	    System.out.println("Logo is visible and clicked");
    	

    }
    
    
    public void clickSignIn() {
        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(signIn));
        scrollIntoView(el);
        el.click();
    }

    public void clickMyStore() {
        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(myStore));
       scrollIntoView(el);
        el.click();
    }

    

    private void scrollIntoView(WebElement el) {
		// TODO Auto-generated method stub
		
	}

	public void clickWishlist() {
        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(wishlist));
        scrollIntoView(el);
        el.click();
    }

    public void clickCart() {
        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(cart));
        scrollIntoView(el);
        el.click();
    }
    public void clickAddToCart() {
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
        button.click();
        System.out.println("Add to Cart button clicked");
    }


}


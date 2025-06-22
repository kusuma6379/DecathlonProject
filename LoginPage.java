package DecathlonProjectTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	
	public   LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Unable to signin sucessfully 
	By signin=By.xpath("//p[text()=\"Sign In\"]");
	By Mail=By.xpath("//div[@class=\"tab-button vtmn-typo_text-2 tab-button__selected\"]");
	By MailinputBox=By.xpath("//input[@placeholder=\"Email\"]");
	By NextButton=By.xpath("//button[@id=\"lookup-btn\"]");
    //Successfully signin
    By Signin = By.xpath("//p[text()='Sign In']");
    By phoneTab = By.xpath("//div[@id='input_type_tab2']");
    By phoneInput = By.xpath("//input[@placeholder='Mobile phone number']");
    By nextBtn = By.xpath("//button[@id='lookup-btn']");
    By otpInput = By.xpath("//input[@id='input-0']");
    By submitBtn = By.xpath("//button[@type='submit']");
	    
	//Afterlogin sucessfully popup will come  
	By signupBtn = By.xpath("//button[@id='wzrk-confirm']");
    By noThanksBtn = By.xpath("//span[text()='No thanks' or normalize-space()='No thanks']");
	
  //1 Mail Id Signin Unableto login
    public void loginWithEmail(String email) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Click "Sign In"
        wait.until(ExpectedConditions.elementToBeClickable(signin)).click();
        
        // Click on Email tab (if not already selected)
        wait.until(ExpectedConditions.elementToBeClickable(Mail)).click();
        
        // Enter Email
        wait.until(ExpectedConditions.visibilityOfElementLocated(MailinputBox)).sendKeys(email);
        
        // Click Next
        wait.until(ExpectedConditions.elementToBeClickable(NextButton)).click();
        Thread.sleep(5000);
    }
   
    public void loginWithPhoneNumber() throws InterruptedException {
        // Click Sign In and Phone Number tab
        driver.findElement(signin).click();
        driver.findElement(phoneTab).click();

        // Enter phone number and click NEXT
        driver.findElement(phoneInput).sendKeys("7989292662");
        driver.findElement(nextBtn).click();

        // Wait for OTP input field
        Thread.sleep(2000); // wait briefly for OTP field to appear
        System.out.println("Please enter OTP manually...");

        Thread.sleep(45000); // wait for OTP entry

        // Try to click Submit if enabled
        WebElement submit = driver.findElement(submitBtn);
        if (submit.isEnabled()) {
            submit.click();
            System.out.println("Login submitted.");
        } else {
            System.out.println("Submit button still disabled. Check OTP.");
        }

        Thread.sleep(3000); // final wait for redirection
    }
    
    // 3  After sucessfully login popup handle 
    public void handlePopup(String choice) {
        if (choice.equalsIgnoreCase("signup") && driver.findElements(signupBtn).size() > 0) {
            driver.findElement(signupBtn).click();
            System.out.println("Clicked: Sign me up!");
        } else if (choice.equalsIgnoreCase("nothanks") && driver.findElements(noThanksBtn).size() > 0) {
            driver.findElement(noThanksBtn).click();
            System.out.println("Clicked: No thanks");
        } else {
            System.out.println("Popup not found or invalid input.");
        }
    }


}

package Decathlonproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public void HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Phonenumber
	By signin=By.xpath("//p[text()=\"Sign In\"]");
	By phonenumberselect=By.xpath("//div[@id=\"input_type_tab2\"]");
	By phonenumberEnter=By.xpath("//input[@placeholder=\"Mobile phone number\"]");
	By nextbutton=By.xpath("//button[@id=\"lookup-btn\"]");
	By Otp=By.xpath("//input[@id=\"input-0\"]");
	By Button= By.xpath("//button[@type=\"submit\"]");
	
	
	
	
	//Phone Number 
	public void Siginin() {
		driver.findElement(signin).click();
	}
	public void PhoneNumberSelect() {
		driver.findElement(phonenumberselect).click();
		
	}
	public void PhoneNumberEnter(String PhoneNumber) {
		driver.findElement(phonenumberEnter).sendKeys(PhoneNumber);
		
	}
	public void Next() {
		driver.findElement(nextbutton).click();
	}
	public void OTP(String otp) {
		driver.findElement(Otp).sendKeys(otp);
	}
	public void BUTTON() {
		driver.findElement(Button).click();
		
	}
	
	
	

}

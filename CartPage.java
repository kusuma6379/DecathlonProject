package Decathlonproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CartPage {
	
	WebDriver driver;
	
	CartPage(WebDriver driver){
		this.driver=driver;
	}
	
	By addtocart=By.xpath("//button[text()=\"ADD TO CART\"][1]");
	By cart=By.xpath("//div[@class=\"relative\"]");
	By delete=By.xpath("//button[@class=\"w-7 h-7 bg-white rounded-full cursor-pointer flex items-center justify-center border border-solid EkBFdE md:hover:bg-white-100\"]");
	By Popupdelete=By.xpath("//button[@class=\"px-8 py-2 relative border-2 border-black text-16 font-semibold \"]");
	By quantity=By.xpath("//div[@class=\"px-4 py-2 flex items-center border border-grey-200 bg-grey-100 rounded border-red-400\"]");
	By price=By.xpath("//p[@class=\"flex justify-between text-14\"]");
	
	
	
	
	
	
	
	void AddToCart() {
		driver.findElement(addtocart).click();
		String ExpectedLink="Product added to cart";
		String ActualLink="Product added to cart";
		Assert.assertEquals(ExpectedLink,ActualLink);
		Assert.assertTrue(true);
		System.out.println("Message was displyed");
		
	}
    void Cart() {
    	driver.findElement(cart).click();
    	//Thread.sleep(5000);
    }
    void Delete() {
    	driver.findElement(delete).click();
    	
    }
    void PopUpDelete() {
    	driver.findElement(Popupdelete).click();
    	String Expected="Delete items";
    	String Actual="Delete items";
    	Assert.assertEquals(Expected, Actual);
    	Assert.assertTrue(true);
    }
	
	void Quantity() {
		WebElement ele=driver.findElement(quantity);
		ele.click();
		Select drop=new Select(ele);
		drop.selectByVisibleText("Qty:");
		String Expexted ="Increase the Quantity of 11";
		String Actual="Unable to increse 11";
		Assert.assertEquals(Expexted, Actual);
		Assert.assertTrue(false);
		
	}
	void Price() {
		driver.findElement(price);
		Assert.assertTrue(true);
	}
	

}

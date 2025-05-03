package Decathlonproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver){
		this.driver=driver;
	}
	   //all small varibles no need to take small only but if we take like this we are not confused at that time when means if we create class 
	By logo=By.xpath("//a[@aria-label=\"decathlon logo\"]");
	By search=By.xpath("//span[text()=\"Search for  \"][1]");
	By productsbutton=By.xpath("//button[@class=\"flex items-center\"]");
	By account=By.xpath("//p[text()=\"Account\"]");
	By mystore=By.xpath("//p[text()=\"My Store\"]");
	By support=By.xpath("//div[@class=\"relative flex flex-col group\"][1]");
	By wishlist=By.xpath("//p[text()=\"Wishlist\"]");
	By cart=By.xpath("//div[@class=\"relative\"][1]");
	By women=By.xpath("//img[@alt=\"Women\"]");
	By banners=By.xpath("//img[@loading=\"lazy\"][1]");
	By footer=By.xpath("//div[@class=\"pr-2.5 w-full hidden md:flex items-center\"]");
	By countries=By.xpath("//span[text()=\"Countries\"]");
	
	// each webelement we have to create clasess seperate clasess
	
	
	public void Logo() {
		driver.findElement(logo).click();
		
		
	}
    public  void Searchbar(String Tshirts) {
    	driver.findElement(search).sendKeys(Tshirts);
		
		
	}
    public void Productitems() {
		driver.findElement(productsbutton).click();
		
	}
    public void Account() {
    	driver.findElement(account).click();
		
		
	}
    public void Mystorebutton() {
    	driver.findElement(mystore).click();
		
		
	}
    public void Supportsection() {
    	driver.findElement(support).click();
	
	
    }
    public void Wishlistsection() {
    	driver.findElement(wishlist).click();
    	
    	
    }
    public void cartbutton() {
    	driver.findElement(cart).click();
		
		
	}
    public void WomenProducts() {
    	driver.findElement(women).click();
		
		
	}
    public void Bannerspage() {
    	driver.findElement(banners).click();
    	
    	
    }
    public void Footersection() {
    	driver.findElement(footer).click();
		
		
	}
    public void Countries() {
    	driver.findElement(countries).click();
    	
    	
    }
}

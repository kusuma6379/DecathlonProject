package Decathlonproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductListingPage {
	WebDriver driver;
	 public ProductListingPage(WebDriver driver){
		this.driver=driver;
	}
	By search =By.xpath("class=\"bg-grey-50 rounded-full\"");
	By shirtLocate=By.xpath("//img[@alt=\"Men Full Sleeve Dry Fit Activewear T-Shirt Grey - MH550\"][1]");
	By searchbrand=By.xpath("//div[@class=\"bg-grey-50 rounded-full\"]");
	By Btwin=By.xpath("//img[@alt=\"City Cycle Btwin My Bike - Steel Frame, Single Speed, V-Brakes, Aluminium Rims\"][1]");
	By sortingsearch =By.xpath("class=\"bg-grey-50 rounded-full\"");
	By highertoLowerproduct=By.xpath("//img[@alt=\"Hybrid Cycle Riverside 500 - Disc Brakes, Aluminium Frame, 63mm Suspension\"][1]");
	
	

	
	

	
	public void Search(String Shirts) {
		WebElement Ser=driver.findElement(search);
		Ser.sendKeys(Shirts);
		Ser.click();	
	}
	public void Shirt() {
		driver.findElement(shirtLocate).click();
	}
	public void SearchBrand(String NYAMBA) {
		WebElement Ser=driver.findElement(searchbrand);
		Ser.sendKeys("BTWIN");
		Ser.click();	
	}
	public void BtwinProducts() {
		driver.findElement(Btwin).click();
	}

	public void SortingSearch(String Lowertohigher) {
		WebElement Ser=driver.findElement(sortingsearch);
		Ser.sendKeys(Lowertohigher);
		Ser.click();	
	}
	public void Sorting() {
		driver.findElement( highertoLowerproduct).click();
	}
	
}

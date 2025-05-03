package Decathlonproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ProductDetailsPage4th {
	
	WebDriver driver;
	ProductDetailsPage4th(WebDriver driver){
		this.driver=driver;
	}
	
	By search=By.xpath("//span[text()=\"Search for  \"][1]");
	By watchlocate=By.xpath("//img[@class=\"w-full swiper-lazy mix-blend-multiply\"][1]");
	By reviews=By.xpath("//p[text()=\"This product does not have reviews yet!!\"]");
	By typeReviews=By.xpath("//button[@class=\"flex items-center justify-center LTIpbf  py-3 TCcZvG text-black font-bold border border-black hover:bg-purple-200\"]");
	By star=By.xpath("//div[@class=\"react-rater-star is-active\"][1]");
	By reviewtitle=By.xpath("//input[@id=\"review-title\"]");
	By Textreview=By.xpath("//textarea[@id=\"comment\"]");
	By yes=By.xpath("//div[text()=\"Yes\"]");
	By dropdown=By.xpath("//div[@class=\"css-1dimb5e-singleValue\"]");
	By next=By.xpath("//button[@class=\"SidXVk YZAxdU gktSja md:min-w-[140px] SBnjPW flex items-center justify-center bg-blue-400 text-white cursor-pointer border border-solid gXOSPY transition\"]");
	By email=By.xpath("//input[@id=\"email\"]");
	By firstname=By.xpath("//input[@id=\"first-name\"]");
	By lastname=By.xpath("//input[@id=\"last-name\"]");
	By radiobutton=By.xpath("//input[@id=\"woman\"]");
	By age=By.xpath("//div[@id=\"react-select-5-placeholder\"]");
	By checkbox=By.xpath("//input[@id=\"rules\"]");
	By publishreview=By.xpath("//button[@color=\"brand-blue\"]");
	
	
	
	
	
	
	
	
	void searchbar(String watch) {
		WebElement ser=driver.findElement(search);
		ser.sendKeys(watch);
		ser.click();
		Assert.assertTrue(true);
	}
	void LocateWatch() {
		driver.findElement(watchlocate).click();
	}
	void Reviews() {
		driver.findElement(reviews).click();
		String ExpectedResult="Products reviews are avaliable";
		String ActualResult="This product does not have reviews yet!!";
		if(ExpectedResult.equals(ActualResult)) {
			System.out.println("We can able to see reviews");
		}else {
			System.out.println("We are unable to see reviews");
		 }
		
	}
	void TypeReviews() {
		driver.findElement(typeReviews).click();
		
	}
	void Starts() {
		driver.findElement(star).click();
		String ExpectedResult="Excellent";
		String ActualResult="Excellent";
		Assert.assertEquals(ExpectedResult,ActualResult);
	}
	void ReviewTitle(String ExcellentTitle) {
		driver.findElement(reviewtitle).sendKeys("ExcellentTitle");
	}
	void TextReviews() {
		driver.findElement(Textreview).sendKeys("It was good");
	}
	void YES() {
		driver.findElement(yes).click();
	}
	void Dropdown() {
		WebElement sel =driver.findElement(dropdown);
		sel.click();
		Select drop=new Select(sel);
		drop.selectByVisibleText("1 week or less");
		
	}
	void Next() {
		driver.findElement(next).click();
		
	}
	void Email(String Emailid) {
		driver.findElement(email).sendKeys(Emailid);
	}
	void FirstName(String FName) {
		driver.findElement(firstname).sendKeys(FName);
	}
	void LastName(String LName) {
		driver.findElement(lastname).sendKeys(LName);
	}
	void RadioButton() {
		driver.findElement(radiobutton).click();
		Assert.assertTrue(true);
	}
	void AgeDropdown() {
		WebElement Drop=driver.findElement(age);
		Drop.click();
		Select drop=new Select(Drop);
		drop.selectByVisibleText("Select");
	}
	void CheckBox() {
		driver.findElement(checkbox).click();
	}
	void PublishReview() {
		driver.findElement(publishreview).click();
		String Expected="your review has been successfully posted";
		String Actual="your review has been successfully posted";
		Assert.assertEquals(Expected,Actual);
		System.out.println("Message was displayed");
		
	}
	
	
	
	
	
	

}

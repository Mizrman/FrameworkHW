package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a [@class ='gnav20-logoWhiteBg' and @title ='Verizon Home Page']")
	WebElement logo;
	
	@FindBy(xpath = "//button [@id='gnav20-Why-Verizon-L1' and @class='gnav20-menu-label gnav20-menu-label-button gnav20-haschild']")
	WebElement buttonClick;
	
	@FindBy(id= "gnave20-sing-id-mobile")// Use of id attribute
	WebElement signIn;
	
	@FindBy(xpath = "//a [@id='gnav20-sign-id-list-item-3' and  @class='gnav20-dropdown-list-item']")
	WebElement registerElement;
	
	//Alternative way to write the Web Element
	By forgotYourInfo = By.id("forgotPwdLink");
	
	@FindBy(how = How.XPATH, using ="//a[@id='businessLink' and @class='link-black otpPointer']") //Another way to find web element
	WebElement businessSignIn;
	
	public boolean logoDisplayed() throws InterruptedException {
		Thread.sleep(3000);
		boolean flag = logo.isDisplayed();
		Thread.sleep(3000);
		System.out.println("The logo is displayed: " + flag);
		return flag;
	}
	
	public void clickWhySupportUs() throws InterruptedException {
		Thread.sleep(3000);
		buttonClick.click();
		Thread.sleep(4000);
	}
	
	public void signIn() throws InterruptedException {
		Thread.sleep(3000);
		signIn.click();
		Thread.sleep(4000);
	}
	public void clickRegister() throws InterruptedException {
		Thread.sleep(3000);
		registerElement.click();
		Thread.sleep(4000);
	}
	public void forgotYourInfoClicked() throws InterruptedException {
		Thread.sleep(4000);
		((WebElement) forgotYourInfo).click();
		Thread.sleep(4000);
	}
	
	public void businessSignIn() throws InterruptedException {
		Thread.sleep(4000);
		businessSignIn.click();
		Thread.sleep(4000);
	}
	

}

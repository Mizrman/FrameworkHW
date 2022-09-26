package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass{
	WebDriver driver;
	
	@Test (enabled = true, priority = 1)
	public void logoTest() throws InterruptedException {
		homePage.logoDisplayed();
	}
	
	@Test (enabled = true, priority = 4)
	public void clickWhySupportUsTest() throws InterruptedException {
		homePage.clickWhySupportUs();
	}
	
	@Test (enabled = true, priority = 2)
	public void signInTest() throws InterruptedException {
		homePage.signIn();
	}
	//
	
	@Test (enabled = true, priority = 3)
	public void clickRegisterTest() throws InterruptedException {
		homePage.clickRegister();
	}
	@Test (enabled = true, priority = 5)
	public void forgotYourInfoClickedTest() throws InterruptedException {
		homePage.forgotYourInfoClicked();
	}
	
	@Test (enabled = true, priority = 6)
	public void businessSignInTest() throws InterruptedException {
		homePage.businessSignIn();
	}
	
	@Test (enabled= true, priority = 7)
	public void makeOneTimePaymentTest() {
	driver.findElement(By.xpath("//a [text() ='Make a one-time payment']")).click();
	// This way will be used a lot in order to find elements
		
	}
	
	
}

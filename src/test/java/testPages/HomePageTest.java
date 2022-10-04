package testPages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass{
	
	@Test (enabled = false)
	public void logoTest() throws InterruptedException {
		homePage.logoDisplayed();
	}
	
	@Test (enabled = false)
	public void clickWhySupportUsTest() throws InterruptedException {
		homePage.clickWhySupportUs();
	}
	
	@Test (enabled = false)
	public void signInTest() throws InterruptedException {
		homePage.signIn();
	}
	//
	
	@Test (enabled = false)
	public void clickRegisterTest() throws InterruptedException {
		homePage.clickRegister();
	}
	@Test (enabled = false)
	public void forgotYourInfoClickedTest() throws InterruptedException {
		homePage.forgotYourInfoClicked();
	}
	
	@Test (enabled = false)
	public void businessSignInTest() throws InterruptedException {
		homePage.businessSignIn();
	}
	
	@Test (enabled= false)
	public void makeOneTimePaymentTest() {
	driver.findElement(By.xpath("//a [text() ='Make a one-time payment']")).click();
	// This way will be used a lot in order to find elements
	}
	
	@Test (enabled= false)
	public void searchFieldTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://www.hbo.com/");
		driver.findElement(By.id("page17387-band61927-Header61928-Button-secondary-cta-default")).click();
		Thread.sleep(3000);
		}
	
	@Test (enabled= false)
	public void signInClickTest() throws InterruptedException {
		driver.navigate().to("https://www.hbo.com/");
		driver.findElement(By.id("page17387-band61927-Header61928-Button-secondary-cta-default")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.btn.btn--hbomax.btn-undefined.btn-sm")).click();
		Thread.sleep(4000);
	}
	
	@Test (enabled= false)
	public void searchMoviesTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://www.hbo.com/");
		driver.findElement(By.linkText("MOVIES")).click();
		//WebElement movies= driver.findElement(By.linkText("MOVIES"));
		//movies.click();
		Thread.sleep(3000);
	}
	@Test  (enabled= false)
	public void cssSelectorIdTest() throws InterruptedException {
		driver.navigate().to("https://www.hbo.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div#page17387-band218542-Text218544")).isDisplayed();
		Thread.sleep(5000);
	}
	
	@Test (enabled= false)
	public void cookiesSettingTest () throws InterruptedException {
		driver.navigate().to("https://www.hbo.com/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Cookies Set")).isEnabled();
		Thread.sleep(3000);
	}
	//
	
	
	
}

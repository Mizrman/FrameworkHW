package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.JCommander.Builder;

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
	
	@Test (enabled= false)
	public void isDisplayedTest() throws InterruptedException {
		driver.get("https://www.walgreens.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("icon icon__wag-corner-flag")).isDisplayed();
		Thread.sleep(3000);
	}
	
	@Test (enabled= false)
	public void isEnabledTest() {
	boolean name= driver.findElement(By.xpath("//a[contains(@class,'Button Button--seconda')]")).isEnabled();
		System.out.println("This is the isEnabled Test" + name);
		
	}
	
	@Test (enabled= false)
	public void checkboxSelectedTest() {
		driver.get("https://www.capitalone.com/");
		driver.findElements(By.id("rememberMe")).isSelected();
		//isSelected(); method not working. Please take a look!
	}
	
	@Test (enabled= false)
	public void getTitledTest() {
		System.out.println("The title of this website is: " + driver.getTitle());
		}
	@Test (enabled= false)
	public void getCurrentUrlTest() {
		driver.get("https://www.capitalone.com/");
		driver.findElement(By.id("forgotUnpw")).click();
		System.out.println("The current URL is: " + driver.getCurrentUrl());
		
	}
	
	@Test (enabled= false)
	public void getTextTest() {
		driver.get("https://www.capitalone.com/");
		WebElement name = driver.findElement(By.xpath("//span[text()='Learn & Grow']"));
		System.out.println(name.getText());
	}
	@Test (enabled= false)
	public void getAttributeTest() {
		String value = driver.findElement(By.xpath("//button[@id='gnav20-Why-Verizon-L1']")).getAttribute("id");
		String value1 = driver.findElement(By.xpath("//button[@id='gnav20-Why-Verizon-L1']")).getAttribute("aria-label");
		String value2 = driver.findElement(By.xpath("//button[@id='gnav20-Why-Verizon-L1']")).getAttribute("class");
		System.out.println("Value of attribute id is: " + value);
		System.out.println("The value of aria label is: " + value1);
		System.out.println(value2);
	}
	@Test (enabled= false)
	public void sendKeysTest() throws InterruptedException {
		driver.findElement(By.id("gnav20-search-icon")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("search_box_gnav_input")).sendKeys("iphone 14",Keys.RETURN);
		Thread.sleep(3000);
		driver.findElement(By.id("search_box_one_search_input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("search_box_one_search_input")).sendKeys("Samsung",Keys.RETURN);
}
	@Test (enabled= false)
	public void dimensionTest() {
		Dimension dimesnion = new Dimension(800, 600);
		driver.manage().window().setSize(dimesnion);
		driver.manage().deleteAllCookies();
		driver.get("https://www.hbo.com/");
		System.out.println("Size of the window is: " + driver.manage().window().getSize());
	}
	@Test (enabled= false)
	public void navigateForwardBackTest() {
		driver.navigate().to("https://www.hbo.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	@Test (enabled= false)
	public void dropDownByIndexTest() throws InterruptedException {
		driver.get("https://www.walgreens.com/");
		WebElement dropElement = driver.findElement(By.xpath("//strong[text()='Menu']"));
		Select select1 = new Select(dropElement);
		select1.selectByIndex(5);
		Thread.sleep(4000);
	}
	
	@Test (enabled= false)
	public void dropDownByValueTest() throws InterruptedException {
		driver.get("https://www.walgreens.com/");
		WebElement dropElement = driver.findElement(By.xpath("//strong[text()='Menu']"));
		Select select2 = new Select(dropElement);
		select2.selectByValue("Menu");
		Thread.sleep(4000);
	}
	
	@Test (enabled= false)
	public void dropDownByVisibleTextTest() throws InterruptedException {
		driver.get("https://www.walgreens.com/");
		WebElement dropElement = driver.findElement(By.xpath("//strong[text()='Menu']"));
		Select select3 = new Select(dropElement);
		select3.selectByValue("Same Day Pickup & Delivery");
		Thread.sleep(4000);
	}
	@Test (enabled= false)
	public void mouseHoverOverTest() throws InterruptedException {
		driver.get("https://www.capitalone.com/");
		Actions actions = new Actions(driver);
		WebElement checkingAndSavingsElement = driver.findElement(By.xpath("//span[text()='Checking & Savings']"));
	    actions.moveToElement(checkingAndSavingsElement).build().perform();
		Thread.sleep(4000);
		}
	@Test (enabled=false)
	public void logoTest2() {
		driver.get("https://www.capitalone.com/");
		WebElement logoElement = driver.findElement(By.xpath("//a[@id='unav-l1-logo']"));
		boolean flag = logoElement.isDisplayed();
		Assert.assertTrue(true, "logo is not displayed");
		}
	@Test (enabled=false)
	public void getTitleByAssertTest() {
		String expected = "Capital One Credit Cards, Bank, and Loans - Personal and Business";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected, "The title does not match");
		}
}

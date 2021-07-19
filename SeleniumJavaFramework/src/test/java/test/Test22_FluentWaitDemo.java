package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import pages.DuckDuckGoSearchPageObjects;

public class Test22_FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		test();
	}


	public static void test() throws InterruptedException {

		String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");	 

		WebDriver driver = new FirefoxDriver();

		// Set implicit wait time to wait for elements to appear - if it takes longer than 10 seconds then the test will fail
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// instantiate an DuckDuckGoSearchPageObjects object
		DuckDuckGoSearchPageObjects duckDuckGoSearchPageObjects = new DuckDuckGoSearchPageObjects(driver);

		// go to duck duck go
		driver.get("https://duckduckgo.com/");

		// Enter text in search box
		duckDuckGoSearchPageObjects.setTextInSearchBox("ABCD");

		// Click search button
		duckDuckGoSearchPageObjects.clickSeachButton();

		// Click on the link text for 
		// driver.findElement(By.linkText("ABCD - Cambridgeshire, Peterborough and South Lincolnshire ...")).click();

		// Add Fluent Wait
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement linkElement =  driver.findElement(By.linkText("ABCD - Cambridgeshire, Peterborough and South Lincolnshire ..."));

				if(linkElement.isEnabled()) {
					System.out.println("Element Found!");
				}
				return linkElement;
			}
		});

		element.click();

		Thread.sleep(5000);

		driver.close();


	}
}

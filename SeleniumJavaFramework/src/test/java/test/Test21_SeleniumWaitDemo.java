package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.DuckDuckGoSearchPageObjects;

public class Test21_SeleniumWaitDemo {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		seleniumWaits();
	}
	
	
	public static void seleniumWaits() throws InterruptedException {

		String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");	  

		driver = new FirefoxDriver();
		
		// Set implicit wait time to wait for elements to appear - if it takes longer than 10 seconds then the test will fail
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// instantiate an DuckDuckGoSearchPageObjects object
		DuckDuckGoSearchPageObjects duckDuckGoSearchPageObjects = new DuckDuckGoSearchPageObjects(driver);
		
		// go to duck duck go
		driver.get("https://duckduckgo.com/");
		
		// Enter text in search box
		duckDuckGoSearchPageObjects.setTextInSearchBox("Automation Step by Step");
		
		// Click search button
		duckDuckGoSearchPageObjects.clickSeachButton();
		
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,  20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abddef")));
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
	}
}

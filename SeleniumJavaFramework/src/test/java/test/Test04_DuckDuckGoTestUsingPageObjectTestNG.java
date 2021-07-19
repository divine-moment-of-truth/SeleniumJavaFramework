package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.DuckDuckGoSearchPageObjects;

public class Test04_DuckDuckGoTestUsingPageObjectTestNG {

	WebDriver firefoxDriver = null;
	
	
	@BeforeTest
	public void setUpTest() {
	
		String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
		
		firefoxDriver = new FirefoxDriver();
		
	}
	
	
	@Test
	public void duckDuckGoSearchTest01() throws InterruptedException {
				
		// instantiate an DuckDuckGoSearchPageObjects object
		DuckDuckGoSearchPageObjects duckDuckGoSearchPageObjects = new DuckDuckGoSearchPageObjects(firefoxDriver);
		
		// go to duck duck go
		firefoxDriver.get("https://duckduckgo.com/");
		
		// Enter text in search box
		duckDuckGoSearchPageObjects.setTextInSearchBox("Automation Step by Step");
		
		// Click search button
		duckDuckGoSearchPageObjects.clickSeachButton();
		
		Thread.sleep(5000);
		
	}
	
	
	@AfterTest
	public void tearDownTest() {
				
		// close browser
		firefoxDriver.close();
		
		
	}
	
}

package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.DuckDuckGoSearchPageObjects;

public class Test03_DuckDuckGoTestUsingPageObject {

	static WebDriver firefoxDriver = null;
	
	
	public static void main(String[] args) {
		duckDuckGoSearchTest01();
	}
	
	
	public static void duckDuckGoSearchTest01() {
		
		String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
		
		firefoxDriver = new FirefoxDriver();
		
		// instantiate an DuckDuckGoSearchPageObjects object
		DuckDuckGoSearchPageObjects duckDuckGoSearchPageObjects = new DuckDuckGoSearchPageObjects(firefoxDriver);
		
		// go to duck duck go
		firefoxDriver.get("https://duckduckgo.com/");
		
		// Enter text in search box
		duckDuckGoSearchPageObjects.setTextInSearchBox("Automation Step by Step");
		
		// Click search button
		duckDuckGoSearchPageObjects.clickSeachButton();
		
		// close browser
		firefoxDriver.close();
		
		
	}
	
}

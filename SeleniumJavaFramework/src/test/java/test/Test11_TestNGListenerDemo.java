package test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.DuckDuckGoSearchPageObjects;

@Listeners(listeners.TestNGListeners.class)
public class Test11_TestNGListenerDemo {

	
	@Test
	public void test1() {
		System.out.println("I am in test 1");
	}
	
	
	@Test
	public void test2() {
		System.out.println("I am in test 2");
		
		String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
		
		WebDriver firefoxDriver = new FirefoxDriver();
		
		// instantiate an DuckDuckGoSearchPageObjects object
		DuckDuckGoSearchPageObjects duckDuckGoSearchPageObjects = new DuckDuckGoSearchPageObjects(firefoxDriver);
		
		// go to duck duck go
		firefoxDriver.get("https://duckduckgo.com/");
		
		// Enter text in search box
		duckDuckGoSearchPageObjects.setTextInSearchBox("Automation Step by Step");
		
		// Click search button
		duckDuckGoSearchPageObjects.clickSeachButton();
	}
	
	
	@Test
	public void test3() {
		System.out.println("I am in test 3");
		throw new SkipException("This test is kipped");
	}
}

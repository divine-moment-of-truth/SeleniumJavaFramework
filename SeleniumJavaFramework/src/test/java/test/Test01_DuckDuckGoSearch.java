package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Test01_DuckDuckGoSearch {

	public static void main(String[] args) {
		googlesearch();
	}
	
	public static void googlesearch() {
		
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
		WebDriver firefoxDriver = new FirefoxDriver();
		
		// go to duck duck go
		firefoxDriver.get("https://duckduckgo.com/");
		
		// Enter text in search box
		firefoxDriver.findElement(By.id("search_form_input_homepage")).sendKeys("Automation Step by Step");
		
		// Click search button
		// firefoxDriver.findElement(By.id("search_button_homepage")).click();
		
		// press [enter] key
		firefoxDriver.findElement(By.id("search_button_homepage")).sendKeys(Keys.RETURN);
		
		// Close browser
		firefoxDriver.close();
		
		System.out.println("Test Completed Successfully!");
		
	}
}

package test;

import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.DuckDuckGoSearchPage;

public class Test02_DuckDuckGoSearchPOM {
	
	public static void main(String[] args) {
		
		SearchDuckDuckGo();
		
	}
	
	public static void SearchDuckDuckGo() {
		
		DuckDuckGoSearchPage pageObject = new DuckDuckGoSearchPage();
		
		String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
		
		WebDriver firefoxDriver = new FirefoxDriver();
		
		// go to duck duck go
		firefoxDriver.get("https://duckduckgo.com/");
		
		// Enter text in search box
		pageObject.textbox_searche(firefoxDriver).sendKeys("Automation Step by Step");
		
		// Click search button
		pageObject.button_search(firefoxDriver).click();
		
		// Close browser
		firefoxDriver.close();
	}

			
}

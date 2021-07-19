package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.Status;

public class Test07_DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		
		// Navigate to Duck Duck Go and do a search
		String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.ie.driver", projectPath + "/drivers/iedriver/IEDriverServer.exe");
		
		// Set dersired capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		@SuppressWarnings("deprecation")
		WebDriver ieDriver = new InternetExplorerDriver(caps);
		
				
		// Go to Dudck Duck Go Website
		ieDriver.get("https://duckduckgo.com/");
		
		// Enter search text
		ieDriver.findElement(By.id("search_form_input_homepage")).sendKeys("Automation Step by Step");
		
		// Enter text in search box
		ieDriver.findElement(By.id("search_form_input_homepage")).sendKeys("Automation Step by Step");

		// press [enter] key
		ieDriver.findElement(By.id("search_button_homepage")).sendKeys(Keys.RETURN);

		// Close browser
		ieDriver.close();
		
	}

}

package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test14_TestNGMultiBrowserDemo {

	WebDriver driver = null;
	
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		
		System.out.println("Browser name is:- " + browserName);
		System.out.println("Thread id:- " + Thread.currentThread());
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			String projectPath = System.getProperty("user.dir");	
			System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
			driver = new FirefoxDriver();
			
		} else if(browserName.equalsIgnoreCase("firefox")) {
			
			String projectPath = System.getProperty("user.dir");	
			System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
			driver = new ChromeDriver();
			
		} else if(browserName.equalsIgnoreCase("ie")) {
			
			String projectPath = System.getProperty("user.dir");	
			System.setProperty("webdriver.ie.driver", projectPath + "/drivers/iedriver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}

	}
	


	@Test
	public void test1() throws InterruptedException {
		
		driver.get("https://duckduckgo.com/");
		Thread.sleep(4000);
		
	}

	@AfterTest
	public void teardown() {
		
		// close browser
		driver.close();
		
	}

}

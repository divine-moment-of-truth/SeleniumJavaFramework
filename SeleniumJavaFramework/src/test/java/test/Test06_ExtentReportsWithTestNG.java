package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import config.PropertiesClassFile;

public class Test06_ExtentReportsWithTestNG {

	ExtentReports extent;
	ExtentSparkReporter spark;
	WebDriver driver;
	ExtentTest extentTest1;
	
	public static String browserName = null;

	@BeforeSuite
	public void setup() {
		
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		
	}

	
	@BeforeTest
	public void setupTest() {
		
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		
		String projectPath = System.getProperty("user.dir");
		
		// Get browser from property class
		PropertiesClassFile.getProperties();

		
		if(browserName.equalsIgnoreCase("chome")) {
		
			// Navigate to Duck Duck Go and do a search
			System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			// Navigate to Duck Duck Go and do a search
			System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}

	}
	

	@Test
	public void test1() {

		extentTest1 = extent.createTest("Duck Duck Go search Test").log(Status.PASS, "This is a test to validate the Duck Duck Go search functionality, and it passed!");
		
		// go to duck duck go
		extentTest1.log(Status.INFO, "Starting test Case");					// extent report
		driver.get("https://duckduckgo.com/");
		extentTest1.pass("Navigated to Duck Duck Go");						// extent report

		// Enter text in search box
		driver.findElement(By.id("search_form_input_homepage")).sendKeys("Automation Step by Step");
		extentTest1.pass("Enetered text into search box");					// extent report

		// press [enter] key
		driver.findElement(By.id("search_button_homepage")).sendKeys(Keys.RETURN);
		extentTest1.pass("Pressed keyboard ENTER key");						// extent report

	}

	@Test
	public void test2() {

		extentTest1 = extent.createTest("Duck Duck Go search Test").log(Status.PASS, "This is a test to validate the Duck Duck Go search functionality, and it passed!");
		
		// go to duck duck go
		extentTest1.log(Status.INFO, "Starting test Case");					// extent report
		driver.get("https://duckduckgo.com/");
		extentTest1.pass("Navigated to Duck Duck Go");						// extent report

		// Enter text in search box
		driver.findElement(By.id("search_form_input_homepage")).sendKeys("Automation Step by Step");
		extentTest1.pass("Enetered text into search box");					// extent report

		// press [enter] key
		driver.findElement(By.id("search_button_homepage")).sendKeys(Keys.RETURN);
		extentTest1.pass("Pressed keyboard ENTER key");						// extent report

	}

	
	@Test
	public void test3() {

		extentTest1 = extent.createTest("Duck Duck Go search Test").log(Status.PASS, "This is a test to validate the Duck Duck Go search functionality, and it passed!");
		
		// go to duck duck go
		extentTest1.log(Status.INFO, "Starting test Case");					// extent report
		driver.get("https://duckduckgo.com/");
		extentTest1.pass("Navigated to Duck Duck Go");						// extent report

		// Enter text in search box
		driver.findElement(By.id("search_form_input_homepage")).sendKeys("Automation Step by Step");
		extentTest1.pass("Enetered text into search box");					// extent report

		// press [enter] key
		driver.findElement(By.id("search_button_homepage")).sendKeys(Keys.RETURN);
		extentTest1.pass("Pressed keyboard ENTER key");						// extent report

	}
	@AfterTest
	public void tearDownTest() {

		// Close browser
		driver.close();
		extentTest1.pass("Browser closed");									// extent report

		extentTest1.log(Status.INFO, "Test completed");						// extent report

	}
	
	
	@AfterSuite
	public void tearDown() {

		// Calling flush writes everything to the log file
		extent.flush();
		
	}
	
}

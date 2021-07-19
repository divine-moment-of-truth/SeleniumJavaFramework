package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Test05_ExtentReportsDemoTest {

	private static WebDriver firefoxDriver = null;
	
	
	public static void main(String[] args) {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		
		extent.attachReporter(spark);
		ExtentTest extentTest1 = extent.createTest("Duck Duck Go search Test").log(Status.PASS, "This is a test to validate the Duck Duck Go search functionality, and it passed!");
		
		
		// Navigate to Duck Duck Go and do a search
		String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
		firefoxDriver = new FirefoxDriver();
		
		// go to duck duck go
		extentTest1.log(Status.INFO, "Starting test Case");		// extent report
		firefoxDriver.get("https://duckduckgo.com/");
		extentTest1.pass("Navigated to Duck Duck Go");			// extent report
		
		
		// Enter text in search box
		firefoxDriver.findElement(By.id("search_form_input_homepage")).sendKeys("Automation Step by Step");
		extentTest1.pass("Enetered text into search box");			// extent report
		
		
		// press [enter] key
		firefoxDriver.findElement(By.id("search_button_homepage")).sendKeys(Keys.RETURN);
		extentTest1.pass("Pressed keyboard ENTER key");			// extent report
		
		
		// Close browser
		firefoxDriver.close();
		extentTest1.pass("Browser closed");			// extent report
		
		extentTest1.log(Status.INFO, "Test completed");		// extent report
		
		
		// Calling flush writes everything to the log file
		extent.flush();
		
	}

	
	
}

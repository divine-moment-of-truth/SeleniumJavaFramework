import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		// using Chrome driver
		WebDriverManager.chromedriver().setup();
		WebDriver chromeDriver = new ChromeDriver();

		chromeDriver.get("https://automationstepbystep.com/");

		// Maximize browser window
		chromeDriver.manage().window().maximize();

		// Select Selenium menu option
		WebElement seleniumDropdown = chromeDriver.findElement(By.id("menu-item-89"));
		// seleniumDropdown.click();

		// Hover over Selenium menu option to expose drop down menu
		Actions actions = new Actions(chromeDriver);
		actions.moveToElement(seleniumDropdown).perform();

		Thread.sleep(5);


		// Get list of elements in Selenium drop down menu
		List<WebElement> seleniumMenuOptions = chromeDriver.findElements(By.className("sub-menu"));
		System.out.println(seleniumMenuOptions.size());

		// Click the first element - Intro to Selenium
		actions.moveToElement(seleniumMenuOptions.get(1)).perform();
		Thread.sleep(5);

		for (WebElement el : seleniumMenuOptions)
		{
//			if(el.getText().contains("Introduction"))
//			{
				System.out.println(el.getText());
				actions.moveToElement(el).perform();
				Thread.sleep(5);
				// break;
//			}
		}



		//		chromeDriver.close();
		//		chromeDriver.quit();



		// using FireFox driver
		//		WebDriverManager.firefoxdriver().setup();
		//		WebDriver firefoxDriver = new FirefoxDriver();	
		//		firefoxDriver.get("https://google.com");
		//		WebElement firefoxInputBox = chromeDriver.findElement(By.id("input"));
		//		firefoxInputBox.sendKeys("Automation step by step");
		//		firefoxDriver.close();
		//		firefoxDriver.quit();

	}

}

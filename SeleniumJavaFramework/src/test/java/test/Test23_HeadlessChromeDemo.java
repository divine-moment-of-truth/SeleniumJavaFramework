package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test23_HeadlessChromeDemo {

	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
	
		String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");	 
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1920, 1080");
		
		
		WebDriver driver = new ChromeDriver(options);
		

		driver.get("https://automationstepbystep.com/");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}
	
}

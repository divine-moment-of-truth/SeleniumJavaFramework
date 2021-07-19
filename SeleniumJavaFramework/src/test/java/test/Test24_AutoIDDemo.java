package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test24_AutoIDDemo {

	
	@Test
	public static void test() throws InterruptedException, IOException {
		
		String projectPath = System.getProperty("user.dir");	
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe"); 
		
		WebDriver driver = new FirefoxDriver();
		
		// Go to image upload website
		driver.get("https://andyshort.smugmug.com/getting-started/setup?source=questionnaire");
		
		// Enter email
		driver.findElement(By.name("username")).sendKeys("shortzenhausen@gmail.com");
		
		// Enter password
		driver.findElement(By.name("password")).sendKeys("Dudeegg1977!");
		
		// Click LOG IN button
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div/div/div/div/div/div/div/form/div[4]/button")).click();
					
		Thread.sleep(8000);
		
		//Click 'My own photos GO button
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div/div/div[2]/section[1]/button")).click();
		
		Thread.sleep(8000);
		
		//Click 'Upload Photos or video button
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div/div/div/section/form/div[1]/div[3]/button")).click();
		
		
		// Run AutoIT script to upload file
		Runtime.getRuntime().exec("C:\\Users\\onion\\Documents\\Programming\\Automated Testing\\Selenium - TestNg\\SeleniumJavaFramework\\src\\test\\java\\AutoIT\\FileUploadScript.exe");
		
		Thread.sleep(3000);
		
		// driver.close();
	}
}

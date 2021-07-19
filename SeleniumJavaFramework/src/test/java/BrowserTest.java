import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path - " + projectPath);
		
		// Firefox
		System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver firefoxDriver = new FirefoxDriver();
		firefoxDriver.get("https://www.selenium.dev/");
		firefoxDriver.close();
		firefoxDriver.quit();
		
		
		// Chrome
		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver\\chromedriver.exe");	
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.selenium.dev/");
		chromeDriver.close();
		chromeDriver.quit();
		
		
		// IE
		System.setProperty("webdriver.ie.driver", projectPath + "\\drivers\\iedriver\\IEDriverServer.exe");		
		WebDriver internetExplorerDriver = new InternetExplorerDriver();
		internetExplorerDriver.get("https://www.selenium.dev/");
		internetExplorerDriver.close();
		internetExplorerDriver.quit();
	}
}

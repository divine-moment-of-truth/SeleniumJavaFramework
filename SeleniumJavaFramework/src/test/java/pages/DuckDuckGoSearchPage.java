package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DuckDuckGoSearchPage {

	private static WebElement element = null;
	
	public static WebElement textbox_searche(WebDriver driver) {
		
		element = driver.findElement(By.id("search_form_input_homepage"));
				
		return element;
	}
	
	public static WebElement button_search(WebDriver driver) {
		
		element = driver.findElement(By.id("search_button_homepage"));
		
		return element;
	}
	
}

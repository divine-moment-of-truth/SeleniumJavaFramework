package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DuckDuckGoSearchPageObjects {
	
	WebDriver driver = null;

	By textbox_search = By.id("search_form_input_homepage");
	
	By button_search = By.id("search_button_homepage");
	
	
	public DuckDuckGoSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void setTextInSearchBox(String text) {
		
		driver.findElement(textbox_search).sendKeys(text);
		
	}
	
	
	public void clickSeachButton() {
		
		driver.findElement(button_search).sendKeys((Keys.RETURN));
		
	}
}

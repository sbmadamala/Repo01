import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Search for the Country which provides the Autoselective option
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E000597\\Downloads\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		// Define the Webelement for list, locate the generic locator. Also use
		// findElements
		List<WebElement> options = Driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		// for (Datatype variable: method)
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}

	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Class_01 {

	public static void main(String[] args) {
		// Invoking the browser
		//Chrome- ChromeDriver->Methods
		//Firefox- FirefocDriver ->Methods
		//ChromeDriver driver= new ChromeDriver();
		//Chromedriver.exe->Chrome Browser
		//Webdriver.Chrome.Driver->Value of path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E000597\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		System.out.println (driver.getCurrentUrl());
		//driver.close();
		driver.quit();
		
		
		

	}

}

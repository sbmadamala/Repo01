import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {

		// Login the application and add the items to the cart
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\E000597\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		// Explicit Wait object creation
		WebDriverWait signin = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		// Apply the explicit wait as it is taking more time to load
		signin.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("okayBtn")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();

		driver.findElement(By.xpath("//option[contains(text(),'Consultant')]")).click();
		driver.findElement(By.cssSelector("input[name='terms']")).click();
		// Apply the explicit wait as it is taking more time to load
		signin.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("signInBtn")));

		driver.findElement(By.id("signInBtn")).click();

		signin.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("h4.card-title")));
		List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));
		ArrayList<String> emptyList = new ArrayList<String>();

		for (int i = 0; i < products.size(); i++) {
			String productName = products.get(i).getText();
			emptyList.add(productName);
			signin.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[contains(text(),'"
					+ productName + "')]/../../following-sibling::div/button[@class='btn btn-info']")));
			// xpath- Write the relative path from child to parent and parent to sibling
			driver.findElement(By.xpath("//a[contains(text(),'" + productName
					+ "')]/../../following-sibling::div/button[@class='btn btn-info']")).click();
			driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
		}

	}

}

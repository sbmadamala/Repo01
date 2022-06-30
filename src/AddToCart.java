import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\E000597\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait- Applies for each and every step and hides the performance test
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String[] productnames = { "Cucumber", "Brocolli", "Apple", "Potato" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//Call the method addCart
		addCart(driver, productnames);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		// ccselector- tagname.value
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		//Explicit Wait- Applied for a specific purpose. Click on Apply, displays Applying and change to Apply after few seconds
		//User can define the explicit wait object globally and apply the method in the code wherever applicable
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
	
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	// Create a method outside the execution loop and call in Main
	public static void addCart(WebDriver driver, String[] productnames) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			// format to get the actual veggie name
			String exactproductname = name[0].trim();
			// example- Brocolli - 1 Kg
			// Brocolli- [0]
			// 1 Kg- [1]

			// Convert array to array list at the time of execution.
			List productnamelist = Arrays.asList(productnames);

			if (productnamelist.contains(exactproductname)) {
				j++;
				// Click Add to Cart. User should 'text' locator only when the text is static.
				// In this case, click on "ADD TO CART" button changes to "Added"
				// and the text is again displayed as "ADD TO CART" in 5 seconds. This will
				// mislead the code, when we are using Index.
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// Configure the products length which needs to be added
				if (j == productnames.length) {
					break;
				}
			}

		}

	}

}

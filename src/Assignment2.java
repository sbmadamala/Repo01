import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch the application
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\E000597\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		// Enter the name, email, password and select checkbox
		driver.findElement(By.name("name")).sendKeys("Sowjanya");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("rahulshettyacademy@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("exampleCheck1")).click();
		// Select 2nd option from the static dropdown
		WebElement Staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select Dropdown = new Select(Staticdropdown);
		Dropdown.selectByIndex(1);
		// Select the 1st radio button
		driver.findElement(By.id("inlineRadio1")).click();
		// Verify the radio button is disabled
		System.out.println(driver.findElement(By.cssSelector("input[value='option3']")).isEnabled());
		// Click on Submit Button
		driver.findElement(By.className("btn-success")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("06272022");
	}
}
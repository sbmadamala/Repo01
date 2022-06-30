import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String New_Name = "Satish Babu";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\E000597\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();

		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Driver.findElement(By.id("name")).sendKeys(New_Name);
		Driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		// Teach Selenium about Alert
		System.out.println(Driver.switchTo().alert().getText());
		// Click on OK
		Driver.switchTo().alert().accept();
		Driver.findElement(By.id("name")).sendKeys(New_Name);
		Driver.findElement(By.id("confirmbtn")).click();
		System.out.println(Driver.switchTo().alert().getText());
		// Click on Cancel
		Driver.switchTo().alert().dismiss();

	}

}

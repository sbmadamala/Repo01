import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://rahulshettyacademy.com/AutomationPractice/
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E000597\\Downloads\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("checkBoxOption1")).click();
		//1. Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		System.out.println(Driver.findElement(By.id("checkBoxOption1")).isSelected());
		//Should Return True
		Driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(Driver.findElement(By.id("checkBoxOption1")).isSelected());
		//Should Return False
		//2. How to get the Count of number of check boxes present in the page
		System.out.println(Driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		

	}

}

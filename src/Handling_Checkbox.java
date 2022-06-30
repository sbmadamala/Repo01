import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Handling_Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E000597\\Downloads\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Driver.manage().window().maximize();
		System.out.println(Driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		Assert.assertFalse(Driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		Driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).click();
		System.out.println(Driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		Assert.assertTrue(Driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		//System.out.println(Driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}

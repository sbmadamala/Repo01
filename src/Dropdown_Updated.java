import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dropdown_Updated {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the application, select the drop down, increment no of flight tickets to adults and children
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E000597\\Downloads\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(Driver.findElement(By.id("divpaxinfo")).getText());
		int i=1;
 while(i<5)
	{
		Driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	}
	
 for(int j=1;j<5;j++)
	{
		Driver.findElement(By.id("hrefIncChd")).click();

	}
 		Driver.findElement(By.id("btnclosepaxoption")).click(); 
		
		System.out.println(Driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(Driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult, 4 Child");
	}

}


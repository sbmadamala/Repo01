import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E000597\\Downloads\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			//Driver.findElement(By.xpath("//a[@value='IXB']")).click();
			//Thread.sleep(2000);
		//Use an index for xpath, if same value is present more than once
			//Driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();//if coding sr
		//Select the dropdown value Parent-child traverse- parent xpath space child xpath
		Driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='AMD']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		//if the xpath is given in correct, it displays the error no such element:unable to locate element
		//Select current date in the calendar
		Driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();		
			
	}

}

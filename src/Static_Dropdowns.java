import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E000597\\Downloads\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Driver.manage().window().maximize();
		//Drop down with Select Tag- Static
		WebElement StaticDropdown= Driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select Dropdown= new Select(StaticDropdown);
		Dropdown.selectByIndex(3);
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		Dropdown.selectByValue("AED");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		Dropdown.selectByVisibleText("INR");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
	}

}

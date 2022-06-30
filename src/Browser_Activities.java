import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Activities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E000597\\Downloads\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		//Maximize mode
		Driver.manage().window().maximize();
		//get() will apply default wait to navigate to the URL
		Driver.get("http://google.com/");
		Driver.navigate().to("https://www.amazon.in/");
		//navigate().to() will not have consider default wait to navigate to URL
		Driver.navigate().back();

	}

}

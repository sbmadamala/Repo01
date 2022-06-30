import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Relative_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E000597\\Downloads\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Absolute xpath- /html/body/header /div/button[1]
		//Relative xpath- parent to child and child 1 to siblings(child1, child2....)- //header/div/button[1]/following-sibling::button[1]
		System.out.println(Driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		//traverse from parent to child and child to parent
		//System.out.println(Driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]/parent::div/parent::header/a")).getText());
		
	}

}

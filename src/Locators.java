import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E000597\\Downloads\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Driver.findElement(By.id("inputUsername")).sendKeys("Satish");
		Driver.findElement(By.name("inputPassword")).sendKeys("Welcome");
		Driver.findElement(By.className("signInBtn")).click();
		//CSS Selector- tagname is optional
		//For id->tagname#id
		//For Classname->tagname.classname
		//Generic syntax where attributes are not defined- Tagname[attribute='value']
		System.out.println(Driver.findElement(By.cssSelector("p.error")).getText());
		Driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Satish");
		Driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Satish@sa.com");
		//Driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		//multiple elements matching, use Index
		Driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("999999999");
		//Hidden Attributes while indexing for css selector
		Driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).clear();
		//Usage of Tags for xpath when there are no attributes-//parenttagname/childtagname[Index]
		Driver.findElement(By.xpath("//form/input[3]")).sendKeys("999999999");
		//Tagname is not required
			Driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//Usage of Tags for cssSelection when there are no attributes-parenttagname childtagname
		System.out.println(Driver.findElement(By.cssSelector("form p")).getText());
		//CLick on Go to Login button
		Driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		Driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Satish");
		//Regular Expressions for password
		Driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Driver.findElement(By.id("chkboxOne")).click();
		Driver.findElement(By.cssSelector("#chkboxTwo")).click();
		//Regular Expression with contains for xpath, when submit button label changes
		Driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		//Regular expression and tag for Signin Button
		
				
		
	}

}
	
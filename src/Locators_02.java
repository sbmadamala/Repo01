import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.junit.Assert;

public class Locators_02 {

	//@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String Name= "Satish";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E000597\\Downloads\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Return value is stored in password. So create a variable with that return variable
		String password= getpassword(Driver);
		Driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Driver.findElement(By.id("inputUsername")).sendKeys(Name);
		Driver.findElement(By.name("inputPassword")).sendKeys(password);
		Driver.findElement(By.className("signInBtn")).click();	
		Thread.sleep(1000);
		System.out.println(Driver.findElement(By.tagName("p")).getText());
		String expMessage=Driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(expMessage,"You are successfully logged in.");
		Assert.assertEquals(Driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+Name+",");
		//xpath by text on the button
		Driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		//Replace button with *, if it is unique 
		//Driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		Driver.close();
	}
	//Create a method to store the password and call in the main for execution
	public static String getpassword(WebDriver Driver) throws InterruptedException
	{
		Driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		Driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String Passwordtext= Driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] getthepassword= Passwordtext.split("'");
		//0th index Please use temporary password 
		//1st index rahulshettyacademy' to Login.
		//String[] password= getthepassword[1].split("'");
		//password[0];
		String password= getthepassword[1].split("'")[0];
		return password;
		//0th index rahulshettyacademy 
		//1st index to Login.
		//Below code give the same output as String[] getthepassword2= getthepassword[].split("'"); getthepassword2[0];
		//getthepassword[].split("'")[0];
		}

}

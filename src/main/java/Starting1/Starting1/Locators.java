package Starting1.Starting1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class Locators {

	public static void main(String[] args) {
	
		String name = "rahul";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\G MAHESH\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sso.teachable.com/secure/9521/identity/login");
		driver.findElement(By.id("email")).sendKeys("rahul");
		driver.findElement(By.name("password")).sendKeys("hello123");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class*='bodySmall m-b-3-xs text-center-xs auth-flash-error']")).getText());
		//driver.findElement(By.cssSelector("//div/a")).click();
		//Assert.assertEquals(driver.findElement(By.cssSelector("div[class*='bodySmall m-b-3-xs text-center-xs auth-flash-error']")).getText(), "Your email or password is incorrect.");
		//Assert.assertEquals(driver.findElement(By.xpath("//div/h3")).getText(), "login");
		
		
		
	}

}

package Starting1.Starting1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\G MAHESH\\OneDrive\\Documents\\Paths\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		a.moveToElement(driver.findElement(By.cssSelector("form[id='nav-search-bar-form']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		a.moveToElement(move).contextClick().build().perform();
		
		
		
		
	}

}

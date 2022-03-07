package Starting1.Starting1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parenttochildtosiblings {

	public static void main(String[] args) {
		// Parent to child to sibling traverse
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\G MAHESH\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

		System.out.println(driver.findElement(By.xpath("//header/div/button/parent::div/button[2]")).getText());
		
	}

}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocatorPractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement usernameTF = driver.findElement(By.id("email"));
		WebElement pwdTF = driver.findElement(By.id("pass"));
		
		usernameTF.sendKeys("686956565465456151222");
		pwdTF.sendKeys("5465454523");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}

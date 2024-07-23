package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		System.out.println(createAccount.getCssValue("background-color"));
		System.out.println(createAccount.getCssValue("color"));
		System.out.println(createAccount.getCssValue("font"));
		driver.quit();
	}

}

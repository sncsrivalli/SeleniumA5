package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions
					.elementToBeClickable(driver.findElement(By.xpath("(//button[text()='Get Started'])[1]"))))
					.click();
			System.out.println("Element Enabled");
		} catch (TimeoutException e) {
			System.out.println("Element Disabled");
		}
		
		driver.quit();
	}
}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartScenario_CSS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("WALLETS");
		driver.findElement(By.cssSelector("button._2iLD__")).click();
		Thread.sleep(2000);
		String header = driver.findElement(By.cssSelector("span.BUOuZu")).getText();
		System.out.println(header);
		if(header.contains("WALLETS"))
			System.out.println("Test pass");
		else
			System.out.println("Test fail");
		
		driver.quit();
		
	}

}

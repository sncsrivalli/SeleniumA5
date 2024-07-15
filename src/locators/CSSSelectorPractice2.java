package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorPractice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("fuyfiuygugihikhjk");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("gjhvhjbjmjbn");
		driver.findElement(By.cssSelector("button[value='1']")).click();
		
		Thread.sleep(3000);
		String message = driver.findElement(By.cssSelector("div._9ay7")).getText();
		System.out.println(message);
		driver.quit();
	}

}

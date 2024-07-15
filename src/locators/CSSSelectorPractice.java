package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#gh-ac")).sendKeys("watches");
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		Thread.sleep(3000);
		String header = driver.findElement(By.cssSelector("h1.srp-controls__count-heading"))
																				.getText();
		if(header.contains("watches"))
			System.out.println("Test Pass");
		else
			System.out.println("Test Fail");
		
		driver.quit();
	}

}

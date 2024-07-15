package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributes1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"))
																	.sendKeys("IFB washing machine");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String header = driver.findElement(By.xpath("//span[@class='BUOuZu']")).getText();
		
		if(header.contains("IFB washing machine"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		driver.quit();
	}

}

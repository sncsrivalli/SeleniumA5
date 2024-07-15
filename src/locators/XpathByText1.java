package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt=\"restaurants curated for biryani\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Pista House']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Extra ₹20 Off']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[text()='Additional Rs 20 off on this order']"))
						.getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label=\"Close\"]")).click();
		
		driver.quit();
	}

}

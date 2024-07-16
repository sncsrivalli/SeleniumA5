package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentDependentXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.id("gh-ac")).sendKeys("soft toys");
		driver.findElement(By.id("gh-btn")).click();
		
		String toy_name = driver.findElement(By.xpath("//span[text()='Shiny Gyarados Plush Doll Soft Toy Stuffed Animal Teddy 23\"']")).getText();
		String price = driver.findElement(By.xpath("//span[text()='Shiny Gyarados Plush Doll Soft Toy Stuffed Animal Teddy 23\"']/../../../div/div/div/span[@class=\"s-item__price\"]")).getText();
		
		System.out.println(toy_name);
		System.out.println(price);
		
		driver.quit();
	}

}

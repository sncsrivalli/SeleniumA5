package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextGetTagNameGetAttribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement signInBTN = driver.findElement(By.xpath("//button[text()='Sign in']"));
		System.out.println(signInBTN.getText());
		System.out.println(signInBTN.getTagName());
		System.out.println(signInBTN.getAttribute("aria-label"));
		
		driver.quit();
	}

}

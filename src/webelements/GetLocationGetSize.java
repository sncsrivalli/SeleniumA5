package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationGetSize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement seleniumWebdriver = driver.findElement(By.cssSelector("svg#selenium_webdriver"));
		Point point = seleniumWebdriver.getLocation();
		System.out.println(point);
		System.out.println("X: " + point.getX() + "\tY: " + point.getY());

		Dimension dimension = seleniumWebdriver.getSize();
		System.out.println(dimension);
		System.out.println("Height: " + dimension.getHeight() + "\tWidth: " + dimension.getWidth());

		driver.quit();
	}

}

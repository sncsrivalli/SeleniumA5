package webdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeAndPositionOfWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		Dimension dimension = driver.manage().window().getSize();
		Point point = driver.manage().window().getPosition();
		
		System.out.println("Dimensions: "+ dimension);
		System.out.println("Position: "+ point);
		
		driver.quit();
	}

}

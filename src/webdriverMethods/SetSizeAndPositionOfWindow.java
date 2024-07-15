package webdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeAndPositionOfWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		Dimension dimension = new Dimension(1300, 900);
		driver.manage().window().setSize(dimension);
		Thread.sleep(3000);
		Point point = new Point(100,100);
		driver.manage().window().setPosition(point);
		
		Thread.sleep(3000);
		driver.quit();
	}

}

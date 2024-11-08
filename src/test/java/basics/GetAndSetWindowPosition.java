package basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndSetWindowPosition {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Point actualPosition = driver.manage().window().getPosition();
		System.out.println("X: "+ actualPosition.getX());
		System.out.println("Y: "+ actualPosition.getY());
		
		Thread.sleep(3000);
		Point point = new Point(1000, 500);
		driver.manage().window().setPosition(point);
		
		Thread.sleep(3000);
		driver.quit();
	}

}

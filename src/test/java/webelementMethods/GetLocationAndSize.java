package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationAndSize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement logo = driver.findElement(By.cssSelector("svg.octicon-mark-github"));

//		Dimension dimension = logo.getSize();
//		int height = dimension.getHeight();
//		int width = dimension.getWidth();
//
//		System.out.println("Height: " + height + "\nWidth: " + width);
//		
//		Point point = logo.getLocation();
//		int x = point.getX();
//		int y = point.getY();
//		
//		System.out.println("x axes: " + x + "\ny axes: " + y);
		
		Rectangle r = logo.getRect();
		int height = r.getHeight();
		int width = r.getWidth();

		System.out.println("Height: " + height + "\nWidth: " + width);
		
		int x = r.getX();
		int y = r.getY();
		
		System.out.println("x axes: " + x + "\ny axes: " + y);
			
		driver.quit();
	}

}

package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndSetWindowDimensions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Dimension actualDimension = driver.manage().window().getSize();
		System.out.println("Height: "+ actualDimension.getHeight());
		System.out.println("Width: "+ actualDimension.getWidth());
		
		Thread.sleep(2000);
		Dimension dimension = new Dimension(1300, 700);
		driver.manage().window().setSize(dimension);
		Thread.sleep(2000);
		
		driver.quit();
	}

}

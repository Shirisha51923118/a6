package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		System.out.println(driver.getTitle());
		System.out.println("------------------------------------------");
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		System.out.println("------------------------------------------");
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		System.out.println("------------------------------------------");
		Thread.sleep(2000);
		driver.close();
		
		Thread.sleep(2000);
		driver.quit();
	}

}

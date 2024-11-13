package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowhandleAndGetWindowhandles {

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
		
		System.out.println("Current window address: "+ driver.getWindowHandle());
		System.out.println("All window addresses: "+ driver.getWindowHandles());
		
		for (String s : driver.getWindowHandles()) {
			driver.switchTo().window(s);
			if(driver.getTitle().contains("GitHub")) {				
				driver.close();
				break;
			}
		}

		System.out.println("All window addresses: "+ driver.getWindowHandles());
		
		Thread.sleep(3000);
		driver.quit();
	}

}

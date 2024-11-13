package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@data-analytics-event,'try_copilot_button')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Get started with')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'free trial')]")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}

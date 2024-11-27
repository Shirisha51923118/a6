package handlingUIElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.switchTo().frame(0);
		
		//driver.switchTo().frame("callout");
		WebElement iframe = driver.findElement(By.name("callout"));
		
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.name("q")).sendKeys("Microsoft" + Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		
	}

}

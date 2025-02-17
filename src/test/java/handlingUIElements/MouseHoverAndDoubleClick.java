package handlingUIElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAndDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement coursetab = driver.findElement(By.id("course"));
		Actions action = new Actions(driver);
		action.moveToElement(coursetab).perform();
		
		driver.findElement(By.xpath("//span/a[text()='Java']")).click();
		WebElement plusBTN = driver.findElement(By.id("add"));
		action.doubleClick(plusBTN).perform();
		
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();
	}

}

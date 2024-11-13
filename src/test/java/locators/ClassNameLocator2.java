package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.className("Pke_EE")).sendKeys("mobiles");
		driver.findElement(By.className("_2iLD__")).click();
		Thread.sleep(2000);
		List<WebElement> mobiles = driver.findElements(By.className("KzDlHZ"));
		Thread.sleep(2000);
		for (WebElement e : mobiles) {
			System.out.println(e.getText());
		}		
		Thread.sleep(2000);
		driver.quit();
	}

}

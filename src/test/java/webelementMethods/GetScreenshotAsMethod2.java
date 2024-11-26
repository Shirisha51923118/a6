package webelementMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshotAsMethod2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement zomato = driver.findElement(By.xpath("//img[contains(@src,'963036be03420f1bbc0c94f6f7991b8e1587804874.jpeg')]"));
		File temp = zomato.getScreenshotAs(OutputType.FILE);
		File perm = new File("./Screenshots/zomato.png");
		FileUtils.copyFile(temp, perm);
		
		Thread.sleep(2000);
		driver.quit();
	}

}

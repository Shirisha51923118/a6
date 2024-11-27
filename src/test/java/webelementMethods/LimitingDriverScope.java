package webelementMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingDriverScope {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement gettingStartedSection = driver.findElement(By.cssSelector("section.td-box--gradient.pt-3"));
		List<WebElement> headers = gettingStartedSection.findElements(By.tagName("h4"));
		for (WebElement e : headers) {
			System.out.println(e.getText());
		}
		
		driver.quit();
	}

}

package handlingUIElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(dropdown);
		s.selectByIndex(10);
		Thread.sleep(2000);
		s.selectByValue("search-alias=computers");
		Thread.sleep(2000);
		s.selectByVisibleText("Gift Cards");
		Thread.sleep(2000);
		
		if(s.isMultiple())
			System.out.println("Multi Select");
		else
			System.out.println("Single Select");
		
		List<WebElement> options = s.getOptions();
		for (WebElement e : options) {
			System.out.println(e.getText());
		}
		
		driver.quit();
	}

}

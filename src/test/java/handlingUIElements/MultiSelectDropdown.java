package handlingUIElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		Select s = new Select(dropdown);
		s.selectByIndex(0);
		s.selectByValue("99");
		s.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		Thread.sleep(2000);
		List<WebElement> options = s.getOptions();
		System.out.println("*********** All Options ******************");
		for (WebElement e : options) {
			System.out.println(e.getText());
		}
		Thread.sleep(2000);
		System.out.println("\n************ Selected Options ***************");
		List<WebElement> selectedOptions = s.getAllSelectedOptions();
		for (WebElement e : selectedOptions) {
			System.out.println(e.getText());
		}
		System.out.println("\nFirst Selected Option: " + s.getFirstSelectedOption().getText());
		if(s.isMultiple()) {
			System.out.println("\nMulti Select");
			s.deselectByIndex(0);
			Thread.sleep(2000);
			s.deselectByValue("99");
			Thread.sleep(2000);
			s.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
		}
		else
			System.out.println("Single Select");
		
		Thread.sleep(2000);
		driver.quit();
	}

}

package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAttributeTagNameCssValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginBTN = driver.findElement(By.name("login"));
		System.out.println(loginBTN.getText());
		System.out.println(loginBTN.getTagName());
		System.out.println(loginBTN.getAttribute("type"));
		System.out.println(loginBTN.getCssValue("font"));
		System.out.println(loginBTN.getCssValue("background-color"));
		System.out.println(loginBTN.getCssValue("color"));
		
		driver.quit();
	}

}

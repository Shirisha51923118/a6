package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement logo = driver.findElement(By.className("fb_logo"));
		if(logo.isDisplayed())
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		if(createAccount.isEnabled())
			createAccount.click();
		else
			System.out.println("Disabled");
		
		WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
		female.click();
		if(female.isSelected())
			System.out.println("Selected");
		else
			System.out.println("Not Selected");
		
		driver.quit();
	}

}

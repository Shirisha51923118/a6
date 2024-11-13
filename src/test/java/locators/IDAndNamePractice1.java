package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDAndNamePractice1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement searchTF = driver.findElement(By.name("field-keywords"));
		searchTF.sendKeys("goggles");
		WebElement searchBTN = driver.findElement(By.id("nav-search-submit-button"));
		searchBTN.click();
		
		if(driver.getTitle().contains("goggles"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		driver.quit();
	}

}

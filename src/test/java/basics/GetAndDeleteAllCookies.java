package basics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndDeleteAllCookies {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.netflix.com/in/");
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName()+"\t"+cookie.getDomain()+"\t"+cookie.getExpiry());
		}
		
		driver.manage().deleteAllCookies();
		Set<Cookie> cookiesAfterDelete = driver.manage().getCookies();
		System.out.println("*********** After cookie deletion **************");
		for (Cookie cookie : cookiesAfterDelete) {
			System.out.println(cookie.getName()+"\t"+cookie.getDomain()+"\t"+cookie.getExpiry());
		}
		
		driver.quit();

	}

}

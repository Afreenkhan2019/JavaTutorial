package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afreen.khan\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start']button"));
		
		//Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).
				
		
		
//		Wait wait = new FluentWait(WebDriver reference)
//				.withTimeout(timeout, SECONDS)
//				.pollingEvery(timeout, SECONDS)
//				.ignoring(Exception.class);
//				 
//				WebElement foo=wait.until(new Function<WebDriver, WebElement>() {
//				public WebElement applyy(WebDriver driver) {
//				return driver.findElement(By.id("foo"));
//				}
//				});
		
		
		
	}

}

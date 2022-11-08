package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afreen.khan\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.findElement(By.xpath("//input[@id='form-field-travel_from']")).sendKeys("aaaaaaa");
		//Select a date of April 14
		Thread.sleep(3000);
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
//		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#form-field-travel_comp_date")))).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).isEnabled());
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")))).click();
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		//driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
//		List<WebElement> dates= driver.findElements(By.className("flatpickr-day"));
//		
	}

}

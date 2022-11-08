package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afreen.khan\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Limting WedDriver scope
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//limiting scope to first column
		WebElement column=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());
		
		//Clicking Each link in a particular column
		for(int i=1; i<column.findElements(By.tagName("a")).size(); i++) {
			
			String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);			
			
			column.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
		}
			Thread.sleep(5000);
			Set<String> win= driver.getWindowHandles();
			Iterator<String> it= win.iterator();
			
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		
		
	

}

}

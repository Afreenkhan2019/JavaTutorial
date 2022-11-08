package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afreen.khan\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Set<String> windows= driver.getWindowHandles();
		

		
		Iterator<String> it = windows.iterator();
		String patent= it.next();
		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		driver.switchTo().window(patent);
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).getText());
		
		
//		//System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
//				
//		
//		Set<String> windowss= driver.getWindowHandles();		
//		Iterator<String> itt = windowss.iterator();
//		String child= itt.next();
//		String subChild= itt.next();
//		driver.switchTo().window(subChild);
//		//System.out.println(driver.getTitle());
//		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
//		driver.switchTo().window(child);
//		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).getText());
//	
//		driver.switchTo().defaultContent();
//		
	}

}

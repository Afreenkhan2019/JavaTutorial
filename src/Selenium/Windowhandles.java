package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afreen.khan\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		//collecting information of window in a set
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parentId= it.next();
		String childId= it.next();
		
		driver.switchTo().window(childId); 

		System.out.println(driver.getTitle());
		 driver.findElement(By.cssSelector(".im-para.red")).getText();
		 String test= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1];
		 String eMail= test.trim().split(" ")[0];
		 System.out.println(eMail);
		 
		 driver.switchTo().window(parentId);
		 
		 System.out.println(driver.getTitle());
		 driver.findElement(By.cssSelector("#username")).sendKeys(eMail);
		 
		 
	}

}

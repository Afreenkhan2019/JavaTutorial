package Selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afreen.khan\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		System.out.println("Url Loaded in maximized window");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Afreen Khan");
		driver.findElement(By.name("inputPassword")).sendKeys("TestTest");
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("AfreenKhan");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("teacascasc@acb.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("teacascasc@acb.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("989898989");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("AfreenKhan");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		/*
		 * CssSelector:
		 * ClassName ===->tagname.classname.
		 * Id ==->tagname#id
		 * Tagname[attribute='value']--=>input[placeholder='Username']--> for username
		 * Tagname[attribute='value']:nth-child(index).- Child items
		 * parent child name
		 * 
		 * 
		 * 
		 */
		
		/*
		 * Linked Text:
		 * 
		 */
		/*
		 * XPath:
		 *    //tagname[@attribute='value']
		 */
		
		//driver.quit();

	}

}

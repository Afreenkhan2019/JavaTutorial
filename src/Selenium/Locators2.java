package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name= "AfreenKhan";
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afreen.khan\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//getPassword(driver);
		Locators2 p = new Locators2();
		String pwd= p.getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		System.out.println("Url Loaded in maximized window");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(pwd);
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello "+name+",");
				
		driver.findElement(By.cssSelector("button[class='logout-btn']")).click();
		//Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector("div[class='overlay-panel overlay-right'] p")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='overlay-panel overlay-right'] p")).getText(),
				"An Academy to Learn Earn & Shine in your QA Career");
		
	}

	public  String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String Text =driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] firstString=Text.split("'");
		String password= firstString[1].split("'")[0];
		return password;
		
		
		
		
		
		
	}
}

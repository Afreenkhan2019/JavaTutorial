package Selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Synchroniation {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\afreen.khan\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Expected Array for making a shopping bucket
		
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));	
		driver.manage().window().maximize();
		//Dynamic shopping bucket
		String[] bucket= {"Cucumber","Brocolli","Beans","Tomato"};
		
//		Synchroniation s= new Synchroniation();//Creation of object
//		s.addItem(driver, bucket);
		addItem(driver,bucket);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		
			
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
		
		
		driver.findElement(By.cssSelector("span[class='promoInfo']")).getText();
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
	}
	 
	
	public static void addItem(WebDriver driver,String[] bucket) 
	{
		int j=0;
		List<WebElement> prod=driver.findElements(By.xpath("//h4[@class='product-name']"));
		//System.out.println(prod.size());
		for(int i=0;i<prod.size();i++) 
		{						
			String[] name=prod.get(i).getText().split("-");
			String formattedString=name[0].trim();
			List abuccket=Arrays.asList(bucket);  //Convert Array to List
			
			if(abuccket.contains(formattedString)) 
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//Thread.sleep(5000);
				if(j==bucket.length) 
				{
					break;
				}
			}
		}
	}

}

package Selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\afreen.khan\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Expected Array for making a shopping bucket
		
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//Dynamic shopping bucket
		String[] bucket= {"Cucumber","Brocolli","Beans","Tomato"};
		int j=0;
		List<WebElement> prod=driver.findElements(By.xpath("//h4[@class='product-name']"));
		//System.out.println(prod.size());
		for(int i=0;i<prod.size();i++) 
		{						
			String[] name=prod.get(i).getText().split("-");
			String formattedString=name[0].trim();
			List abuccket=Arrays.asList(bucket);
			
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

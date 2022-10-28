package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//For Chrome browser	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\afreen.khan\\Documents\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

		//For Fireofox browser
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\afreen.khan\\Documents\\Driver\\geckodriver.exe");
//			System.setProperty("webdriver.gecko.driver", "/Users/afreen.khan/Documents/Driver/geckodriver.exe");
//			WebDriver driver1 = new FirefoxDriver();
			
		//For Edge browser	
//			System.setProperty("webdriver.edge.driver", "C:\\Users\\afreen.khan\\Documents\\Driver\\msedgedriver.exe");
//			//System.setProperty("webdriver.gecko.driver", "/Users/afreen.khan/Documents/Driver/geckodriver.exe");
//			WebDriver driver2 = new EdgeDriver();	
			
			
			String url= "https://rahulshettyacademy.com";
			driver.get(url);
			System.out.println("Browser Opened url "+ url);
			System.out.println(driver.getCurrentUrl() );
			System.out.println(driver.getTitle());
			
			driver.quit();
		}
	

}

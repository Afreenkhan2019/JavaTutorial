package Selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAssignmnent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afreen.khan\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise");
		driver.manage().window().maximize();
		
		LoginAssignmnent la= new LoginAssignmnent();
		la.Login(driver, "rahulshettyacademy", "learning");
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a.nav-link.btn.btn-primary")));
		
		List<WebElement> cartItem= driver.findElements(By.cssSelector(".card-title"));
		System.out.println(cartItem.size());
				
		for(int i=0; i<cartItem.size(); i++) {
			
						
				driver.findElements(By.xpath("//i[@class='zmdi zmdi-shopping-cart']")).get(i).click();
			
		}
		
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
	}

	
	public void Login(WebDriver driver, String name,String pwd) {		
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(3));
		driver.findElement(By.cssSelector("#username")).sendKeys(name);
		driver.findElement(By.cssSelector("#password")).sendKeys(pwd);
		driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();
		
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#okayBtn"))));
		
		driver.findElement(By.cssSelector("#okayBtn")).click();
		WebElement ddl= driver.findElement(By.cssSelector("select.form-control"));
		
		Select consultantDropdown= new Select(ddl);		
		consultantDropdown.selectByIndex(0);		
		driver.findElement(By.cssSelector("input[name='terms']")).click();		
		driver.findElement(By.xpath("//input[@name='signin']")).click();
	}
}

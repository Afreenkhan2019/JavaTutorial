package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afreen.khan\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@type='checkbox'][@id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@type='checkbox'][@id='checkBoxOption1']")).click();
	
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());	
	
	}

}

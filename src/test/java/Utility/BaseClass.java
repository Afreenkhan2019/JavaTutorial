package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import Pages.AppointmentConfirmationPage;
import Pages.HomePageCuraOne;
import Pages.LoginPageCuraOne;
import Pages.MakeAppointmentPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+
				"\\src\\test\\java\\Resources\\GlobalData.properties");
		prop.load(fis);
		String browseName = prop.getProperty("browser");
		
		initBrowser(browseName);
		goTo();
		initDriver(driver);
	
	}
	
	
	
	public HomePageCuraOne homePage;
	public LoginPageCuraOne loginpage;
	public MakeAppointmentPage makeAppointmentPage;
	public AppointmentConfirmationPage aptConfirmationPage;
	
	public void initDriver(WebDriver driver) 
	{
		homePage = new HomePageCuraOne(driver);
		loginpage= new LoginPageCuraOne(driver);
		makeAppointmentPage= new MakeAppointmentPage(driver);
		aptConfirmationPage= new AppointmentConfirmationPage(driver);
	}
	
	
	
	public void initBrowser(String browseName) {
		
		if(browseName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
		}
		else if(browseName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		else if(browseName.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		
	}
	
	public void goTo() {
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	public String getScreenshot(String testCaseName,WebDriver driver) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//"+ "testCaseName"+ ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//"+ "testCaseName"+ ".png";		
	}
	
}



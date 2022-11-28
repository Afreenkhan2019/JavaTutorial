package DemoFramework.TestFramew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.reporters.TestHTMLReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Constants;

public class BaseTest {

	public static WebDriver driver;
	public ExtentSparkReporter  htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;

	@BeforeTest
	public void beforeTestMethod() {
		htmlReporter= new ExtentSparkReporter(System.getProperty("user.dir")+File.separator+"reports"+File.separator+ "AutomationReport.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automatio Report");
		htmlReporter.config().setReportName("Autoamtion Test results");
		htmlReporter.config().setTheme(Theme.DARK);
		extent= new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Automation tester", "Afreen Khan");
	
	
	}
//	public void launchBrowser() throws IOException
//	{
//		Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+
//				"\\src\\test\\java\\Resources\\GlobalData.properties");
//		prop.load(fis);
//		String browseName = prop.getProperty("browser");
//		
//		initBrowser(browseName);
	
	
	@BeforeMethod
	@Parameters(value= {"browserName"})
	public void beforeMethodMethod(String browserName, Method testmethod) throws IOException {
		//Reporting
		logger= extent.createTest(testmethod.getName());
		
//		Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+
//				"\\src\\main\\java\\Resources\\GlobalData.properties");
//		prop.load(fis);
//		 browserName = prop.getProperty("browser");
		//Driver
		initBrowser(browserName);
		
		driver.manage().window().maximize();
		driver.get(Constants.url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void afterMethodMethod(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
			String methodName=result.getMethod().getMethodName();
			String logText= "Test Case: "+methodName + " Passed";
			Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			logger.log(Status.PASS, m);			 
		}
		if(result.getStatus()==ITestResult.FAILURE) {
			String methodName=result.getMethod().getMethodName();
			String logText= "Test Case: "+methodName + " Failed";
			Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
			logger.log(Status.FAIL, m);			 
		}
	
		
		driver.quit();
	}

	@AfterTest
	public void afterTestMethod() {

		extent.flush();
	}

	public void initBrowser(String browserName) {

//		if (browseName.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//
//		} else if (browseName.equalsIgnoreCase("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		} else if (browseName.equalsIgnoreCase("Edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		}
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"drivers"+File.separator+ "chromedriver");
			driver= new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"drivers"+File.separator+ "geckodriver");
			driver= new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"drivers"+File.separator+ "chromedriver");
			driver= new ChromeDriver();
		}
			
	}
}

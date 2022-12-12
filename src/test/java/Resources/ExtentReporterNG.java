package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

//	public static ExtentReports getReportObject()
//	{
//		String path = System.getProperty("user.dir")+"\\reports\\intex.html";
//		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
//		reporter.config().setReportName("Web Autoamtion Result");  // sets name of the report
//		reporter.config().setDocumentTitle("Test Results");     // sets name of tab
//		
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(reporter);
//		extent.setSystemInfo("QA", "Afreen Khan");
//		//extent.createTest(path);    //this code will go in listner class (start test)
//		return extent;
//		
//		
//		
//	}

	public static ExtentReports getReportObject() {
		String path = System.getProperty("user.dir")+"\\reports\\intex.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Autoamtion Result");  // sets name of the report
		reporter.config().setDocumentTitle("Test Results");     // sets name of tab
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA", "Afreen Khan");
		extent.createTest(path);    //this code will go in listner class (start test)
		return extent;
		//return null;
	}

	

	

	



	

	
}

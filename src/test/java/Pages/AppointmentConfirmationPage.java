package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentConfirmationPage {

	WebDriver driver;
	public AppointmentConfirmationPage(WebDriver driver) {

		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[contains(text(),'Appointment Confirmation')]")
	WebElement AppointmentConfirmationHeader;
		
	@FindBy(css="#facility")
	static WebElement facilityText;

	@FindBy(css="#hospital_readmission")
	static WebElement readmissionText;
	
	@FindBy(css="#program")
	static WebElement programText;
	
	@FindBy(id="visit_dat")/// making change
	static WebElement dateText;
	
	@FindBy(css="#comment")
	static WebElement commentText;
	
	public String VerifyAppointmentHeader() {
		String text = AppointmentConfirmationHeader.getText();
		return text;
	}
	
	public static String VerifyfacilityText() {
		String text = facilityText.getText();
		return text;
	}
	
	public static String VerifyreadmissionText() {
		String text = readmissionText.getText();
		return text;
	}
	
	public static String VerifyprogramText() {
		String text = programText.getText();
		return text;
	}
	public static String VerifyDateText() {
		String text = dateText.getText();
		return text;
	}
	public static String VerifycommentText() {
		String text = commentText.getText();
		return text;
	}
	
}

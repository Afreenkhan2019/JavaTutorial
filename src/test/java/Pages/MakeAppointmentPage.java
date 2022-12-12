package Pages;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class MakeAppointmentPage {
	WebDriver driver;
	public MakeAppointmentPage(WebDriver driver) {	

			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//h2[contains(text(),'Make Appointment')]")
	WebElement AppointmentTxt;
	
	@FindBy(id="combo_facility")
	WebElement DDLFacility;
	
	@FindBy(id="chk_hospotal_readmission")
	WebElement ckhboxReadmission;
	
	@FindBy(css=".radio-inline")
	List<WebElement> RadioButton_healthcareProgram;
	
	
	@FindBy(css=".glyphicon-calendar")
	WebElement calendarIcon;
	
	@FindBy(xpath="//th[@class='datepicker-switch']")
	WebElement calendarMonth;
	
	@FindBy(css="th.next")
	WebElement monthNextbtn;
	
	@FindBy(css=".day")
	List<WebElement> dates;
	
	@FindBy(id="txt_comment")
	WebElement txtComment;
	
	@FindBy(id="txt_visit_date")
	WebElement txtCalendar; 
	
	@FindBy(id="btn-book-appointment")
	WebElement btnBookAppointment;
	
	
	
	public String makeappointmentText() {		
		String txt=AppointmentTxt.getText();
		return txt;		
	}
	
//	public void selectFacility() {
//		Select Facility= new Select(DDLFacility);
//		Facility.selectByValue("Hongkong CURA Healthcare Center");
//		System.out.println(Facility.selectByValue("Hongkong CURA Healthcare Center"));
//	}
//	
	public void applyReadmission() {
		ckhboxReadmission.click();
	}
	public String healthcareProgram() {
		RadioButton_healthcareProgram.get(1).click();
		String txt= RadioButton_healthcareProgram.get(1).getText();
		return txt;
	}
	
	
	
	public String selectVisitDate() {
		String text=null;
		calendarIcon.click();
		while(!calendarMonth.getText().contains("May")) {
			monthNextbtn.click();
			}
			int count= dates.size();
			System.out.println(count);
			for(int i=0; i<count; i++) {
				 text=dates.get(i).getText();
				if(text.equalsIgnoreCase("29")) {
					dates.get(i).click();
					text=dates.get(i).getText();
					break;					
				}
				
			}
			System.out.println(text);
			return text;
		}
	
	public String enterComments() {
		//txtComment.isDisplayed();
		txtComment.sendKeys("I am entering the comment.");
		
		String comment = txtComment.getAttribute("value");
		return comment;
	}
	
	public void bookAppointment() {
		btnBookAppointment.click();		
	}
	
	public String facilityText() {	
		Select comboBox = new Select(DDLFacility);
		comboBox.selectByIndex(1);
		String txt=comboBox.getFirstSelectedOption().getText();
		return txt;		
	}
	public void verifyCkhboxReadmission() {		
		ckhboxReadmission.isSelected();				
	}
	public String healthcareProgramText() {		
		String txt=RadioButton_healthcareProgram.get(1).getText();
		System.out.println(txt);
		return txt;		
	}
	
//	public String commentText() {		
//		String txt=RadioButton_healthcareProgram.get(1).getText();
//		System.out.println(txt);
//		return txt;		
//	}

	

	public String calendarGetText() {
		//txtCalendar.isDisplayed();
		String text= txtCalendar.getAttribute("value");
		return text;
	}

	

	
}
	
//	List<WebElement> dates=driver.findElements(By.className("flatpickr-day"));
//	int count= driver.findElements(By.className("flatpickr-day")).size();
//	System.out.println(count);
//	for(int i=0; i<count;i++) {
//		
//		String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
//		
//		if(text.equalsIgnoreCase("29")) {
//			driver.findElements(By.className("flatpickr-day")).get(i).click();
//			break;
//		}				
//	}		
//	while (!driver.findElement(By.cssSelector(".flatpickr-current-month")).getText().contains("May"))
//	{
//		//1 month more adding to the code
//		driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
//	}


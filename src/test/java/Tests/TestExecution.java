package Tests;

import org.testng.annotations.Test;

import Pages.AppointmentConfirmationPage;
import Pages.MakeAppointmentPage;

import org.testng.Assert;
import Utility.BaseClass;

public class TestExecution extends BaseClass {
	
	@Test(priority =0)
	public void clickLandingPageButton() 
	{
		homePage.clickMakeAppointmentButton();
		String loginText= loginpage.loginText();
		Assert.assertEquals(loginText, "Login");
	}
	
	@Test(priority =1)
	public void validLogin()
	{		
		homePage.clickMakeAppointmentButton();
		String loginText= loginpage.loginText();
		Assert.assertEquals(loginText, "Login");		
		loginpage.login("John Doe", "ThisIsNotAPassword");
		String makeAppointmentHeader= makeAppointmentPage.makeappointmentText();
		Assert.assertEquals(makeAppointmentHeader, "Make Appointment");
	}
	@Test(priority =2)
	public void makeAppointment() 
	{
		homePage.clickMakeAppointmentButton();
		String loginText= loginpage.loginText();
		Assert.assertEquals(loginText, "Login");		
		loginpage.login("John Doe", "ThisIsNotAPassword");
		String makeAppointmentHeader= makeAppointmentPage.makeappointmentText();
		Assert.assertEquals(makeAppointmentHeader, "Make Appointment");
		
		String fac= makeAppointmentPage.facilityText();
		//System.out.println(fac);
		//String selectedComboValue = comboBox.getFirstSelectedOption().getText();
		makeAppointmentPage.applyReadmission();
		String hCareProg = makeAppointmentPage.healthcareProgram();
		makeAppointmentPage.selectVisitDate();
		String visitDate= makeAppointmentPage.calendarGetText();
		String comment = makeAppointmentPage.enterComments();
		makeAppointmentPage.bookAppointment();
		Assert.assertEquals(AppointmentConfirmationPage.VerifyfacilityText(), fac);
		Assert.assertEquals(AppointmentConfirmationPage.VerifyprogramText(), hCareProg);
		Assert.assertEquals(AppointmentConfirmationPage.VerifyDateText(), visitDate);
		Assert.assertEquals(AppointmentConfirmationPage.VerifycommentText(), comment);
	}

	

}

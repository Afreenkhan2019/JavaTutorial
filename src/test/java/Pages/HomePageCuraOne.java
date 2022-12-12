package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageCuraOne {
	WebDriver driver;

	public HomePageCuraOne(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="btn-make-appointment")
	WebElement btnMakeAppointment;
	
	public void clickMakeAppointmentButton() {
		
		btnMakeAppointment.click();
		
	}

	
}
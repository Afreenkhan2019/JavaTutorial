package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	
	public void verifylognPageOpenedorNot() {
		ElementFetch elementFetch = new ElementFetch();
		Assert.assertTrue(elementFetch.getListWebElements("XPATH",LoginPageElements.signinText).size()>0,"Login page did not open");
	}
	
	public void enterEmailid() {
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("ID", "ap_email").sendKeys("afreenkhan@gmail.com");
	}

}

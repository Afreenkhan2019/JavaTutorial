package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageCuraOne {
	WebDriver driver;
	public LoginPageCuraOne(WebDriver driver) {	

			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//h2[contains(text(),'Login')]")
	WebElement LoginTxt;
	
	@FindBy(id="txt-username")
	WebElement txtuserName;
	
	@FindBy(id="txt-password")
	WebElement txtPassword;
	
	@FindBy(id="btn-login")
	WebElement btnLogin;
	
	public String loginText() {
		
		String  text= LoginTxt.getText();
		return text;
	}
	
	public void login(String uName, String pwd) 
	{
		txtuserName.sendKeys(uName);
		txtPassword.sendKeys(pwd);
		btnLogin.click();
		
	}
}



package DemoFramework.TestFramew;

import org.testng.annotations.Test;

import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;

public class SampleTest extends BaseTest{
	
	
	@Test
	public void sampleMethodForEmailEntering() {
		HomePageEvents hpe = new HomePageEvents();
		hpe.clickOnSignInButton();
		
		LoginPageEvents lpe = new LoginPageEvents();
		lpe.verifylognPageOpenedorNot();
		lpe.enterEmailid();
	}

}

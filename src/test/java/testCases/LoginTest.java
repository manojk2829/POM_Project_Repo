package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BasePages;
import pages.HomeLoginPage;
import pages.LaunchPage;
import pages.PasswordPage;
import pages.UserNamePage;

public class LoginTest extends BasePages{
	
	@Test
	public void login_Zoho() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		LaunchPage lp=new LaunchPage(dr);
		HomeLoginPage hp=lp.navigateHomePage();
		//hp.validateTitle("ZohoPage");
		UserNamePage un=hp.gotoLoginPage();
		PasswordPage pp=un.submitUserName("manojk2829@gmail.com");
		Thread.sleep(3000);
		pp.submitPassword("maurya@2829");
	}

}

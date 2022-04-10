package pages;

import org.openqa.selenium.WebDriver;

public class LaunchPage extends BasePages {
	public WebDriver dr;
	public LaunchPage(WebDriver dr){
		this.dr=dr;
	}
	
	public HomeLoginPage navigateHomePage(){
		dr.get("https://zoho.com/");
		return new HomeLoginPage(dr);
	}

}

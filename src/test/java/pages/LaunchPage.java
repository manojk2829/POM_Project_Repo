package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LaunchPage extends BasePages {
	
	public LaunchPage(WebDriver dr){
		this.dr=dr;
		PageFactory.initElements(dr,this);		
	}
	
	public HomeLoginPage navigateHomePage(){
		dr.get("https://zoho.com/");
		return new HomeLoginPage(dr);
		
	}

}

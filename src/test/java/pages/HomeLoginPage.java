package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeLoginPage  extends BasePages {
	
	public HomeLoginPage(WebDriver dr){
		this.dr=dr;
	}

	public UserNamePage gotoLoginPage(){
		dr.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		return new UserNamePage(dr);
	}
}

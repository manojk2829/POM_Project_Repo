package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserNamePage extends BasePages {	
	
	public UserNamePage(WebDriver dr){
		this.dr=dr;
	}
	
	public PasswordPage submitUserName(String username){
		dr.findElement(By.xpath("//input[@id='login_id']")).sendKeys(username);
		dr.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']")).click();
		return new PasswordPage(dr);
	}


}

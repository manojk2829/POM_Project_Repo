package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordPage extends BasePages {
	
	public PasswordPage(WebDriver dr){
		this.dr=dr;
	}
	
	public PasswordPage submitPassword(String pass){
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		dr.findElement(By.xpath("//button[@id='nextbtn']//span[contains(text(),'Sign in')]")).click();
		return new PasswordPage(dr);
	}

}

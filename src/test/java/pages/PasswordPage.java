package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage extends BasePages {
	
	@FindBy(xpath=Constent.enterPassword)
	WebElement enterPass;
	
	@FindBy(xpath=Constent.clickPass_Btn)
	WebElement clickPass_Btn;
	
	public PasswordPage(WebDriver dr){
		this.dr=dr;
		PageFactory.initElements(dr,this);
	}
	
	public PasswordPage submitPassword(String pass){
		enterPass.sendKeys(pass);
		clickPass_Btn.click();
		return new PasswordPage(dr);
	}

}

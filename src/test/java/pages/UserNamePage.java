package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserNamePage extends BasePages {
	
	
	@FindBy(xpath=Constent.enterUserName)
	WebElement enterUsername;
	
	@FindBy(xpath=Constent.nextBTN_Click)
	WebElement clickNext_Button;
	
	public UserNamePage(WebDriver dr){
		this.dr=dr;
		PageFactory.initElements(dr,this);
	}
	
	public PasswordPage submitUserName(String username){
		enterUsername.sendKeys(username);
		clickNext_Button.click();
		return new PasswordPage(dr);
		
	}


}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLoginPage extends BasePages {
	
	@FindBy(xpath=Constent.singInLink)
	WebElement singInLink;
	
	public HomeLoginPage(WebDriver dr){
		this.dr=dr;
		PageFactory.initElements(dr,this);
	}

	public UserNamePage gotoLoginPage(){
		singInLink.click();
		//dr.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		return new UserNamePage(dr);
		
	}
}

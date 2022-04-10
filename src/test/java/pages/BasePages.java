package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasePages {
	public WebDriver dr;
	public void validateTitle(String expectedTitle){
		Assert.assertEquals(dr.getTitle(), expectedTitle);
	}

}

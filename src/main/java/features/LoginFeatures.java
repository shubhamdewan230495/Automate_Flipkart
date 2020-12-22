package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.MainPage;

public class LoginFeatures {
	
	public void login(WebDriver driver,String loginnum,String loginpass)
	{
		MainPage mainpage=new MainPage(driver);
		mainpage.getMobileNumberTextbox().sendKeys(loginnum);;
		mainpage.getPasswordTextbox().sendKeys(loginpass);
	}

}

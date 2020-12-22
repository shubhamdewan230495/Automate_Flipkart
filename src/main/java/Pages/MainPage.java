package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class MainPage {

	@FindBy(linkText = "Login")
	private @Getter WebElement loginbutton;
	
	@FindBy(xpath = "//span[text()='Login']/ancestor::form/div[1]/input")
	private @Getter WebElement MobileNumberTextbox;
	
	@FindBy(xpath = "//span[text()='Login']/ancestor::form/div[2]/input")
	private @Getter WebElement PasswordTextbox;
	
	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

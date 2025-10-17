package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class HomePage extends BaseClass{

	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username") WebElement emaill;
	
	@FindBy(name = "password") WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']") WebElement login_BTN;
	
	
	public void email(String id) {
		emaill.sendKeys(id);
	}
	
	public void password(String pass) {
		password.sendKeys(pass);
	}
	
	public WebElement getLogin_BTN() {
		return login_BTN;
	}
	
}

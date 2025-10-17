package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class Pojo extends BaseClass{
		
	public Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email") WebElement email;
	@FindBy(id="pass") WebElement password;
	
	@FindBy(name = "login") WebElement submitBTN;
	
	public void email(String username){
		email.sendKeys(username);
	}
	
	public void password(String pass) {
		password.sendKeys(pass);
	}
	
	public void submitBTN() {
		submitBTN.click();
	}

}

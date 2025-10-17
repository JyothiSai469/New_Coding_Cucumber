package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class CreateAccoForFB extends BaseClass{
	
	public CreateAccoForFB() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "firstname") WebElement firstName;
	@FindBy(name = "lastname") WebElement lastName;
	public WebElement getFirstName() {
		return firstName;
	}
	
	public void lastName(String lastname) {
		lastName.sendKeys(lastname);

	}
}

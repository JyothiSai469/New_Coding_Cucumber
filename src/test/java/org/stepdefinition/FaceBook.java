package org.stepdefinition;

import org.pom.Pojo;

import Base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBook extends BaseClass{
	
	@Given("To Configure The Browser")
	public void to_Configure_The_Browser() {
		BrowserLanch();
		maxBrowser();
	}
	
	@When("TO Open The FaceBook Application")
	public void to_Open_The_FaceBook_Application() {
		loadUrl("https://www.facebook.com/");
	}

	@When("To Pass the Valid UserName On Email Field")
	public void to_Pass_the_Valid_UserName_On_Email_Field() {
		Pojo p = new Pojo();
		p.email("jyothisai@gmail.com");
	}

	@When("To Pass the Valid Password On Password Field")
	public void to_Pass_the_Valid_Password_On_Password_Field() {
		Pojo p = new Pojo();
		p.password("JyothiSai@123");	
	}

	@When("Click on Submit Button")
	public void click_on_Submit_Button() {
		Pojo p = new Pojo();
		p.submitBTN();
	}

	@Then("To Close the Application")
	public void to_Close_the_Application() {
		driver.quit();
	}

}

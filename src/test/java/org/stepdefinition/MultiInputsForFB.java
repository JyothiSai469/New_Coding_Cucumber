package org.stepdefinition;
import org.pom.Pojo;

import Base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MultiInputsForFB extends BaseClass{
	
	@Given("Open The Chrom Browser")
	public void openTheChromBrowser() {
	   BrowserLanch();
	   maxBrowser();
	}

	@Given("Get The Url")
	public void getTheUrl() {
		loadUrl("https://www.facebook.com/");
	   
	}
	@Given("Send The Multi {string} Inputs For MainID")
	public void sendTheMultiInputsForMainID(String id) {
	    Pojo p = new Pojo();
	    p.email(id);
	}

	@Given("Send The Multi {string} Inputs For Password")
	public void sendTheMultiInputsForPassword(String password) {
	    Pojo p = new Pojo();
	    p.password(password);
	}

	@Given("Click The Login The btn")
	public void clickTheLoginTheBtn() {
		Pojo p = new Pojo();
		p.submitBTN();
	}

	@When("Close The Tab")
	public void closeTheTab() {
		driver.quit();

	}


}

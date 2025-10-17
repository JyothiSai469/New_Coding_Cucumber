package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.pom.CreateAccoForFB;

import Base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccForWithHeader extends BaseClass{

	
	@Given("Launch The Browser For With Header Details")
	public void launchTheBrowserForWithHeaderDetails() {
		BrowserLanch();
		maxBrowser();
	}

	@When("Open The Face Book Create Account Url")
	public void openTheFaceBookCreateAccountUrl() {
	   loadUrl("https://www.facebook.com/r.php?entry_point=login");
	}

	@When("Enter The First Name For Create Account")
	public void enterTheFirstNameForCreateAccount(io.cucumber.datatable.DataTable dataTable) {
		CreateAccoForFB c = new CreateAccoForFB();
		WebElement firstName = c.getFirstName();
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		firstName.sendKeys(asMap.get("header_4"));
	}

	@When("Enter The Last Name for Create Account")
	public void enterTheLastNameForCreateAccount(io.cucumber.datatable.DataTable dataTable) {
		CreateAccoForFB c = new CreateAccoForFB();
		List<Map<String, String>> asMaps = dataTable.asMaps();
		c.lastName(asMaps.get(1).get("header_3"));
	}

	@Then("Close The Create Account Browser")
	public void closeTheCreateAccountBrowser() {
		driver.quit();
	}


}

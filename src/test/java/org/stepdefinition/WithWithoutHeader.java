package org.stepdefinition;

import java.util.List;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.pom.CreateAccoForFB;

import Base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WithWithoutHeader extends BaseClass{

	
	@Given("Launch The Browser For Account Creation")
	public void launchTheBrowserForAccountCreation() {
//		BrowserLanch();
//		maxBrowser();
	}
	
	@Then("Close The FaceBook Browser")
	public void closeTheFaceBookBrowser() {
	//	driver.quit();
	}

	@When("Open The FB Url")
	public void openTheFBUrl() {
		 loadUrl("https://www.facebook.com/r.php?entry_point=login");
	}

	@When("Enter The First Name WithOut Header")
	public void enterTheFirstNameWithOutHeader(io.cucumber.datatable.DataTable dataTable) {
		CreateAccoForFB c = new CreateAccoForFB();
		WebElement firstName = c.getFirstName();
		List<String> asList = dataTable.asList();
		firstName.sendKeys(asList.get(2));
	}

	@When("Enter The Last Name WithOut Header")
	public void enterTheLastNameWithOutHeader(io.cucumber.datatable.DataTable dataTable) {
		
		org.junit.Assert.assertTrue(false);
		
		CreateAccoForFB c = new CreateAccoForFB();
		List<List<String>> asLists = dataTable.asLists();
		c.lastName(asLists.get(1).get(2));
	}



	@When("Enter The First Name With Header")
	public void enterTheFirstNameWithHeader(io.cucumber.datatable.DataTable dataTable) {
		CreateAccoForFB c = new CreateAccoForFB();
		WebElement firstName = c.getFirstName();
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		firstName.sendKeys(asMap.get("header_4"));
	}

	@When("Enter The Last Name With Header")
	public void enterTheLastNameWithHeader(io.cucumber.datatable.DataTable dataTable) {
		CreateAccoForFB c = new CreateAccoForFB();
		List<Map<String, String>> asMaps = dataTable.asMaps();
		c.lastName(asMaps.get(1).get("header_3"));
	}
}
